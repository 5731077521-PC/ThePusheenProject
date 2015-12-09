package Logic;

import java.awt.Color;
import java.awt.Graphics;

public class Police extends Enemy{
	public Police(int x,int y,int z,int direction,int hp){
		super(x,y,z,direction,hp);
		speed = SPEED_POLICE;
		bulletType = 1; // plain
	}
	
	@Override
	public void draw(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(x, y, 50, 50);
	}
	
}
