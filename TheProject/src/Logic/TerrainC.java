package Logic;

import java.awt.Image;

import Render.Resource;

public class TerrainC extends Terrain{
	public static final int buildingCount = 25;
	public static Building[] buildings = new Building[buildingCount];  
	
	private double imageRatio = 0.5;
	private int shiftYfirstRow = 30;
	private int shiftYsecondRow = 60;
	private int sumX;

	public TerrainC(Image backgroundImage) {
		super(backgroundImage);
		// TODO Auto-generated constructor stub
		sumX = 0;
		buildings[0] = new Building(sumX  ,shiftYfirstRow,(int)(Resource.buildingSprite[42].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[42].getHeight()*imageRatio)  ,Resource.buildingSprite[42]);
		buildings[1] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+35  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[2] = new Building(sumX+=(int)(Resource.buildingSprite[42].getWidth()*imageRatio)-35  ,shiftYfirstRow,(int)(Resource.buildingSprite[42].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[42].getHeight()*imageRatio)  ,Resource.buildingSprite[42]);
		buildings[3] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+35  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[4] = new Building(sumX+=(int)(Resource.buildingSprite[42].getWidth()*imageRatio)-35  ,shiftYfirstRow,(int)(Resource.buildingSprite[42].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[42].getHeight()*imageRatio)  ,Resource.buildingSprite[42]);
		buildings[5] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+35  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[6] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[7] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[8] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[9] = new Building(sumX+=(int)(Resource.buildingSprite[44].getWidth()*imageRatio)-80  ,shiftYfirstRow,(int)(Resource.buildingSprite[44].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[44].getHeight()*imageRatio)  ,Resource.buildingSprite[44]);
		buildings[10] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+60  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[11] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[12] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[13] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[14] = new Building(sumX+=(int)(Resource.buildingSprite[42].getWidth()*imageRatio)-35  ,shiftYfirstRow,(int)(Resource.buildingSprite[42].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[42].getHeight()*imageRatio)  ,Resource.buildingSprite[42]);
		buildings[15] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+35  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[16] = new Building(sumX+=(int)(Resource.buildingSprite[42].getWidth()*imageRatio)-35  ,shiftYfirstRow,(int)(Resource.buildingSprite[42].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[42].getHeight()*imageRatio)  ,Resource.buildingSprite[42]);
		buildings[17] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+30  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[18] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		
		sumX = 0;
		buildings[19] = new Building(sumX  ,shiftYsecondRow,(int)(Resource.buildingSprite[34].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[34].getHeight()*imageRatio)  ,Resource.buildingSprite[34]);
		buildings[20] = new Building(sumX+=(int)(Resource.buildingSprite[34].getWidth()*imageRatio)+10  ,shiftYsecondRow,(int)(Resource.buildingSprite[34].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[34].getHeight()*imageRatio)  ,Resource.buildingSprite[34]);
		buildings[21] = new Building(sumX+=(int)(Resource.buildingSprite[34].getWidth()*imageRatio)+10  ,shiftYsecondRow,(int)(Resource.buildingSprite[34].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[34].getHeight()*imageRatio)  ,Resource.buildingSprite[34]);
		buildings[22] = new Building(sumX+=(int)(Resource.buildingSprite[34].getWidth()*imageRatio)+10  ,shiftYsecondRow,(int)(Resource.buildingSprite[34].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[34].getHeight()*imageRatio)  ,Resource.buildingSprite[34]);
		buildings[23] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)+20  ,shiftYsecondRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[24] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);

		
		/*
		sumX = 0;
		buildings[13] = new Building(sumX+=(int)(Resource.buildingSprite[28].getWidth()*imageRatio)-50  ,shiftYsecondRow,(int)(Resource.buildingSprite[28].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[28].getHeight()*imageRatio)  ,Resource.buildingSprite[28]);
		*/
	}

	@Override
	public void drawBuildings() {
		// TODO Auto-generated method stub
		
	}
}
