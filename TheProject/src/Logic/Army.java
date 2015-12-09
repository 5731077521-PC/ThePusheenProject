package Logic;

import java.awt.Color;
import java.awt.Graphics;

public class Army extends Enemy {

	public Army(int x,int y,int z,int direction,int hp){
		super(x,y,z,direction,hp);
		speed = SPEED_ARMY;
		bulletType = 3; // big
		//System.out.pri
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(x, y, 50, 50);
	}

}
