package Logic;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import javax.swing.JComponent;

import Input.InputUtility;
import Main.Config;
import RandomUtility.RandomUtility;
import Render.IRenderable;
import Render.Resource;

public class AssistantB extends JComponent implements IRenderable,Pusheen{

	private int direction, speed,speedTemp, x, y;
	private int bulletType,counter,limit = 50;
	public boolean isUsingLazer,isMoving;
	//private boolean readyToAttack = false;
	
	public AssistantB(int x,int y,int speed){
		counter = 0;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.speedTemp = speed;
		this.isMoving = false; // filled code
		
		bulletType = 3; // assume
		direction = -1;
		
		isUsingLazer = false;
	}
	
	public Bullet attack(int xc, int yc){
		//if(InputUtility.isMouseLeftDown()){
		double directionX = (xc - x)/Math.hypot(xc - x, yc - y);
		double directionY = (yc - y)/Math.hypot(xc - x, yc - y);
		
		int speedX = RandomUtility.instance.random(5, 10);
		int speedY = RandomUtility.instance.random(5, 10);
		
		System.out.println("SPAWN BULLET at x = "+x + " y = "+y+" Type = "+bulletType);
			
		Bullet b;
			
			if(bulletType == 1){
				b = new Bullet(x, y, speedX, speedY, directionX, directionY, false);
				
			}
			else if(bulletType == 2){
				b = new FireBullet(x, y, speedX, speedY, directionX, directionY, false);
				
			}
			else{
				b = new PusheenBullet(x, y, speedX, speedY, directionX, directionY, false);
			}
			
			InputUtility.setMouseLeftDown(false);
			
			return b;
	}
	
	public void deadlyAttack(){
		// TODO fill code Deadly Attack
	}
	
	
	public void move(){
		
		if(InputUtility.getKeyPressed(KeyEvent.VK_RIGHT)&&InputUtility.getKeyPressed(KeyEvent.VK_LEFT)) {
			speed = 0;
			return;  
		}
		
		speed = speedTemp;
		if(InputUtility.getKeyPressed(KeyEvent.VK_LEFT) || InputUtility.getKeyPressed(KeyEvent.VK_A)){
			counter++;
			direction = -1;
			x += speed*direction;
			System.out.println("MOVE LEFT");
		}
		else if(InputUtility.getKeyPressed(KeyEvent.VK_RIGHT) || InputUtility.getKeyPressed(KeyEvent.VK_D)){
			direction = 1;
			x += speed*direction;
			System.out.println("MOVE RIGHT");
		}
		
		if(x <= 0) x = 0;
		else if(x>= Config.SCREEN_WIDTH) x = Config.SCREEN_WIDTH;
	}
	
	public boolean isCollideWith(Bullet b){
		// TODO fill code , when bullet is in the area of player
		return Math.abs(x+30 - b.x)<=30 && Math.abs(y+100 -b.y) <=100;
	}
	
	 public void paintComponent(Graphics2D g) {
	        super.paintComponent(g);
	        Resource.assistantB.paintIcon(this, g, x, y);
	        /*
	        else if(action==1) 
	        	 Resource.pusheenLeftRun.paintIcon(this, g, x, y);
	        else if(action==2) 
	        	 Resource.pusheenRightRun.paintIcon(this, g, x, y);
	        else if(action==3) 
	        	 Resource.pusheenDance.paintIcon(this, g, x, y);
	        */
		        
	        //((Object) g).drawIcon();
	    }
	
	@Override
	public void draw(Graphics g) {
		//g.drawImage(Resource.pusheenLeftStill,null,x,y);

		//g.setColor(Color.BLACK);
		//g.fillRect(x, y, 30, 100);
	}

	@Override
	public boolean isVisible() {
		return true;
	}

	@Override
	public int getZ() {
		//return Integer.MAX_VALUE; 
		return Integer.MIN_VALUE;
	}

	public int getBulletType() {
		return bulletType;
	}

	public void setBulletType(int bulletType) {
		this.bulletType = bulletType;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isMoving() {
		return isMoving;
	}

	public void setMoving(boolean isMoving) {
		this.isMoving = isMoving;
	}

}
