package Logic;
//ediited by net
import java.awt.Image;

import Main.Config;
import Render.Resource;

public class TerrainA extends Terrain{
	public static final int buildingCount = 33;
	public static Building[] buildings = new Building[buildingCount];  
	
	private double imageRatio = 0.5;
	private int shiftYfirstRow = Config.GROUND_OFFSET+25;
	private int shiftYsecondRow = Config.GROUND_OFFSET+40;
	private int shiftYthirdRow = Config.GROUND_OFFSET+24;
	private int sumX;

	public TerrainA(Image backgroundImage) {
		super(backgroundImage);
		// TODO Auto-generated constructor stub
		sumX = 0;
		buildings[0] = new Building(sumX  ,shiftYsecondRow,(int)(Resource.buildingSprite[30].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[30].getHeight()*imageRatio)  ,Resource.buildingSprite[30]);
		buildings[1] = new Building(sumX+=(int)(Resource.buildingSprite[30].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[7].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[7].getHeight()*imageRatio)  ,Resource.buildingSprite[7]);
		buildings[2] = new Building(sumX+=(int)(Resource.buildingSprite[7].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[34].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[34].getHeight()*imageRatio)  ,Resource.buildingSprite[34]);
		buildings[3] = new Building(sumX+=(int)(Resource.buildingSprite[34].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[37].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[37].getHeight()*imageRatio)  ,Resource.buildingSprite[37]);
		buildings[4] = new Building(sumX+=(int)(Resource.buildingSprite[37].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[44].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[44].getHeight()*imageRatio)  ,Resource.buildingSprite[44]);
		buildings[5] = new Building(sumX+=(int)(Resource.buildingSprite[44].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[41].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[41].getHeight()*imageRatio)  ,Resource.buildingSprite[41]);
		buildings[6] = new Building(sumX+=(int)(Resource.buildingSprite[41].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[15].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[15].getHeight()*imageRatio)  ,Resource.buildingSprite[15]);
		buildings[7] = new Building(sumX+=(int)(Resource.buildingSprite[15].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[4].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[4].getHeight()*imageRatio)  ,Resource.buildingSprite[4]);
		buildings[8] = new Building(sumX+=(int)(Resource.buildingSprite[4].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[0].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[0].getHeight()*imageRatio)  ,Resource.buildingSprite[0]);
		buildings[9] = new Building(sumX+=(int)(Resource.buildingSprite[0].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[27].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[27].getHeight()*imageRatio)  ,Resource.buildingSprite[27]);
		buildings[10] = new Building(sumX+=(int)(Resource.buildingSprite[27].getWidth()*imageRatio)-3  ,shiftYsecondRow,(int)(Resource.buildingSprite[1].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[1].getHeight()*imageRatio)  ,Resource.buildingSprite[1]);
		
		sumX = 0;
		buildings[11] = new Building(sumX  ,shiftYfirstRow,(int)(Resource.buildingSprite[13].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[13].getHeight()*imageRatio)  ,Resource.buildingSprite[13]);
		buildings[12] = new Building(sumX+=(int)(Resource.buildingSprite[13].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[2].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[18].getHeight()*imageRatio)  ,Resource.buildingSprite[18]);
		buildings[13] = new Building(sumX+=(int)(Resource.buildingSprite[2].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[22].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[22].getHeight()*imageRatio)  ,Resource.buildingSprite[22]);
		buildings[14] = new Building(sumX+=(int)(Resource.buildingSprite[22].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[19].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[19].getHeight()*imageRatio)  ,Resource.buildingSprite[19]);
		buildings[15] = new Building(sumX+=(int)(Resource.buildingSprite[19].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[42].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[42].getHeight()*imageRatio)  ,Resource.buildingSprite[42]);
		buildings[16] = new Building(sumX+=(int)(Resource.buildingSprite[42].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[34].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[34].getHeight()*imageRatio)  ,Resource.buildingSprite[34]);
		buildings[17] = new Building(sumX+=(int)(Resource.buildingSprite[34].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[24].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[24].getHeight()*imageRatio)  ,Resource.buildingSprite[24]);
		buildings[18] = new Building(sumX+=(int)(Resource.buildingSprite[24].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[1].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[1].getHeight()*imageRatio)  ,Resource.buildingSprite[1]);
		buildings[19] = new Building(sumX+=(int)(Resource.buildingSprite[1].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[39].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[39].getHeight()*imageRatio)  ,Resource.buildingSprite[39]);
		buildings[20] = new Building(sumX+=(int)(Resource.buildingSprite[39].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[10].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[10].getHeight()*imageRatio)  ,Resource.buildingSprite[10]);
		buildings[21] = new Building(sumX+=(int)(Resource.buildingSprite[10].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[2].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[2].getHeight()*imageRatio)  ,Resource.buildingSprite[2]);
		buildings[22] = new Building(sumX+=(int)(Resource.buildingSprite[2].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[13].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[13].getHeight()*imageRatio)  ,Resource.buildingSprite[13]);
		
		sumX = 0;
		buildings[23] = new Building(sumX+40  ,shiftYthirdRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[24] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+85  ,shiftYthirdRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[25] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+50  ,shiftYthirdRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[26] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+40  ,shiftYthirdRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[27] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+25  ,shiftYthirdRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[28] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+15  ,shiftYthirdRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[29] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+20  ,shiftYthirdRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[30] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+30  ,shiftYthirdRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[31] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+25  ,shiftYthirdRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[32] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+25  ,shiftYthirdRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);

		
	}

	@Override
	public void drawBuildings() {
		// TODO Auto-generated method stub
		
	}

}
