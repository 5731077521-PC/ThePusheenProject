package Logic;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import Main.Config;
import Render.IRenderable;
import Render.Resource;
//ediited by net
public class Building implements Destroyable, IRenderable{
	private int x,shiftY;
	private int width, height,counter,fadeLimitTime = 5;
	private int hp;	
	private Image buildingImage;
	private boolean isDestroyed,isAttacked;
	protected static final AlphaComposite transcluentWhite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.9f);
	protected static final AlphaComposite opaque = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1);
	
	public Building(){
		x = 0;
		width = 0;
		height = 0;
		buildingImage = null;
		hp = MAX_P;
		isDestroyed = false;
	}
	
	public Building(int x, int shiftY, int width, int height, Image buildingImage){
		counter = 0;
		isAttacked = false;
		this.x = x;
		this.shiftY = shiftY;
		this.width = width;
		this.height = height;
		this.buildingImage = buildingImage;
		hp = MAX_P;
		isDestroyed = false;                                             
	}
	
	public boolean isCollideWith(Bullet b){
		isAttacked = Math.abs(b.x-(x+width/2))<=width/2 && Math.abs(b.y-(getY()+height/2))<=height/2;
		return isAttacked;
	}
	
	@Override
	public int getZ() {
		return 0-shiftY-1000;
	}

	@Override
	public void decreaseHP(int decrease) {
		//System.out.println("Damage Building: hp = "+hp);
		//isAttacked = true;
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
		Graphics2D g2 = (Graphics2D) g;

		//if(hp<(int)(0.8*MAX_P)) {
			// g2.setComposite(opaque);
		//}
		//set the opacity
		if(isAttacked) {
			g2.setComposite(transcluentWhite);
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
			counter++;
			if(counter>fadeLimitTime) {
				counter = 0;
				isAttacked = false;
			}
		}
		g2.drawImage(buildingImage, x, Config.SCREEN_HEIGHT-shiftY - height, width, height, null);
		
		
		counter++;	
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
