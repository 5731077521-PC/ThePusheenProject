package Logic;

import java.awt.Graphics;
import java.awt.Graphics2D;


import Render.DrawingUtility;
import Render.IRenderable;

public class LazerLine implements Destroyable, IRenderable{

	private int x,y,xc,yc;
	
	//private int[] cord = new int[1000];
	
	private int damage;
	private int length = 1;
	private boolean isDestroyed;
	
	public LazerLine(int x,int y,int xc,int yc){
		this.x = x;
		this.y = y;
		this.xc = xc;
		this.yc = yc;
		isDestroyed = false;
		damage = 20;
	}
	
	public boolean isCollideWith(Destroyable obj){
		return obj.getY() - yc - (yc-y)/(xc-x)*(obj.getX()-xc) <= 0.1 && obj.getY() - yc - (yc-y)/(xc-x)*(obj.getX()-xc) >= -0.1;
	}
	
	@Override
	public void draw(Graphics g) {
		DrawingUtility.drawLazerLine(x, y, xc, yc, length,(Graphics2D)g);
		length++;
	}

	@Override
	public boolean isVisible() {
		return !isDestroyed();
	}

	@Override
	public int getZ() {
		return Integer.MAX_VALUE-1;
	}

	@Override
	public void decreaseHP(int decrease) {}

	@Override
	public boolean isDestroyed() {
		return isDestroyed;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public void move() {}

	public int getDamage() {
		return damage;
	}
	
}
