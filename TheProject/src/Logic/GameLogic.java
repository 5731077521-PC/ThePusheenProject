package Logic;

import java.awt.event.KeyEvent;
import java.security.acl.Owner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

import Input.InputUtility;
import Logic.Destroyable;

import Logic.Enemy;
import Main.Config;
import RandomUtility.RandomUtility;
import Render.IRenderable;
import Render.RenderableHolder;

public class GameLogic {
	private PlayerStatus player;
	private Terrain terrain;
	private ArrayList<Destroyable> onScreenObject = new ArrayList<Destroyable>();
	/* NOTE on zCounter
	   zCounter is use for identify z of each Destroyable objects
	*/
	 
	private int zCounter = Integer.MIN_VALUE+1;
	private int nextEnemyCreationDelay; // creationDelay for next ENEMY spawn
	//private int nextItemCreationDelay; // creationDelay for next ITEM spawn
	private boolean readyToRender = false; //For dealing with synchronization issue
	
	ArrayList<Destroyable> destroyedList = new ArrayList<Destroyable>(); // List of destroyed Enemies or Buildings
	
	// Called before enter the game loop
	public synchronized void onStart(){
		player = new PlayerStatus(100, 0, 0);
		RenderableHolder.getInstance().add(player.getOwner());
		
		terrain = new TerrainX(null);
		for(int i=0;i<Terrain.buildingCount;i++){
			onScreenObject.add(terrain.bulidings[i]);
			RenderableHolder.getInstance().add(terrain.bulidings[i]);
		}
		
		
		nextEnemyCreationDelay = RandomUtility.instance.random(0, 100);
		//nextItemCreationDelay = RandomUtility.instance.random(0, 100);
		
		readyToRender = true;
	}
	
	public synchronized void onEnd(){
		onScreenObject.clear();
		readyToRender = false;
	}
	
	public void logicUpdate(){
		/*
		if(InputUtility.getKeyTriggered(KeyEvent.VK_ENTER)){ // Pause by Pressing ENTER
			player.setPause(!player.isPause());
		}
		*/
		//if(player.isPause()) return;
		
		// When hp of the player = MIN_P
		/*
		player.checkIsAlive();
		if(player.isDestroyed()){
			// TODO read the score
			// TODO go to gameover page
			return;
		}
		*/
		
		player.getOwner().move();
		
		Enemy e = createEnemies();
		if(e!=null)	{
			onScreenObject.add(e);  // create Enemies randomly
			RenderableHolder.getInstance().add(e);
		}
		
		// Shoot and grab
		if(InputUtility.isMouseLeftDown()){
			int xc = InputUtility.getMouseX();
			int yc = InputUtility.getMouseY();
			
			if(player.getOwner().isUsingLazer){
				int x = player.getOwner().getX();
				int y = player.getOwner().getY();
				LazerLine l =new LazerLine(x, y, xc, yc);
				onScreenObject.add(l);
				RenderableHolder.getInstance().add(l);
			}
			else{
				Bullet b = player.getOwner().attack(xc, yc);
				if(b!=null){
					System.out.println("PLAYER'S BULLET GOING TO x = "+ xc +" y = "+ yc);
					onScreenObject.add(b);
					RenderableHolder.getInstance().add(b);
				}
			}
		}
		
		// make enemies attack and move and bullets move and hit(Bullet and Items)
		
		ArrayList<Destroyable> addOns = new ArrayList<Destroyable>();	
			
		ListIterator<Destroyable> itr = onScreenObject.listIterator();	
		while(itr.hasNext()){
			Destroyable obj = itr.next();
			if(obj instanceof Enemy || obj instanceof Bullet) obj.move();
			
			if(obj instanceof Enemy && !(obj instanceof Citizen)){
				
				Bullet b = ((Enemy)obj).attack(player.getOwner().getX(), player.getOwner().getY());
				if(b!=null){
					addOns.add(b);
					RenderableHolder.getInstance().add(b);
				}	
			}
			
			if(obj instanceof Bullet){
				for(Destroyable b: onScreenObject){
					if(obj!=b){
						if(b instanceof Bullet && ((Bullet)b).isCollideWithBulletorItem(obj) && ((Bullet)b).isCollideWithEnemy((Bullet)obj)){
							((Bullet) obj).hitBullet((Bullet)b);
						}
						else if(b instanceof Item && ((Bullet) obj).isCollideWithBulletorItem(b) && !((Bullet) obj).isEnemy){
							((Bullet)obj).hitItem((Item)b);
							((Item)b).collected(player);
						}
					}
					
					if(b instanceof Enemy && ((Enemy)b).isCollideWith((Bullet)obj) && !((Bullet)obj).isEnemy){
						((Bullet) obj).hitEnamy((Enemy)b);
						player.increaseScore(((Bullet)obj).damage);
					}
					if(b instanceof Building && ((Building)b).isCollideWith((Bullet)obj) && !((Bullet)obj).isEnemy){
						((Bullet) obj).hitBuilding((Building)b);
						player.increaseScore(((Bullet)obj).damage);
					}			
				}
				
				if(player.getOwner().isCollideWith((Bullet)obj) && ((Bullet)obj).isEnemy){
					((Bullet) obj).hitPlayer(player);
				}
			}
			
			if(obj instanceof LazerLine){
				for(Destroyable b: onScreenObject){
					if(b instanceof Enemy || ((b instanceof Bullet && ((Bullet)b).isEnemy))){
						if(((LazerLine) obj).isCollideWith(b)){
							b.decreaseHP(((LazerLine) obj).getDamage());
						}
					}
				}
			}
			
		}
		onScreenObject.addAll(addOns);
		addOns.clear();
		
		createItems(); // create Item after destroy the Enemies randomly
		
		// remove in logically
		Iterator<Destroyable> itr1 = onScreenObject.iterator();
		while(itr1.hasNext()){
			Destroyable o = itr1.next();
			if(o.isDestroyed()){	
				if(o instanceof Enemy || o instanceof Building){
					destroyedList.add(o);
				}
				//System.out.println("REMOVE LOGICS: "+o.getClass().getName());
				itr1.remove();
			}
		}
		
		// remove in graphically
		Iterator<IRenderable> itr2 = RenderableHolder.getInstance().getIRenderableList().iterator();
		while(itr2.hasNext()){
			IRenderable ren = itr2.next();
			//System.out.println("Visisble: "+ren.isVisible());
			if(!ren.isVisible()){
				itr2.remove();
				System.out.println("REMOVE GRAPHICS: "+ren.getClass().getName());
			}
		}
	}
	
