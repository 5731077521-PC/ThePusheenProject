package Render;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Resource {
	public static BufferedImage backgroundImage;
	static{
		try{
			ClassLoader classLoader = RenderableHolder.class.getClassLoader();
			backgroundImage = ImageIO.read(classLoader.getResource("img\bg.jpg"));
		}
		catch(Exception e){
			backgroundImage = null;
			e.printStackTrace();
		}
	}
}
