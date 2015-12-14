package Render;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Iterator;

import javax.swing.JComponent;

import Input.InputUtility;
import Logic.Player;
import Logic.Pusheen;
import Main.Config;
import Logic.GameLogic;

//ediited by net
public class GameScreen extends JComponent{
	protected static final long serialVersionUID = 1L;
	protected boolean isPressed;
	protected static final AlphaComposite transcluentWhite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f);
	protected static final AlphaComposite opaque = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1);

	public GameScreen(){
		super();
		setDoubleBuffered(true);
		setPreferredSize(new Dimension(Config.SCREEN_WIDTH, Config.SCREEN_WIDTH));
		setVisible(true);
		isPressed = false;
		setFocusable(true);
		
		addListener();
		setCursor(null);
	}

	public void addListener(){
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				InputUtility.setMouseLeftDown(false);
				InputUtility.setMouseLeftTriggered(false);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("MOUSE PRESSED");
				if(e.getButton() == 1){
					InputUtility.setMouseLeftDown(true);
					InputUtility.setMouseLeftTriggered(true);
					InputUtility.setMouseX(e.getX());
					InputUtility.setMouseY(e.getY());
				}	
			}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {}
		});
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				isPressed  = false;
				GameLogic.getPlayer().getOwner().setMoving(false);
				InputUtility.setKeyPressed(e.getKeyCode(), false);
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				isPressed = true;
				GameLogic.getPlayer().getOwner().setMoving(true);
				InputUtility.setKeyPressed(e.getKeyCode(), true);
			}
		});
		
		addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				InputUtility.setMouseX(e.getX());
				InputUtility.setMouseY(e.getY());
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {}
		});
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		//g2.setBackground(Color.WHITE);
		g2.setBackground(new Color(252,240,228));
		g2.clearRect(0, 0, Config.SCREEN_WIDTH, Config.SCREEN_HEIGHT);
		
		//Draw the sky on the top half of this screen
		g.drawImage(Resource.backgroundImage, 0, 0, Config.SCREEN_WIDTH, Config.GROUND_OFFSET, null);
		
		// enable when the game ends
		//g2.setComposite(transcluentWhite);
		//g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		
		
		for(IRenderable obj: RenderableHolder.getInstance().getIRenderableList()){
			if(obj.isVisible()) {
				if(obj instanceof Pusheen) {
						((Pusheen) obj).paintComponent(g2);
						continue;
					}
				obj.draw(g2);
			}
		}
		
		DrawingUtility.drawCursor(InputUtility.getMouseX(), InputUtility.getMouseY(), g2);
		
		
		/*
		if(Logic.Player.isUsingLazer){
			DrawingUtility.drawCursor(x, y, g2);
		}
		*/
		
	}

	public boolean isPressed() {
		return isPressed;
	}

	public void setPressed(boolean isPressed) {
		this.isPressed = isPressed;
	}
	
	
}
