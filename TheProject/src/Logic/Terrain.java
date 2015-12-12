package Logic;
//ediited by net
import java.awt.Image;

import Render.Resource;

public abstract class Terrain{
	// dont't for get to adjust building count!!!!
	/*
	static final int buildingCount = 5;
	public Building[] buildings = new Building[buildingCount];  */
	Image backgroundImage;
	
	public Terrain(Image backgroundImage){
		this.backgroundImage = backgroundImage;
	}
	
	public abstract void drawBuildings();
}
