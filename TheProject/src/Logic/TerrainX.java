package Logic;

import java.awt.Image;

import Main.Config;
import RandomUtility.RandomUtility;
import Render.Resource;
//ediited by net
public class TerrainX extends Terrain{
	
	public static final int buildingCount = 37;
	public static Building[] buildings = new Building[buildingCount];  
	
	private double imageRatio = 0.5;
	private int shiftYfirstRow = Config.GROUND_OFFSET+30;
	private int shiftYsecondRow = Config.GROUND_OFFSET+40;
	private int shiftYthirdRow = Config.GROUND_OFFSET+25;
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
		buildings[0] = new Building(sumX  ,shiftYfirstRow,(int)(Resource.buildingSprite[56].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[56].getHeight()*imageRatio)  ,Resource.buildingSprite[56]);
		buildings[1] = new Building(sumX+=(int)(Resource.buildingSprite[56].getWidth()*imageRatio)  ,shiftYfirstRow,  (int)(Resource.buildingSprite[63].getWidth()*imageRatio),  (int)(Resource.buildingSprite[63].getHeight()*imageRatio),  Resource.buildingSprite[63]);
		buildings[2] = new Building(sumX+=(int)(Resource.buildingSprite[63].getWidth()*imageRatio)  ,shiftYfirstRow,  (int)(Resource.buildingSprite[52].getWidth()*imageRatio),  (int)(Resource.buildingSprite[52].getHeight()*imageRatio),  Resource.buildingSprite[52]);
		buildings[3] = new Building(sumX+=(int)(Resource.buildingSprite[52].getWidth()*imageRatio)  ,shiftYfirstRow,  (int)(Resource.buildingSprite[59].getWidth()*imageRatio),  (int)(Resource.buildingSprite[59].getHeight()*imageRatio),  Resource.buildingSprite[59]);
		buildings[4] = new Building(sumX+=(int)(Resource.buildingSprite[59].getWidth()*imageRatio)  ,shiftYfirstRow,  (int)(Resource.buildingSprite[48].getWidth()*imageRatio),  (int)(Resource.buildingSprite[48].getHeight()*imageRatio),  Resource.buildingSprite[48]);
		buildings[5] = new Building(sumX+=(int)(Resource.buildingSprite[48].getWidth()*imageRatio)  ,shiftYfirstRow,  (int)(Resource.buildingSprite[58].getWidth()*imageRatio),  (int)(Resource.buildingSprite[58].getHeight()*imageRatio),  Resource.buildingSprite[58]);
		buildings[6] = new Building(sumX+=(int)(Resource.buildingSprite[58].getWidth()*imageRatio)  ,shiftYfirstRow,  (int)(Resource.buildingSprite[53].getWidth()*imageRatio),  (int)(Resource.buildingSprite[53].getHeight()*imageRatio),  Resource.buildingSprite[53]);
		buildings[7] = new Building(sumX+=(int)(Resource.buildingSprite[53].getWidth()*imageRatio)  ,shiftYfirstRow,  (int)(Resource.buildingSprite[53].getWidth()*imageRatio),  (int)(Resource.buildingSprite[53].getHeight()*imageRatio),  Resource.buildingSprite[53]);
		buildings[8] = new Building(sumX+=(int)(Resource.buildingSprite[53].getWidth()*imageRatio)  ,shiftYfirstRow,  (int)(Resource.buildingSprite[54].getWidth()*imageRatio),  (int)(Resource.buildingSprite[54].getHeight()*imageRatio),  Resource.buildingSprite[54]);
		buildings[9] = new Building(sumX+=(int)(Resource.buildingSprite[54].getWidth()*imageRatio)  ,shiftYfirstRow,  (int)(Resource.buildingSprite[48].getWidth()*imageRatio),  (int)(Resource.buildingSprite[48].getHeight()*imageRatio),  Resource.buildingSprite[48]);
		buildings[10] = new Building(sumX+=(int)(Resource.buildingSprite[48].getWidth()*imageRatio) ,shiftYfirstRow,  (int)(Resource.buildingSprite[63].getWidth()*imageRatio),  (int)(Resource.buildingSprite[63].getHeight()*imageRatio),  Resource.buildingSprite[63]);
		buildings[11] = new Building(sumX+=(int)(Resource.buildingSprite[63].getWidth()*imageRatio)  ,shiftYfirstRow,  (int)(Resource.buildingSprite[59].getWidth()*imageRatio),  (int)(Resource.buildingSprite[59].getHeight()*imageRatio),  Resource.buildingSprite[59]);
		buildings[12] = new Building(sumX+=(int)(Resource.buildingSprite[59].getWidth()*imageRatio)  ,shiftYfirstRow,  (int)(Resource.buildingSprite[48].getWidth()*imageRatio),  (int)(Resource.buildingSprite[48].getHeight()*imageRatio),  Resource.buildingSprite[48]);
		buildings[13] = new Building(sumX+=(int)(Resource.buildingSprite[48].getWidth()*imageRatio)+25  ,shiftYfirstRow,  (int)(Resource.buildingSprite[56].getWidth()*imageRatio),  (int)(Resource.buildingSprite[56].getHeight()*imageRatio),  Resource.buildingSprite[56]);

