package Logic;

import java.awt.Color;
import java.awt.Graphics;

import Main.Config;
import Render.Resource;

public class LazerBullet extends Bullet{
	public LazerBullet(int x,int y, int speedX, int speedY, double directionX, double directionY, boolean isEnemy)
	{
		super(x,y,speedX,speedY,directionX,directionY,isEnemy);
		radius = RADIUS_LAZER;
		hp = HP_LAZER;
		damage = DAMAGE_LAZER;
	}
	
	@Override
	public void draw(Graphics g){
		/*
		g.setColor(Color.RED);
		g.fillOval(x-radius, y-radius, 2*radius, 2*radius);
		*/
		if(directionX<0)
			g.drawImage(Resource.fireOrange_left, x, y, Resource.fireOrange_left.getWidth(), Resource.fireOrange_left.getHeight(), null);
		else
			g.drawImage(Resource.fireOrange_right, x, y, Resource.fireOrange_right.getWidth(), Resource.fireOrange_right.getHeight(), null);

	}
	
}
