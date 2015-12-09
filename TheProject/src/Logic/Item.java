package Logic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import Render.IRenderable;

public abstract class Item implements Destroyable, IRenderable{

	protected int x,y,z;
	protected int radius;
	protected int profit; // differ PROFIT for each item type
	protected int hp; // differ HP for each item type
	protected boolean isCollected;
	protected Image itemImage; // differ Image for each item type
	
	public Item(int x,int y,int z /*,int radius,Image itemImage */){
		this.x = x;
		this.y = y;
		this.z = z;
		radius = 10; // set radius = 10 for all
		//this.itemImage = itemImage;
		isCollected = false;
	}
	
	public abstract void collected(PlayerStatus player);
	
	@Override
	public void decreaseHP(int decrease) {
		hp -= decrease;
		if(hp<=MIN_P) {
			hp = MIN_P;
			isCollected = true;
		}
	}

	@Override
	public boolean isDestroyed() {
		return !isCollected;
	}

	@Override
	public abstract void draw(Graphics g);

	@Override
	public boolean isVisible() {
		return !isDestroyed();
	}

	@Override
	public int getZ() {
		return z;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void move(){}
	
}
