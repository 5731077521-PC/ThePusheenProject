package Logic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import Render.Resource;
//ediited by net
public class Army extends Enemy {

	public Army(int x,int y,int z,int direction,int hp){
		super(x,y,z,direction,hp);
		speed = SPEED_ARMY;
		bulletType = 3; // big
		//System.out.pri
	}
	
	@Override
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(Resource.tankLeft, null, x, y);
		//g.setColor(Color.GREEN);
		//g.fillRect(x, y, 50, 50);
	}

}
