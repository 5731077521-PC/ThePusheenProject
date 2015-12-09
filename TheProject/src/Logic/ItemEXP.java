package Logic;

import java.awt.Color;
import java.awt.Graphics;

public class ItemEXP extends Item{
	public ItemEXP(int x,int y,int z){
		super(x,y,z);
		hp = 10; // hp for ItemEXP
		profit = 7; // profit for ItemEXP
		
		/* fill code*/ itemImage = null;
	}
	
	@Override
	public void collected(PlayerStatus player) {
		if(!isCollected){
			player.increaseEXP(profit);
			isCollected = true;
		}
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, 30, 15);
		
	}
	
}
