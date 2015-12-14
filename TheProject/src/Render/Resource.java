package Render;

import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

// ediited by net

public class Resource {
	public static BufferedImage backgroundImage/*,building_1,building_2,building_3,building_4*/
								,tankLeft,tankRight,bulletLeft,bulletRight
								,policeLeft,policeRight
								,fireOrange_left,fireOrange_right,fireBlue_left,fireBlue_right
								,crack0,crack1,crack2,crack3,crack4,crack5,crack6,crack7
								,heroALeft,heroARight,heroBLeft,heroBRight;
	public static BufferedImage[] buildingSprite;  
	public static ImageIcon pusheenLeftStill,
							pusheenRightStill,
							pusheenLeftRun,
							pusheenRightRun,
							pusheenDeadlyAttack_left,
							assistantA_left,assistantA_right,assistantB;
	public static URL url1,url2,url3,url4,url5,url6,url7,url8;
	static{
		try{
			ClassLoader classLoader = RenderableHolder.class.getClassLoader();
			//backgroundImage = ImageIO.read(classLoader.getResource("img\bg.jpg"));
			
			//----------------------------Building--------------------------------------------------------
			// Extremely be careful of index!!!!!!!!!!!!
			buildingSprite = new BufferedImage[66];
			
			// General building
			buildingSprite[0] = ImageIO.read(classLoader.getResource("res/image/building/building_0.png"));
			buildingSprite[1] = ImageIO.read(classLoader.getResource("res/image/building/building_1.png"));
			buildingSprite[2] = ImageIO.read(classLoader.getResource("res/image/building/building_2.png"));
			buildingSprite[3] = ImageIO.read(classLoader.getResource("res/image/building/building_3.png"));
			buildingSprite[4] = ImageIO.read(classLoader.getResource("res/image/building/building_4.png"));
			buildingSprite[5] = ImageIO.read(classLoader.getResource("res/image/building/building_5.png"));
			buildingSprite[6] = ImageIO.read(classLoader.getResource("res/image/building/building_6.png"));
			buildingSprite[7] = ImageIO.read(classLoader.getResource("res/image/building/building_7.png"));
			buildingSprite[8] = ImageIO.read(classLoader.getResource("res/image/building/building_8.png"));
			buildingSprite[9] = ImageIO.read(classLoader.getResource("res/image/building/building_9.png"));
			buildingSprite[10] = ImageIO.read(classLoader.getResource("res/image/building/building_10.png"));
			buildingSprite[11] = ImageIO.read(classLoader.getResource("res/image/building/building_11.png"));
			buildingSprite[12] = ImageIO.read(classLoader.getResource("res/image/building/building_12.png"));
			buildingSprite[13] = ImageIO.read(classLoader.getResource("res/image/building/building_13.png"));
			buildingSprite[14] = ImageIO.read(classLoader.getResource("res/image/building/building_14.png"));
			buildingSprite[15] = ImageIO.read(classLoader.getResource("res/image/building/building_15.png"));
			buildingSprite[16] = ImageIO.read(classLoader.getResource("res/image/building/building_16.png"));
			buildingSprite[17] = ImageIO.read(classLoader.getResource("res/image/building/building_17.png"));
			buildingSprite[18] = ImageIO.read(classLoader.getResource("res/image/building/building_18.png"));
			buildingSprite[19] = ImageIO.read(classLoader.getResource("res/image/building/building_19.png"));
			buildingSprite[20] = ImageIO.read(classLoader.getResource("res/image/building/building_20.png"));
			buildingSprite[21] = ImageIO.read(classLoader.getResource("res/image/building/building_21.png"));
			buildingSprite[22] = ImageIO.read(classLoader.getResource("res/image/building/building_22.png"));
			buildingSprite[23] = ImageIO.read(classLoader.getResource("res/image/building/building_23.png"));
			buildingSprite[24] = ImageIO.read(classLoader.getResource("res/image/building/building_24.png"));
			buildingSprite[25] = ImageIO.read(classLoader.getResource("res/image/building/building_25.png"));
			buildingSprite[26] = ImageIO.read(classLoader.getResource("res/image/building/building_26.png"));
			buildingSprite[27] = ImageIO.read(classLoader.getResource("res/image/building/building_27.png"));
			buildingSprite[28] = ImageIO.read(classLoader.getResource("res/image/building/building_28.png"));
			buildingSprite[29] = ImageIO.read(classLoader.getResource("res/image/building/building_29.png"));
			buildingSprite[30] = ImageIO.read(classLoader.getResource("res/image/building/building_30.png"));
			buildingSprite[31] = ImageIO.read(classLoader.getResource("res/image/building/building_31.png"));
			buildingSprite[32] = ImageIO.read(classLoader.getResource("res/image/building/building_32.png"));
			buildingSprite[33] = ImageIO.read(classLoader.getResource("res/image/building/building_33.png"));
			
			// Stretched building
			buildingSprite[34] = ImageIO.read(classLoader.getResource("res/image/building/building_34s.png"));
			buildingSprite[35] = ImageIO.read(classLoader.getResource("res/image/building/building_35s.png"));
			buildingSprite[36] = ImageIO.read(classLoader.getResource("res/image/building/building_36s.png"));
			buildingSprite[37] = ImageIO.read(classLoader.getResource("res/image/building/building_37s.png"));
			buildingSprite[38] = ImageIO.read(classLoader.getResource("res/image/building/building_38s.png"));
			buildingSprite[39] = ImageIO.read(classLoader.getResource("res/image/building/building_39s.png"));
			buildingSprite[40] = ImageIO.read(classLoader.getResource("res/image/building/building_40s.png"));
			buildingSprite[41] = ImageIO.read(classLoader.getResource("res/image/building/building_41s.png"));
			buildingSprite[42] = ImageIO.read(classLoader.getResource("res/image/building/building_42s.png"));
			buildingSprite[43] = ImageIO.read(classLoader.getResource("res/image/building/building_43s.png"));
			buildingSprite[44] = ImageIO.read(classLoader.getResource("res/image/building/building_32.png"));
			buildingSprite[45] = ImageIO.read(classLoader.getResource("res/image/building/building_45s.png"));
			
			// Tree
			buildingSprite[46] = ImageIO.read(classLoader.getResource("res/image/building/tree.png"));
			
			
			buildingSprite[47] = ImageIO.read(classLoader.getResource("res/image/building/building_47s.png"));
			buildingSprite[48] = ImageIO.read(classLoader.getResource("res/image/building/building_48s.png"));
			buildingSprite[49] = ImageIO.read(classLoader.getResource("res/image/building/building_49s.png"));
			buildingSprite[50] = ImageIO.read(classLoader.getResource("res/image/building/building_50s.png"));
			buildingSprite[51] = ImageIO.read(classLoader.getResource("res/image/building/building_51s.png"));
			buildingSprite[52] = ImageIO.read(classLoader.getResource("res/image/building/building_52s.png"));
			buildingSprite[53] = ImageIO.read(classLoader.getResource("res/image/building/building_53s.png"));
			buildingSprite[54] = ImageIO.read(classLoader.getResource("res/image/building/building_54s.png"));
			buildingSprite[55] = ImageIO.read(classLoader.getResource("res/image/building/building_55s.png"));
			buildingSprite[56] = ImageIO.read(classLoader.getResource("res/image/building/building_56s.png"));
			buildingSprite[57] = ImageIO.read(classLoader.getResource("res/image/building/building_57s.png"));
			buildingSprite[58] = ImageIO.read(classLoader.getResource("res/image/building/building_58s.png"));
			buildingSprite[59] = ImageIO.read(classLoader.getResource("res/image/building/building_59s.png"));
			buildingSprite[60] = ImageIO.read(classLoader.getResource("res/image/building/building_60s.png"));
			buildingSprite[61] = ImageIO.read(classLoader.getResource("res/image/building/building_61s.png"));
			buildingSprite[62] = ImageIO.read(classLoader.getResource("res/image/building/building_62s.png"));
			buildingSprite[63] = ImageIO.read(classLoader.getResource("res/image/building/building_63s.png"));
			buildingSprite[64] = ImageIO.read(classLoader.getResource("res/image/building/building_64s.png"));
			buildingSprite[65] = ImageIO.read(classLoader.getResource("res/image/building/tree2.png"));

			



			//building_5 = ImageIO.read(classLoader.getResource("res/image/building/building_5.png"));
			
			//----------------------------Enemy--------------------------------------------------------
			
			tankLeft = ImageIO.read(classLoader.getResource("res/image/enemy/tank_left.png"));
			tankRight = ImageIO.read(classLoader.getResource("res/image/enemy/tank_right.png"));
			heroALeft = ImageIO.read(classLoader.getResource("res/image/enemy/heroA_left.png"));
			heroARight = ImageIO.read(classLoader.getResource("res/image/enemy/heroA_right.png"));
			heroBLeft = ImageIO.read(classLoader.getResource("res/image/enemy/heroB_left.png"));
			heroBRight = ImageIO.read(classLoader.getResource("res/image/enemy/heroB_right.png"));
			policeLeft = ImageIO.read(classLoader.getResource("res/image/enemy/police_left.png"));
			policeRight = ImageIO.read(classLoader.getResource("res/image/enemy/police_right.png"));

			
			
			//----------------------------Effect--------------------------------------------------------
			backgroundImage = ImageIO.read(classLoader.getResource("res/image/effect/sky.png"));
			bulletLeft = ImageIO.read(classLoader.getResource("res/image/effect/bullet_left.png"));
			bulletRight = ImageIO.read(classLoader.getResource("res/image/effect/bullet_right.png"));
			fireOrange_left = ImageIO.read(classLoader.getResource("res/image/effect/fire_orange_left.png"));
			fireOrange_right = ImageIO.read(classLoader.getResource("res/image/effect/fire_orange_right.png"));
			fireBlue_left = ImageIO.read(classLoader.getResource("res/image/effect/fire_blue_left.png"));
			fireBlue_right = ImageIO.read(classLoader.getResource("res/image/effect/fire_blue_right.png"));
			crack0 = ImageIO.read(classLoader.getResource("res/image/effect/crack_0.png"));
			crack1 = ImageIO.read(classLoader.getResource("res/image/effect/crack_1.png"));
			crack2 = ImageIO.read(classLoader.getResource("res/image/effect/crack_2.png"));
			crack3 = ImageIO.read(classLoader.getResource("res/image/effect/crack_3.png"));
			crack4 = ImageIO.read(classLoader.getResource("res/image/effect/crack_4.png"));
			crack5 = ImageIO.read(classLoader.getResource("res/image/effect/crack_5.png"));
			crack6 = ImageIO.read(classLoader.getResource("res/image/effect/crack_6.png"));
			crack7 = ImageIO.read(classLoader.getResource("res/image/effect/crack_7.png"));

			
			//----------------------------Pusheen--------------------------------------------------------
			
			url1 = Resource.class.getResource("/res/image/pusheen/leftstill.gif"); // fill code
			pusheenLeftStill = new ImageIcon(url1);    // fill code
			url2 = Resource.class.getResource("/res/image/pusheen/rightstill.gif"); // fill code
			pusheenRightStill = new ImageIcon(url2);    // fill code
			url3 = Resource.class.getResource("/res/image/pusheen/leftrun.gif"); // fill code
			pusheenLeftRun = new ImageIcon(url3);    // fill code
			url4 = Resource.class.getResource("/res/image/pusheen/rightrun.gif"); // fill code
			pusheenRightRun = new ImageIcon(url4);    // fill code
			url5 =  Resource.class.getResource("/res/image/pusheen/deadlyattack_left.gif"); // fill code
			pusheenDeadlyAttack_left = new ImageIcon(url5);
			url6 =  Resource.class.getResource("/res/image/pusheen/assistantA_left.gif");
			assistantA_left = new ImageIcon(url6);
			url7 =  Resource.class.getResource("/res/image/pusheen/assistantA_right.gif");
			assistantA_right = new ImageIcon(url7);
			url8 = Resource.class.getResource("/res/image/pusheen/assistantB.gif");
			assistantB = new ImageIcon(url8);

		}
		catch(Exception e){
			backgroundImage = null;
			e.printStackTrace();
		}
	}
}
