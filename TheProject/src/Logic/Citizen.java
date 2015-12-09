package Logic;

import java.awt.Color;
import java.awt.Graphics;

import Main.Config;

public class Citizen extends Enemy{
	public Citizen(int x,int y,int z,int direction,int hp){
		super(x,y,z,direction,hp);
	}
	
	@Override
	public Bullet attack(int xc, int yc){
		return null;
	} // citizen won't attack, just run
	
	@Override
	public void move(){
		x += direction*speed;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(x, y, 5, 10);
	}

	@Override
	public boolean isVisible() {
		return x>=0 || x<= Config.SCREEN_WIDTH || !isDestroyed;
	}
	
}
