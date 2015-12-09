package Logic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import Main.Config;
import Render.IRenderable;

public class Building implements Destroyable, IRenderable{
	private int x;
	private int width, height;
	private int hp;	
	private Image bulidingImage;
	private boolean isDestroyed;
	
	public Building(){
		x = 0;
		width = 0;
		height = 0;
		bulidingImage = null;
		hp = MAX_P;
		isDestroyed = false;
	}
	
	public Building(int x, int width, int height, Image buildingImage){
		this.x = x;
		this.width = width;
		this.height = height;
		this.bulidingImage = buildingImage;
		hp = MAX_P;
		isDestroyed = false;
	}
	
	public boolean isCollideWith(Bullet b){
		return Math.abs(b.x-(x+width/2))<=width/2 && Math.abs(b.y-(getY()+height/2))<=height/2;
	}
	
	@Override
	public int getZ() {
		return 0;
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
		//g.drawImage(bulidingImage, x, Config.SCREEN_HEIGHT - height, width, height, null);
		g.setColor(Color.BLACK);
		g.fillRect(x, Config.SCREEN_HEIGHT - height, width+2, height+2);
		g.setColor(Color.DARK_GRAY);
		g.fillRect(x, Config.SCREEN_HEIGHT - height, width, height);
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
