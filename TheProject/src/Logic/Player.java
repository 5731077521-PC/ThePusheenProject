package Logic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import Input.InputUtility;
import Main.Config;
import RandomUtility.RandomUtility;
import Render.IRenderable;

public class Player implements IRenderable{

	private int direction, speed, x, y;
	private int bulletType;
	public boolean isUsingLazer;
	//private boolean readyToAttack = false;
	
	public Player(int x,int y,int speed){
		this.x = x;
		this.y = y;
		this.speed = speed;
		
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
				b = new LazerBullet(x, y, speedX, speedY, directionX, directionY, false);
			}
			
			InputUtility.setMouseLeftDown(false);
			
			return b;
	}
	
	public void deadlyAttack(){
		// TODO fill code Deadly Attack
	}
	
	public void move(){
		if(InputUtility.getKeyPressed(KeyEvent.VK_LEFT) || InputUtility.getKeyPressed(KeyEvent.VK_A)){
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
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, 30, 100);
	}

	@Override
	public boolean isVisible() {
		return true;
	}

	@Override
	public int getZ() {
		return Integer.MAX_VALUE; 
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

}
