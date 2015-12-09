package Logic;

import java.awt.Color;
import java.awt.Graphics;

public class BigBullet extends Bullet{
	public BigBullet(int x,int y,int speedX, int speedY, double directionX, double directionY, boolean isEnemy)
	{
		super(x,y,speedX,speedY,directionX,directionY,isEnemy);
		radius = RADIUS_BIG;
		hp = HP_BIG;
		damage = DAMAGE_BIG;
	}
	
	@Override
	public void draw(Graphics g){
		g.setColor(Color.BLACK);
		g.fillOval(x-radius, y-radius, 2*radius, 2*radius);
	}
	
}
