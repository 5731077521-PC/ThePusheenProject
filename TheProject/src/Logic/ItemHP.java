package Logic;

import java.awt.Color;
import java.awt.Graphics;

public class ItemHP extends Item{
	public ItemHP(int x,int y,int z){
		super(x,y,z);
		hp = 1; // hp for ItemHP
		profit = 20; // PROFIT = increase HP for 20
		
		/* fill code*/ itemImage = null;
	}

	@Override
	public void collected(PlayerStatus player) {
		if(!isCollected){
			player.increaseHP(profit);
			isCollected = true;
		}
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.PINK);
		g.fillOval(x, y, 30, 15);
		
	}
	
}
