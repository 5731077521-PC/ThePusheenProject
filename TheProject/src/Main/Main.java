package Main;

import java.awt.Dimension;

import javax.swing.JFrame;

import Logic.GameLogic;
import Render.GameScreen;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Pusheen");
		frame.setPreferredSize(new Dimension(Config.SCREEN_WIDTH,Config.SCREEN_HEIGHT));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		GameScreen gameScreen = new GameScreen();
		GameLogic gameLogic = new GameLogic();
		gameLogic.onStart();
		
		frame.add(gameScreen);
		gameScreen.requestFocus();
		gameScreen.requestFocusInWindow();
		frame.setVisible(true);
		frame.pack();
		
		while(true){
			try{
				Thread.sleep(50);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			gameLogic.logicUpdate();
			gameScreen.repaint();
		}
	}

}
