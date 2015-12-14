package Logic;

import java.awt.Image;

import Main.Config;
import Render.Resource;

public class TerrainC extends Terrain{
	public static final int buildingCount = 26;
	public static Building[] buildings = new Building[buildingCount];  
	
	private double imageRatio = 0.5;
	private int shiftYfirstRow = Config.GROUND_OFFSET+25;
	private int shiftYsecondRow = Config.GROUND_OFFSET+40;
	private int shiftYthirdRow = Config.GROUND_OFFSET+25;
	private int sumX;

	public TerrainC(Image backgroundImage) {
		super(backgroundImage);
		// TODO Auto-generated constructor stub
		sumX = 0;
		buildings[0] = new Building(sumX  ,shiftYfirstRow,(int)(Resource.buildingSprite[42].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[42].getHeight()*imageRatio)  ,Resource.buildingSprite[42]);
		buildings[1] = new Building(sumX+=(int)(Resource.buildingSprite[42].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[2] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[42].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[42].getHeight()*imageRatio)  ,Resource.buildingSprite[42]);
		buildings[3] = new Building(sumX+=(int)(Resource.buildingSprite[42].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[4] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[42].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[42].getHeight()*imageRatio)  ,Resource.buildingSprite[42]);
		buildings[5] = new Building(sumX+=(int)(Resource.buildingSprite[42].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[6] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[7] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[64].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[64].getHeight()*imageRatio)  ,Resource.buildingSprite[64]);
		buildings[8] = new Building(sumX+=(int)(Resource.buildingSprite[64].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[9] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[10] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[42].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[42].getHeight()*imageRatio)  ,Resource.buildingSprite[42]);
		buildings[11] = new Building(sumX+=(int)(Resource.buildingSprite[42].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[12] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[42].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[42].getHeight()*imageRatio)  ,Resource.buildingSprite[42]);
		buildings[13] = new Building(sumX+=(int)(Resource.buildingSprite[42].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		buildings[14] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[42].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[42].getHeight()*imageRatio)  ,Resource.buildingSprite[42]);
		//buildings[15] = new Building(sumX+=(int)(Resource.buildingSprite[42].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		//buildings[16] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[42].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[42].getHeight()*imageRatio)  ,Resource.buildingSprite[42]);
		//buildings[17] = new Building(sumX+=(int)(Resource.buildingSprite[42].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		//buildings[18] = new Building(sumX+=(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,shiftYfirstRow,(int)(Resource.buildingSprite[46].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[46].getHeight()*imageRatio)  ,Resource.buildingSprite[46]);
		
		sumX = 0;
		buildings[15] = new Building(sumX  ,shiftYsecondRow,(int)(Resource.buildingSprite[34].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[34].getHeight()*imageRatio)  ,Resource.buildingSprite[34]);
		buildings[16] = new Building(sumX+=(int)(Resource.buildingSprite[34].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[61].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[61].getHeight()*imageRatio)  ,Resource.buildingSprite[61]);
		buildings[17] = new Building(sumX+=(int)(Resource.buildingSprite[61].getWidth()*imageRatio)-5  ,shiftYsecondRow,(int)(Resource.buildingSprite[34].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[34].getHeight()*imageRatio)  ,Resource.buildingSprite[34]);
		buildings[18] = new Building(sumX+=(int)(Resource.buildingSprite[34].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[45].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[45].getHeight()*imageRatio)  ,Resource.buildingSprite[45]);
		buildings[19] = new Building(sumX+=(int)(Resource.buildingSprite[45].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[57].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[57].getHeight()*imageRatio)  ,Resource.buildingSprite[57]);
		buildings[20] = new Building(sumX+=(int)(Resource.buildingSprite[57].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[54].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[54].getHeight()*imageRatio)  ,Resource.buildingSprite[54]);
		buildings[21] = new Building(sumX+=(int)(Resource.buildingSprite[54].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[55].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[55].getHeight()*imageRatio)  ,Resource.buildingSprite[55]);
		buildings[22] = new Building(sumX+=(int)(Resource.buildingSprite[55].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[49].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[49].getHeight()*imageRatio)  ,Resource.buildingSprite[49]);
		buildings[23] = new Building(sumX+=(int)(Resource.buildingSprite[49].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[53].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[53].getHeight()*imageRatio)  ,Resource.buildingSprite[53]);
		buildings[24] = new Building(sumX+=(int)(Resource.buildingSprite[53].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[52].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[52].getHeight()*imageRatio)  ,Resource.buildingSprite[52]);
		buildings[25] = new Building(sumX+=(int)(Resource.buildingSprite[52].getWidth()*imageRatio)  ,shiftYsecondRow,(int)(Resource.buildingSprite[58].getWidth()*imageRatio)  ,(int)(Resource.buildingSprite[58].getHeight()*imageRatio)  ,Resource.buildingSprite[58]);

		
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
