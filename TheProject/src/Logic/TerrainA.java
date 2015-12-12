package Logic;
//ediited by net
import java.awt.Image;

import Render.Resource;

public class TerrainA extends Terrain{
	public static final int buildingCount = 23;
	public static Building[] buildings = new Building[buildingCount];  
	
	private double imageRatio = 0.5;
	private int shiftYfirstRow = 30;
	private int shiftYsecondRow = 60;
	private int sumX;

	public TerrainA(Image backgroundImage) {
		super(backgroundImage);
		// TODO Auto-generated constructor stub
		sumX = 0;
		buildings[0] = new Building(sumX  ,shiftYfirstRow,(int)(Resource.buildingSprite[13].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[13].getHeight()*imageRatio)  ,Resource.buildingSprite[13]);
		buildings[1] = new Building(sumX+=(int)(Resource.buildingSprite[0].getWidth()*imageRatio)-5  ,shiftYfirstRow,(int)(Resource.buildingSprite[0].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[0].getHeight()*imageRatio)  ,Resource.buildingSprite[0]);
		buildings[2] = new Building(sumX+=(int)(Resource.buildingSprite[24].getWidth()*imageRatio)+10  ,shiftYfirstRow,(int)(Resource.buildingSprite[24].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[24].getHeight()*imageRatio)  ,Resource.buildingSprite[24]);
		buildings[3] = new Building(sumX+=(int)(Resource.buildingSprite[30].getWidth()*imageRatio)+5  ,shiftYfirstRow,(int)(Resource.buildingSprite[30].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[30].getHeight()*imageRatio)  ,Resource.buildingSprite[30]);
		buildings[4] = new Building(sumX+=(int)(Resource.buildingSprite[32].getWidth()*imageRatio)-15  ,shiftYfirstRow,(int)(Resource.buildingSprite[32].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[32].getHeight()*imageRatio)  ,Resource.buildingSprite[32]);
		buildings[5] = new Building(sumX+=(int)(Resource.buildingSprite[28].getWidth()*imageRatio)+20  ,shiftYfirstRow,(int)(Resource.buildingSprite[28].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[28].getHeight()*imageRatio)  ,Resource.buildingSprite[28]);
		buildings[6] = new Building(sumX+=(int)(Resource.buildingSprite[1].getWidth()*imageRatio)+15  ,shiftYfirstRow,(int)(Resource.buildingSprite[1].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[1].getHeight()*imageRatio)  ,Resource.buildingSprite[1]);
		buildings[7] = new Building(sumX+=(int)(Resource.buildingSprite[19].getWidth()*imageRatio)-30  ,shiftYfirstRow,(int)(Resource.buildingSprite[19].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[19].getHeight()*imageRatio)  ,Resource.buildingSprite[19]);
		buildings[8] = new Building(sumX+=(int)(Resource.buildingSprite[33].getWidth()*imageRatio)+7  ,shiftYfirstRow,(int)(Resource.buildingSprite[33].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[33].getHeight()*imageRatio)  ,Resource.buildingSprite[33]);
		buildings[9] = new Building(sumX+=(int)(Resource.buildingSprite[21].getWidth()*imageRatio)+7  ,shiftYfirstRow,(int)(Resource.buildingSprite[21].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[21].getHeight()*imageRatio)  ,Resource.buildingSprite[21]);
		buildings[10] = new Building(sumX+=(int)(Resource.buildingSprite[13].getWidth()*imageRatio)+10  ,shiftYfirstRow,(int)(Resource.buildingSprite[13].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[13].getHeight()*imageRatio)  ,Resource.buildingSprite[13]);
		buildings[11] = new Building(sumX+=(int)(Resource.buildingSprite[30].getWidth()*imageRatio)+10  ,shiftYfirstRow,(int)(Resource.buildingSprite[30].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[30].getHeight()*imageRatio)  ,Resource.buildingSprite[30]);
		buildings[12] = new Building(sumX+=(int)(Resource.buildingSprite[17].getWidth()*imageRatio)+20  ,shiftYfirstRow,(int)(Resource.buildingSprite[17].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[17].getHeight()*imageRatio)  ,Resource.buildingSprite[17]);
		sumX = 0;
		buildings[13] = new Building(sumX+=(int)(Resource.buildingSprite[28].getWidth()*imageRatio)-50  ,shiftYsecondRow,(int)(Resource.buildingSprite[28].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[28].getHeight()*imageRatio)  ,Resource.buildingSprite[28]);
		buildings[14] = new Building(sumX+=(int)(Resource.buildingSprite[21].getWidth()*imageRatio)-10  ,shiftYsecondRow,(int)(Resource.buildingSprite[21].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[21].getHeight()*imageRatio)  ,Resource.buildingSprite[21]);
		buildings[15] = new Building(sumX+=(int)(Resource.buildingSprite[30].getWidth()*imageRatio)+20  ,shiftYsecondRow,(int)(Resource.buildingSprite[30].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[30].getHeight()*imageRatio)  ,Resource.buildingSprite[30]);
		buildings[16] = new Building(sumX+=(int)(Resource.buildingSprite[1].getWidth()*imageRatio)+15  ,shiftYsecondRow,(int)(Resource.buildingSprite[1].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[1].getHeight()*imageRatio)  ,Resource.buildingSprite[1]);
		buildings[17] = new Building(sumX+=(int)(Resource.buildingSprite[0].getWidth()*imageRatio)-30  ,shiftYsecondRow,(int)(Resource.buildingSprite[0].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[0].getHeight()*imageRatio)  ,Resource.buildingSprite[0]);
		buildings[18] = new Building(sumX+=(int)(Resource.buildingSprite[33].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[33].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[33].getHeight()*imageRatio)  ,Resource.buildingSprite[33]);
		buildings[19] = new Building(sumX+=(int)(Resource.buildingSprite[13].getWidth()*imageRatio)+10  ,shiftYsecondRow,(int)(Resource.buildingSprite[13].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[13].getHeight()*imageRatio)  ,Resource.buildingSprite[13]);
		buildings[20] = new Building(sumX+=(int)(Resource.buildingSprite[33].getWidth()*imageRatio)-15  ,shiftYsecondRow,(int)(Resource.buildingSprite[33].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[33].getHeight()*imageRatio)  ,Resource.buildingSprite[33]);
		buildings[21] = new Building(sumX+=(int)(Resource.buildingSprite[0].getWidth()*imageRatio)+10  ,shiftYsecondRow,(int)(Resource.buildingSprite[0].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[0].getHeight()*imageRatio)  ,Resource.buildingSprite[0]);
		buildings[22] = new Building(sumX+=(int)(Resource.buildingSprite[12].getWidth()*imageRatio)-15  ,shiftYsecondRow,(int)(Resource.buildingSprite[12].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[12].getHeight()*imageRatio)  ,Resource.buildingSprite[12]);
		//buildings[23] = new Building(sumX+=(int)(Resource.buildingSprite[11].getWidth()*imageRatio)+20  ,shiftYsecondRow,(int)(Resource.buildingSprite[11].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[11].getHeight()*imageRatio)  ,Resource.buildingSprite[11]);
		//buildings[24] = new Building(sumX+=(int)(Resource.buildingSprite[6].getWidth()*imageRatio)-20  ,shiftYsecondRow,(int)(Resource.buildingSprite[6].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[6].getHeight()*imageRatio)  ,Resource.buildingSprite[6]);


		
	}

	@Override
	public void drawBuildings() {
		// TODO Auto-generated method stub
		
	}

}
