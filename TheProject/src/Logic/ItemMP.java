package Logic;

import java.awt.Color;
import java.awt.Graphics;

public class ItemMP extends Item{
	public ItemMP(int x,int y,int z){
		super(x,y,z);
		hp = 5; // hp for ItemMP
		profit = 10; // profit for ItemMP
		
		/* fill code*/ itemImage = null;
	}
	
	@Override
	public void collected(PlayerStatus player) {
		if(!isCollected){
			player.increaseMP(profit);
			isCollected = true;
		}
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillOval(x, y, 30, 15);
		
	}
	
}
