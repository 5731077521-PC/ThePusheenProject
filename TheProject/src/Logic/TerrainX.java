package Logic;

import java.awt.Image;

import Main.Config;
import RandomUtility.RandomUtility;
import Render.Resource;
//ediited by net
public class TerrainX extends Terrain{
	
	public static final int buildingCount = 23;
	public static Building[] buildings = new Building[buildingCount];  
	
	private double imageRatio = 0.5;
	private int shiftYfirstRow = 25;
	private int shiftYsecondRow = 60;
	private int sumX;
	
	public TerrainX(Image backgroundImage){
		super(backgroundImage);
		//////////////////// don't forget to adjust building count!!!
		// add building to array of building
		
		/*
		for(int i=0;i<buildingCount;i++){
			int height = RandomUtility.instance.random(100, 200);
			bulidings[i] = new Building((i-1)*Config.STATUSBAR_WIDTH/buildingCount+1, Config.STATUSBAR_WIDTH/buildingCount, height, null);
		} 
		*/
		
		sumX = 0;
		buildings[0] = new Building(sumX  ,shiftYfirstRow,(int)(Resource.buildingSprite[5].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[5].getHeight()*imageRatio)  ,Resource.buildingSprite[5]);
		buildings[1] = new Building(sumX+=(int)(Resource.buildingSprite[1].getWidth()*imageRatio)+25  ,shiftYfirstRow,  (int)(Resource.buildingSprite[1].getWidth()*imageRatio),  (int)(Resource.buildingSprite[1].getHeight()*imageRatio),  Resource.buildingSprite[1]);
		buildings[2] = new Building(sumX+=(int)(Resource.buildingSprite[3].getWidth()*imageRatio)  ,shiftYfirstRow,  (int)(Resource.buildingSprite[3].getWidth()*imageRatio),  (int)(Resource.buildingSprite[3].getHeight()*imageRatio),  Resource.buildingSprite[3]);
		buildings[3] = new Building(sumX+=(int)(Resource.buildingSprite[10].getWidth()*imageRatio)-10  ,shiftYfirstRow,  (int)(Resource.buildingSprite[10].getWidth()*imageRatio),  (int)(Resource.buildingSprite[10].getHeight()*imageRatio),  Resource.buildingSprite[10]);
		buildings[4] = new Building(sumX+=(int)(Resource.buildingSprite[11].getWidth()*imageRatio)+20  ,shiftYfirstRow,  (int)(Resource.buildingSprite[11].getWidth()*imageRatio),  (int)(Resource.buildingSprite[11].getHeight()*imageRatio),  Resource.buildingSprite[11]);
		buildings[5] = new Building(sumX+=(int)(Resource.buildingSprite[18].getWidth()*imageRatio)-25  ,shiftYfirstRow,  (int)(Resource.buildingSprite[18].getWidth()*imageRatio),  (int)(Resource.buildingSprite[18].getHeight()*imageRatio),  Resource.buildingSprite[18]);
		buildings[6] = new Building(sumX+=(int)(Resource.buildingSprite[15].getWidth()*imageRatio)-10  ,shiftYfirstRow,  (int)(Resource.buildingSprite[15].getWidth()*imageRatio),  (int)(Resource.buildingSprite[15].getHeight()*imageRatio),  Resource.buildingSprite[15]);
		buildings[7] = new Building(sumX+=(int)(Resource.buildingSprite[3].getWidth()*imageRatio)+30  ,shiftYfirstRow,  (int)(Resource.buildingSprite[3].getWidth()*imageRatio),  (int)(Resource.buildingSprite[3].getHeight()*imageRatio),  Resource.buildingSprite[3]);
		buildings[8] = new Building(sumX+=(int)(Resource.buildingSprite[24].getWidth()*imageRatio)-10  ,shiftYfirstRow,  (int)(Resource.buildingSprite[24].getWidth()*imageRatio),  (int)(Resource.buildingSprite[24].getHeight()*imageRatio),  Resource.buildingSprite[24]);
		buildings[9] = new Building(sumX+=(int)(Resource.buildingSprite[2].getWidth()*imageRatio)-15  ,shiftYfirstRow,  (int)(Resource.buildingSprite[2].getWidth()*imageRatio),  (int)(Resource.buildingSprite[2].getHeight()*imageRatio),  Resource.buildingSprite[2]);
		buildings[10] = new Building(sumX+=(int)(Resource.buildingSprite[10].getWidth()*imageRatio)+5  ,shiftYfirstRow,  (int)(Resource.buildingSprite[10].getWidth()*imageRatio),  (int)(Resource.buildingSprite[10].getHeight()*imageRatio),  Resource.buildingSprite[10]);
		buildings[11] = new Building(sumX+=(int)(Resource.buildingSprite[27].getWidth()*imageRatio)+5  ,shiftYfirstRow,  (int)(Resource.buildingSprite[27].getWidth()*imageRatio),  (int)(Resource.buildingSprite[27].getHeight()*imageRatio),  Resource.buildingSprite[27]);
		buildings[12] = new Building(sumX+=(int)(Resource.buildingSprite[4].getWidth()*imageRatio)-25  ,shiftYfirstRow,  (int)(Resource.buildingSprite[4].getWidth()*imageRatio),  (int)(Resource.buildingSprite[4].getHeight()*imageRatio),  Resource.buildingSprite[4]);
		sumX = 0;
		buildings[13] = new Building(sumX+=(int)(Resource.buildingSprite[25].getWidth()*imageRatio)-80  ,shiftYsecondRow,  (int)(Resource.buildingSprite[25].getWidth()*imageRatio),  (int)(Resource.buildingSprite[25].getHeight()*imageRatio),  Resource.buildingSprite[25]);
		buildings[14] = new Building(sumX+=(int)(Resource.buildingSprite[15].getWidth()*imageRatio)  ,shiftYsecondRow,  (int)(Resource.buildingSprite[15].getWidth()*imageRatio),  (int)(Resource.buildingSprite[15].getHeight()*imageRatio),  Resource.buildingSprite[15]);
		buildings[15] = new Building(sumX+=(int)(Resource.buildingSprite[22].getWidth()*imageRatio)-10  ,shiftYsecondRow,  (int)(Resource.buildingSprite[22].getWidth()*imageRatio),  (int)(Resource.buildingSprite[22].getHeight()*imageRatio),  Resource.buildingSprite[22]);
		buildings[16] = new Building(sumX+=(int)(Resource.buildingSprite[23].getWidth()*imageRatio)+20  ,shiftYsecondRow,  (int)(Resource.buildingSprite[23].getWidth()*imageRatio),  (int)(Resource.buildingSprite[23].getHeight()*imageRatio),  Resource.buildingSprite[23]);
		buildings[17] = new Building(sumX+=(int)(Resource.buildingSprite[3].getWidth()*imageRatio)+25  ,shiftYsecondRow,  (int)(Resource.buildingSprite[3].getWidth()*imageRatio),  (int)(Resource.buildingSprite[3].getHeight()*imageRatio),  Resource.buildingSprite[3]);
		buildings[18] = new Building(sumX+=(int)(Resource.buildingSprite[29].getWidth()*imageRatio)-95  ,shiftYsecondRow,  (int)(Resource.buildingSprite[29].getWidth()*imageRatio),  (int)(Resource.buildingSprite[29].getHeight()*imageRatio),  Resource.buildingSprite[29]);
		buildings[19] = new Building(sumX+=(int)(Resource.buildingSprite[9].getWidth()*imageRatio)+90  ,shiftYsecondRow,  (int)(Resource.buildingSprite[9].getWidth()*imageRatio),  (int)(Resource.buildingSprite[9].getHeight()*imageRatio),  Resource.buildingSprite[9]);
		buildings[20] = new Building(sumX+=(int)(Resource.buildingSprite[1].getWidth()*imageRatio)+30  ,shiftYsecondRow,  (int)(Resource.buildingSprite[1].getWidth()*imageRatio),  (int)(Resource.buildingSprite[1].getHeight()*imageRatio),  Resource.buildingSprite[1]);
		buildings[21] = new Building(sumX+=(int)(Resource.buildingSprite[25].getWidth()*imageRatio)-40  ,shiftYsecondRow,  (int)(Resource.buildingSprite[25].getWidth()*imageRatio),  (int)(Resource.buildingSprite[25].getHeight()*imageRatio),  Resource.buildingSprite[25]);
		buildings[22] = new Building(sumX+=(int)(Resource.buildingSprite[1].getWidth()*imageRatio)+50  ,shiftYsecondRow,  (int)(Resource.buildingSprite[1].getWidth()*imageRatio),  (int)(Resource.buildingSprite[1].getHeight()*imageRatio),  Resource.buildingSprite[1]);


	}  
	
	
	
	public void drawBuildings(){
		
	}
}
