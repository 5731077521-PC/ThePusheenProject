package Logic;

import java.awt.Color;
import java.awt.Graphics;

import Main.Config;
import RandomUtility.RandomUtility;
import Render.IRenderable;

public class Bullet implements IRenderable, Destroyable{

	protected int hp;
	protected static final int HP_PLAIN = 1, DAMAGE_PLAIN = 1;
	protected static final int HP_FIRE = 1, DAMAGE_FIRE = 5;
	protected static final int HP_BIG = 20, DAMAGE_BIG = 10;
	protected static final int HP_LAZER = 10000000, DAMAGE_LAZER = 15;
	protected static final int RADIUS_PLAIN = 10;
	protected static final int RADIUS_FIRE = 10;
	protected static final int RADIUS_BIG = 20;
	protected static final int RADIUS_LAZER = 15;
	
	protected int x, y;
	protected int radius;
	protected int speedX, speedY;
	protected double directionX, directionY;
	protected int damage;
	protected boolean isEnemy;
	protected boolean isDestroyed;
	
	public Bullet(int x,int y,int speedX, int speedY, double directionX, double directionY, boolean isEnemy){
		this.x = x;
		this.y = y;
		this.speedX = speedX;
		this.speedY = speedY;
		this.directionX = directionX;
		this.directionY = directionY;
		this.isEnemy = isEnemy;
		radius = RADIUS_PLAIN;
		hp = HP_PLAIN; // plainBullet
		damage = DAMAGE_PLAIN;
		isDestroyed = false;
	}
	
	public boolean isCollideWithBulletorItem(Destroyable obj){
		if(obj instanceof Bullet){
			Bullet b = (Bullet) obj;
			return Math.hypot(b.x - x, b.y - y) <= (b.radius + radius);
		}	
		else if(obj instanceof Item){
			Item i = (Item) obj;
			return Math.hypot(i.x - x, i.y - y) <= (i.radius + radius);
		}
		else
			return false;
	}
	
	public void move(){
	
			System.out.println("MOVE BULLET x="+x+" y="+y);
			
			x += directionX*speedX;
			y += directionY*speedY;
			
			System.out.println("Changes in x = "+directionX*speedX+" Changes in y="+directionY*speedY);
			System.out.println("BULLET MOVED x="+x+" y="+y);
	}
	
	public void hitPlayer(PlayerStatus p){
		if(isEnemy && !isDestroyed){
			p.decreaseHP(damage);
			decreaseHP(MAX_P);
		}
	}
	
	public void hitEnamy(Enemy e){
		if(!isEnemy && !isDestroyed){
			e.decreaseHP(damage);
			decreaseHP(MAX_P);
		}
	}
	
	public void hitBullet(Bullet b){
		if(!b.isEnemy && !isDestroyed){
			b.decreaseHP(this.damage);
			decreaseHP(b.damage);
		}
	}
	
	public void hitItem(Item i){
		if(!isEnemy && !isDestroyed){
			i.decreaseHP(MAX_P);
			decreaseHP(MAX_P); // make the Bullet be destroyed
		}
	}
	
	public void hitBuilding(Building blg){
		if(!isEnemy && !isDestroyed){
			blg.decreaseHP(damage);
			decreaseHP(MAX_P);
		}
	}
	
	public boolean isCollideWithEnemy(Bullet b){
		if(isEnemy && b.isEnemy) return false;
		else if(isEnemy && !b.isEnemy) return true;
		else if(!isEnemy && b.isEnemy) return true;
		else return false;
	}
	
	@Override
	public void decreaseHP(int decrease) {
		hp -= decrease;
		if(hp <= MIN_P) {
			hp = MIN_P;
			isDestroyed = true;
		}
	}

	@Override
	public boolean isDestroyed() {
		return isDestroyed || x<0 || x>Config.SCREEN_WIDTH || y<0 || y>Config.SCREEN_HEIGHT;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillOval(x-radius, y-radius, 2*radius, 2*radius);
		
	}

	@Override
	public boolean isVisible() {
		return !isDestroyed && !(x<0 || x>Config.SCREEN_WIDTH || y<0 || y>Config.SCREEN_HEIGHT);
	}

	@Override
	public int getZ() {
		return Integer.MAX_VALUE;
	}

	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}

	public int getRadius() {
		return radius;
	}

}
