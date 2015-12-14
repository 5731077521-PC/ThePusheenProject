package Logic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import Main.Config;
import Render.Resource;

public class Police extends Enemy{
	public Police(int x,int y,int z,int direction,int hp){
		super(x,y,z,direction,hp);
		speed = SPEED_POLICE;
		bulletType = 1; // plain
	}
	
	@Override
	public void draw(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		/*
		g.setColor(Color.BLUE);
		g.fillRect(x, y, 50, 50);
		*/
		if(direction<0)
			g2.drawImage(Resource.policeLeft, null, x, y+10 );
		else
			g2.drawImage(Resource.policeRight, null, x, y+10 );

	}
	
}
