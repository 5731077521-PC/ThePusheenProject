package Render;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class DrawingUtility {
	public static void drawCursor(int x, int y,Graphics g){
		int radius = 10;
		
		g.setColor(Color.RED);
		g.drawOval(x-radius, y-radius, 2*radius, 2*radius);
		g.drawOval(x-2*radius, y-2*radius, 4*radius, 4*radius);
		
		g.drawLine(x, y-2*radius-5, x, y+2*radius+5);
		g.drawLine(x-2*radius-5, y, x+2*radius+5, y);
	}
	
	public static void drawLazerLine(int x, int y,int xc, int yc,int i, Graphics2D g){
		double directionX = xc - x/Math.hypot(xc-x, yc-y);
		double directionY = yc - y/Math.hypot(xc-x, yc-y);
		
		g.setColor(Color.BLUE);
		g.setStroke(new BasicStroke(10));
		g.drawLine(x, y, i*(int)(x+directionX), i*(int)(y+directionY) );
	}
	
}
