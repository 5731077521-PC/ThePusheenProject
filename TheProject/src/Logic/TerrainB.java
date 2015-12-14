package Logic;

import java.awt.Image;

import Main.Config;
import Render.Resource;
//ediited by net
public class TerrainB extends Terrain {
	public static final int buildingCount = 36;
	public static Building[] buildings = new Building[buildingCount];  
	
	private double imageRatio = 0.5;
	private int shiftYfirstRow = Config.GROUND_OFFSET+30;
	private int shiftYsecondRow = Config.GROUND_OFFSET+40;
	private int shiftYthirdRow = Config.GROUND_OFFSET+25;
	private int sumX;
	public TerrainB(Image backgroundImage) {
		super(backgroundImage);
		// TODO Auto-generated constructor stub
		sumX = 0;
		buildings[0] = new Building(sumX  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[1] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)-5  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[2] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)-5  ,shiftYfirstRow,(int)(Resource.buildingSprite[31].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[31].getHeight()*imageRatio)  ,Resource.buildingSprite[31]);
		buildings[3] = new Building(sumX+=(int)(Resource.buildingSprite[31].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[8].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[8].getHeight()*imageRatio)  ,Resource.buildingSprite[8]);
		buildings[4] = new Building(sumX+=(int)(Resource.buildingSprite[8].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[5] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[6] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)-5  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[7] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)-5  ,shiftYfirstRow,(int)(Resource.buildingSprite[18].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[18].getHeight()*imageRatio)  ,Resource.buildingSprite[18]);
		buildings[8] = new Building(sumX+=(int)(Resource.buildingSprite[18].getWidth()*imageRatio)-5  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[9] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[23].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[23].getHeight()*imageRatio)  ,Resource.buildingSprite[23]);
		buildings[10] = new Building(sumX+=(int)(Resource.buildingSprite[23].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[22].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[22].getHeight()*imageRatio)  ,Resource.buildingSprite[22]);
		buildings[11] = new Building(sumX+=(int)(Resource.buildingSprite[22].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[18].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[18].getHeight()*imageRatio)  ,Resource.buildingSprite[18]);
		
		
		sumX = 0;
		buildings[12] = new Building(sumX  ,shiftYsecondRow,(int)(Resource.buildingSprite[5].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[5].getHeight()*imageRatio)  ,Resource.buildingSprite[5]);
		buildings[13] = new Building(sumX+=(int)(Resource.buildingSprite[5].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[14] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[15] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[16] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[10].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[10].getHeight()*imageRatio)  ,Resource.buildingSprite[10]);
		buildings[17] = new Building(sumX+=(int)(Resource.buildingSprite[10].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[18] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[19] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[22].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[22].getHeight()*imageRatio)  ,Resource.buildingSprite[22]);
		buildings[20] = new Building(sumX+=(int)(Resource.buildingSprite[22].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[21] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[9].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[9].getHeight()*imageRatio)  ,Resource.buildingSprite[9]);
		buildings[22] = new Building(sumX+=(int)(Resource.buildingSprite[9].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[16].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[16].getHeight()*imageRatio)  ,Resource.buildingSprite[16]);
		buildings[23] = new Building(sumX+=(int)(Resource.buildingSprite[16].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[24] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[25] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[26] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[27].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[27].getHeight()*imageRatio)  ,Resource.buildingSprite[27]);
		buildings[27] = new Building(sumX+=(int)(Resource.buildingSprite[27].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[28] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[7].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[7].getHeight()*imageRatio)  ,Resource.buildingSprite[7]);
		//buildings[31] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		
		sumX = 0;
		buildings[29] = new Building(sumX  ,shiftYthirdRow,(int)(Resource.buildingSprite[65].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[65].getHeight()*imageRatio)  ,Resource.buildingSprite[65]);
		buildings[30] = new Building(sumX+=(int)(Resource.buildingSprite[65].getWidth()*imageRatio)+90  ,shiftYthirdRow,(int)(Resource.buildingSprite[65].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[65].getHeight()*imageRatio)  ,Resource.buildingSprite[65]);
		buildings[31] = new Building(sumX+=(int)(Resource.buildingSprite[65].getWidth()*imageRatio)+60  ,shiftYthirdRow,(int)(Resource.buildingSprite[4].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[4].getHeight()*imageRatio)  ,Resource.buildingSprite[4]);
		buildings[32] = new Building(sumX+=(int)(Resource.buildingSprite[4].getWidth()*imageRatio)+80  ,shiftYthirdRow,(int)(Resource.buildingSprite[65].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[65].getHeight()*imageRatio)  ,Resource.buildingSprite[65]);
		buildings[33] = new Building(sumX+=(int)(Resource.buildingSprite[65].getWidth()*imageRatio)+50  ,shiftYthirdRow,(int)(Resource.buildingSprite[65].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[65].getHeight()*imageRatio)  ,Resource.buildingSprite[65]);
		buildings[34] = new Building(sumX+=(int)(Resource.buildingSprite[65].getWidth()*imageRatio)+50  ,shiftYthirdRow,(int)(Resource.buildingSprite[65].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[65].getHeight()*imageRatio)  ,Resource.buildingSprite[65]);
		buildings[35] = new Building(sumX+=(int)(Resource.buildingSprite[65].getWidth()*imageRatio)+50  ,shiftYthirdRow,(int)(Resource.buildingSprite[65].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[65].getHeight()*imageRatio)  ,Resource.buildingSprite[65]);

		
	}

	@Override
	public void drawBuildings() {
		// TODO Auto-generated method stub
		
	}

}
