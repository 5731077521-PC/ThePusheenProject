package Logic;

import java.awt.Color;
import java.awt.Graphics;

public class FireBullet extends Bullet {
	
	public FireBullet(int x,int y,int speedX, int speedY, double directionX, double directionY, boolean isEnemy)
	{
		super(x,y,speedX,speedY,directionX,directionY,isEnemy);
		radius = RADIUS_FIRE;
		hp = HP_FIRE;
		damage = DAMAGE_FIRE;
	}
	
	@Override
	public void draw(Graphics g){
		g.setColor(Color.ORANGE);
		g.fillOval(x-radius, y-radius, 2*radius, 2*radius);
	}
}
