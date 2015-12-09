package Logic;

import java.awt.Graphics;

import Main.Config;
import RandomUtility.RandomUtility;
import Render.IRenderable;

public abstract class Enemy implements IRenderable, Destroyable{
	protected int x,y,z,speed,direction;
	protected int bulletType; // 1 = PLAIN, 2 = FIRE, 3 = BIG, 4 = LAZER
	protected int hp;
	protected int attackDelayCount = 0, attackDelay;
	protected int movingDelayCount = 0, movingDelay;
	protected boolean isDestroyed;
	protected static final int SPEED_POLICE = 5, SPEED_ARMY = 8;
	
	public Enemy(int x,int y,int z,int direction,int hp){
		this.x = x;
		this.y = y;
		this.z = z;
		this.direction = direction;
		this.hp = hp;
		isDestroyed = false;
		attackDelay = RandomUtility.instance.random(Config.ENEMY_ATTACK_DEALY_MIN, Config.ENEMY_ATTACK_DEALY_MAX);
		movingDelay = RandomUtility.instance.random(Config.ENEMY_ATTACK_DEALY_MIN, Config.ENEMY_ATTACK_DEALY_MAX);
		//System.out.println("SPAWN Enemy movingDelay = "+movingDelay);
	}

	public boolean isCollideWith(Bullet b){
		//return (b.x - x)*(b.x - x) + (b.y - y)*(b.y - y) <= b.radius*b.radius ;
		return b.x >= x && b.x <= x + 50 && b.y >= y && b.y <= y + 50;
	}
	
	public void move(){
		if(movingDelayCount <= movingDelay) movingDelayCount++;
		else{
			x += direction*speed;
			if(x<=0) x=0;
			else if(x>=Config.SCREEN_WIDTH) x = Config.SCREEN_WIDTH;
			
			movingDelayCount = 0;
			movingDelay = RandomUtility.instance.random(Config.ENEMY_ATTACK_DEALY_MIN, Config.ENEMY_ATTACK_DEALY_MAX);
		}
		
	}
	
	public Bullet attack(int xc, int yc){
		if(attackDelayCount <= attackDelay) {
			attackDelayCount++;
			return null;
		}
		else{
			attackDelayCount = 0;
			attackDelay = RandomUtility.instance.random(Config.ENEMY_ATTACK_DEALY_MIN, Config.ENEMY_ATTACK_DEALY_MAX);
			
			int directionX = xc - x;
			if(directionX < 0) directionX = -1;
			else if(directionX > 0) directionX = 1;
			else directionX = 0;
			
			int directionY = yc - y;
			if(directionY < 0) directionY = -1;
			else if(directionY > 0) directionY = 1;
			else directionY = 0;
			
			int speedX = RandomUtility.instance.random(5, 10);
			int speedY = RandomUtility.instance.random(5, 10);
			
			Bullet b;
			
			if(this instanceof Police){
				b = new Bullet(x, y, speedX, speedY, directionX, directionY, true);
			}
			else if(this instanceof Army){
				b = new BigBullet(x, y, speedX, speedY, directionX, directionY, true);
			}
			else if(this instanceof SuperHero){
				b = new LazerBullet(x, y, speedX, speedY, directionX, directionY, true);
			}
			else b = null;
			System.out.println("ENEMY ATTACK: "+" "+this.getClass().toString()+" "+b.getClass().getName());
			return b;
		}		
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
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
		return isDestroyed;
	}

	@Override
	public abstract void draw(Graphics g);

	@Override
	public boolean isVisible() {
		return !isDestroyed;
	}

	@Override
	public int getZ() {
		return z;
	}
	
	
}