	private Enemy createEnemies(){
		Enemy e;
		if(nextEnemyCreationDelay > 0) {
			nextEnemyCreationDelay--;
			e = null;
		}
		else{
			nextEnemyCreationDelay = RandomUtility.instance.random(Config.ENEMY_CREATION_DELAY_MIN, Config.ENEMY_CREATION_DELAY_MAX);
			
			int rand = RandomUtility.instance.random(0, 100);
			int x = RandomUtility.instance.random(10, Config.SCREEN_WIDTH-10);
			int y = RandomUtility.instance.random(2,50);
			int directionX = RandomUtility.instance.random(0, 1);
			if(directionX==0) directionX = -1;
			int directionY = RandomUtility.instance.random(0, 1);
			if(directionY==0) directionY = -1;
			
			
			if(rand <= 40){ // create Police
				e = new Police(x, Config.SCREEN_HEIGHT/2, zCounter, directionX, Enemy.MAX_P);
				System.out.println("SPAWN New Police");
	
			}
			else if(rand <= 75){ // create Army
				e = new Army(x, Config.SCREEN_HEIGHT/2, zCounter, directionX, Enemy.MAX_P);
				System.out.println("SPAWN New Army");
			}
			else{ // create SuperHero
				e = new SuperHero(x, y, zCounter, directionX, directionY, Enemy.MAX_P);
				System.out.println("SPAWN New SuperHero");
			}
		}
		
		zCounter++;
		if(zCounter >= Integer.MAX_VALUE - 1){	
			zCounter = Integer.MIN_VALUE + 1;
		}
		
		return e;
	}
	
	private void createItems(){
		for(Destroyable obj: destroyedList){
			System.out.println("ITEMMMMMMMMMMMMMMMMMMMMMM");
			int rand = RandomUtility.instance.random(0, 1);
			int randType = RandomUtility.instance.random(0, 2);
			if(true){
				Item i;
				switch(randType){
					case 0: i = new ItemHP(obj.getX(), obj.getY(), 0); break;
					case 1: i = new ItemHP(obj.getX(), obj.getY(), 0); break;
					case 2: i = new ItemEXP(obj.getX(), obj.getY(), 0); break;
					default: i = null;
				}
				if(i!=null){
					System.out.println("ADD ITEM Type: "+(randType+1));
					onScreenObject.add(i);
					RenderableHolder.getInstance().add(i);
				}
			}
			
		}
		destroyedList.clear();
	}
}