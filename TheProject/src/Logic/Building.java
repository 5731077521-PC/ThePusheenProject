package Logic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import Main.Config;
import Render.IRenderable;
import Render.Resource;
//ediited by net
public class Building implements Destroyable, IRenderable{
	private int x,shiftY;
	private int width, height;
	private int hp;	
	private Image buildingImage;
	private boolean isDestroyed;
	
	public Building(){
		x = 0;
		width = 0;
		height = 0;
		buildingImage = null;
		hp = MAX_P;
		isDestroyed = false;
	}
	
	public Building(int x, int shiftY, int width, int height, Image buildingImage){
		this.x = x;
		this.shiftY = shiftY;
		this.width = width;
		this.height = height;
		this.buildingImage = buildingImage;
		hp = MAX_P;
		isDestroyed = false;
	}
	
	public boolean isCollideWith(Bullet b){
		return Math.abs(b.x-(x+width/2))<=width/2 && Math.abs(b.y-(getY()+height/2))<=height/2;
	}
	
	@Override
	public int getZ() {
		return 0-shiftY;
	}

	@Override
	public void decreaseHP(int decrease) {
		//System.out.println("Damage Building: hp = "+hp);
		hp -= decrease;
		if(hp<=MIN_P) {
			hp = MIN_P;
			isDestroyed = true;
		}
	}

	@Override
	public boolean isDestroyed() {
		return isDestroyed;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawImage(buildingImage, x, Config.SCREEN_HEIGHT-shiftY - height, width, height, null);
		/*
		g.setColor(Color.BLACK);
		g.fillRect(x, Config.SCREEN_HEIGHT - height, width+2, height+2);
		g.setColor(Color.DARK_GRAY);
		g.fillRect(x, Config.SCREEN_HEIGHT - height, width, height);
		*/
	}

	@Override
	public boolean isVisible() {
		return !isDestroyed;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return Config.SCREEN_HEIGHT - height;
	}
	
	public void move(){}

}
