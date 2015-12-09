package Logic;

import java.awt.Image;

import Main.Config;
import RandomUtility.RandomUtility;

public class TerrainX extends Terrain{
	public TerrainX(Image backgroundImage){
		super(backgroundImage);
		for(int i=0;i<buildingCount;i++){
			int height = RandomUtility.instance.random(100, 200);
			bulidings[i] = new Building((i-1)*Config.STATUSBAR_WIDTH/buildingCount+1, Config.STATUSBAR_WIDTH/buildingCount, height, null);
		}
	}
	
	public void drawBuildings(){
		
	}
}
