package Logic;

import java.awt.Image;

public abstract class Terrain{
	static final int buildingCount = 50;
	Building[] bulidings = new Building[buildingCount];
	Image backgroundImage;
	
	public Terrain(Image backgroundImage){
		this.backgroundImage = backgroundImage;
	}
	
	public abstract void drawBuildings();
}
