package Logic;

import java.awt.Color;
import java.awt.Graphics;

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
		g.setColor(Color.RED);
		g.fillOval(x-radius, y-radius, 2*radius, 2*radius);
	}
	
}
