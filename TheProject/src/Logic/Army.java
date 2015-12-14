package Logic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import Render.Resource;
//ediited by net
public class Army extends Enemy {

	public Army(int x,int y,int z,int direction,int hp){
		super(x,y,z+1,direction,hp);
		speed = SPEED_ARMY;
		bulletType = 3; // big
		//System.out.pri
	}
	
	@Override
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
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
		if(direction<0)
			g2.drawImage(Resource.tankLeft, null, x, y);
		else
			g2.drawImage(Resource.tankRight, null, x, y);

		//g.setColor(Color.GREEN);
		//g.fillRect(x, y, 50, 50);
	}

}
