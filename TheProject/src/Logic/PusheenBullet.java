package Logic;

import java.awt.Graphics;

import Render.Resource;

public class PusheenBullet extends Bullet{

	public PusheenBullet(int x, int y, int speedX, int speedY, double directionX, double directionY, boolean isEnemy) {
		super(x, y, speedX, speedY, directionX, directionY, isEnemy);
		

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
			g.drawImage(Resource.fireBlue_left, x, y, Resource.fireBlue_left.getWidth(), Resource.fireBlue_left.getHeight(), null);
		else
			g.drawImage(Resource.fireBlue_right, x, y, Resource.fireBlue_right.getWidth(), Resource.fireBlue_right.getHeight(), null);

	}

}