		sumX = 0;
		
		buildings[14] = new Building(sumX  ,shiftYsecondRow,  (int)(Resource.buildingSprite[47].getWidth()*imageRatio),  (int)(Resource.buildingSprite[47].getHeight()*imageRatio),  Resource.buildingSprite[47]);
		buildings[15] = new Building(sumX+=(int)(Resource.buildingSprite[47].getWidth()*imageRatio)  ,shiftYsecondRow,  (int)(Resource.buildingSprite[54].getWidth()*imageRatio),  (int)(Resource.buildingSprite[54].getHeight()*imageRatio),  Resource.buildingSprite[54]);
		buildings[16] = new Building(sumX+=(int)(Resource.buildingSprite[54].getWidth()*imageRatio)  ,shiftYsecondRow,  (int)(Resource.buildingSprite[55].getWidth()*imageRatio),  (int)(Resource.buildingSprite[55].getHeight()*imageRatio),  Resource.buildingSprite[55]);
		buildings[17] = new Building(sumX+=(int)(Resource.buildingSprite[55].getWidth()*imageRatio)  ,shiftYsecondRow,  (int)(Resource.buildingSprite[61].getWidth()*imageRatio),  (int)(Resource.buildingSprite[61].getHeight()*imageRatio),  Resource.buildingSprite[61]);
		buildings[18] = new Building(sumX+=(int)(Resource.buildingSprite[61].getWidth()*imageRatio)  ,shiftYsecondRow,  (int)(Resource.buildingSprite[59].getWidth()*imageRatio),  (int)(Resource.buildingSprite[59].getHeight()*imageRatio),  Resource.buildingSprite[59]);
		buildings[19] = new Building(sumX+=(int)(Resource.buildingSprite[59].getWidth()*imageRatio)  ,shiftYsecondRow,  (int)(Resource.buildingSprite[63].getWidth()*imageRatio),  (int)(Resource.buildingSprite[63].getHeight()*imageRatio),  Resource.buildingSprite[63]);
		buildings[20] = new Building(sumX+=(int)(Resource.buildingSprite[63].getWidth()*imageRatio)  ,shiftYsecondRow,  (int)(Resource.buildingSprite[57].getWidth()*imageRatio),  (int)(Resource.buildingSprite[57].getHeight()*imageRatio),  Resource.buildingSprite[57]);
		buildings[21] = new Building(sumX+=(int)(Resource.buildingSprite[57].getWidth()*imageRatio)  ,shiftYsecondRow,  (int)(Resource.buildingSprite[59].getWidth()*imageRatio),  (int)(Resource.buildingSprite[59].getHeight()*imageRatio),  Resource.buildingSprite[59]);
		buildings[22] = new Building(sumX+=(int)(Resource.buildingSprite[41].getWidth()*imageRatio)  ,shiftYsecondRow,  (int)(Resource.buildingSprite[47].getWidth()*imageRatio),  (int)(Resource.buildingSprite[47].getHeight()*imageRatio),  Resource.buildingSprite[47]);
		buildings[23] = new Building(sumX+=(int)(Resource.buildingSprite[47].getWidth()*imageRatio)  ,shiftYsecondRow,  (int)(Resource.buildingSprite[63].getWidth()*imageRatio),  (int)(Resource.buildingSprite[63].getHeight()*imageRatio),  Resource.buildingSprite[63]);
		buildings[24] = new Building(sumX+=(int)(Resource.buildingSprite[63].getWidth()*imageRatio)  ,shiftYsecondRow,  (int)(Resource.buildingSprite[54].getWidth()*imageRatio),  (int)(Resource.buildingSprite[54].getHeight()*imageRatio),  Resource.buildingSprite[54]);
		buildings[25] = new Building(sumX+=(int)(Resource.buildingSprite[54].getWidth()*imageRatio)  ,shiftYsecondRow,  (int)(Resource.buildingSprite[59].getWidth()*imageRatio),  (int)(Resource.buildingSprite[59].getHeight()*imageRatio),  Resource.buildingSprite[59]);
		buildings[26] = new Building(sumX+=(int)(Resource.buildingSprite[51].getWidth()*imageRatio)  ,shiftYsecondRow,  (int)(Resource.buildingSprite[64].getWidth()*imageRatio),  (int)(Resource.buildingSprite[64].getHeight()*imageRatio),  Resource.buildingSprite[64]);

