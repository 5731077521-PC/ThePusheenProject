package Logic;
//ediited by net
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import Main.Config;
import RandomUtility.RandomUtility;
import Render.Resource;

public class SuperHero extends Enemy {

	private int directionX, directionY;
	private int speedX, speedY;
	private static final int SPEEDX_HERO = 15, SPEEDY_HERO = 5;
	
	public SuperHero(int x,int y,int z,int directionX,int directionY, int hp){
		super(x, y, z, 0, hp);
		
		this.directionX = directionX;
		this.directionY = directionY;
		
		speedX = SPEEDX_HERO;
		speedY = SPEEDY_HERO;
		
		bulletType = 4; // lazer
	}
	
	@Override
	public void move(){
		if(movingDelayCount <= movingDelay) movingDelayCount++;
		else{
			x += directionX*speedX;
			y += directionY*speedY;
			
			if(x>=Config.SCREEN_WIDTH){
				x = Config.SCREEN_WIDTH;
			}
			else if(x<=0){
				x = 0;
			}
			
			if(y>=Config.SCREEN_HEIGHT){
				y = Config.SCREEN_HEIGHT;
			}
			else if(y<=0){
				y = 0;
			}
			
			directionX = RandomUtility.instance.random(0, 1) - 1; // change directionX randomly
			directionY = RandomUtility.instance.random(0, 1) - 1; // change directionY randomly
			
			movingDelayCount = 0;
			movingDelay = RandomUtility.instance.random(Config.ENEMY_ATTACK_DEALY_MIN, Config.ENEMY_ATTACK_DEALY_MAX);
		}
		
	}
	
	@Override
	public void draw(Graphics g) {
		/*
		g.setColor(Color.RED);
		g.fillRect(x, y, 50, 50); */
		Graphics2D g2 = (Graphics2D) g;
		if(directionX<0)
			g2.drawImage(Resource.heroALeft, null, x, y);
		else
			g2.drawImage(Resource.heroARight, null, x, y);


		
	}

}
