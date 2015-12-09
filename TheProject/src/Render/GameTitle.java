package Render;

import java.awt.Dimension;

import javax.swing.JComponent;

import Main.Config;

public class GameTitle extends JComponent{
	public GameTitle(){
		super();
		setPreferredSize(new Dimension(Config.SCREEN_WIDTH, Config.SCREEN_HEIGHT));
		
	}
}