		sumX = 0;
		//buildings[26] = new Building(sumX  ,shiftYthirdRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[27] = new Building(sumX  ,shiftYthirdRow,  (int)(Resource.buildingSprite[46].getWidth()*imageRatio),  (int)(Resource.buildingSprite[46].getHeight()*imageRatio),  Resource.buildingSprite[46]);
		buildings[28] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+40  ,shiftYthirdRow,  (int)(Resource.buildingSprite[46].getWidth()*imageRatio),  (int)(Resource.buildingSprite[46].getHeight()*imageRatio),  Resource.buildingSprite[46]);
		buildings[29] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+40  ,shiftYthirdRow,  (int)(Resource.buildingSprite[46].getWidth()*imageRatio),  (int)(Resource.buildingSprite[46].getHeight()*imageRatio),  Resource.buildingSprite[46]);
		buildings[30] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+40  ,shiftYthirdRow,  (int)(Resource.buildingSprite[46].getWidth()*imageRatio),  (int)(Resource.buildingSprite[46].getHeight()*imageRatio),  Resource.buildingSprite[46]);
		buildings[31] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+40  ,shiftYthirdRow,  (int)(Resource.buildingSprite[46].getWidth()*imageRatio),  (int)(Resource.buildingSprite[46].getHeight()*imageRatio),  Resource.buildingSprite[46]);
		buildings[32] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+40  ,shiftYthirdRow,  (int)(Resource.buildingSprite[46].getWidth()*imageRatio),  (int)(Resource.buildingSprite[46].getHeight()*imageRatio),  Resource.buildingSprite[46]);
		buildings[33] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+40  ,shiftYthirdRow,  (int)(Resource.buildingSprite[46].getWidth()*imageRatio),  (int)(Resource.buildingSprite[46].getHeight()*imageRatio),  Resource.buildingSprite[46]);
		buildings[34] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+40  ,shiftYthirdRow,  (int)(Resource.buildingSprite[46].getWidth()*imageRatio),  (int)(Resource.buildingSprite[46].getHeight()*imageRatio),  Resource.buildingSprite[46]);
		buildings[35] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+40  ,shiftYthirdRow,  (int)(Resource.buildingSprite[46].getWidth()*imageRatio),  (int)(Resource.buildingSprite[46].getHeight()*imageRatio),  Resource.buildingSprite[46]);
		buildings[36] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+40  ,shiftYthirdRow,  (int)(Resource.buildingSprite[46].getWidth()*imageRatio),  (int)(Resource.buildingSprite[46].getHeight()*imageRatio),  Resource.buildingSprite[46]);


	}  
	
	
	
	public void drawBuildings(){
		
	}
}
