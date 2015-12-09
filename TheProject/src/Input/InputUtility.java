package Input;

public class InputUtility {
	private static int mouseX, mouseY;
	private static boolean mouseLeftDown, mouseRightDown, mouseOnScreen;
	private static boolean mouseLeftTriggered = false,mouseRightTriggered = false;
	private static boolean[] keyPressed = new boolean[256];
	private static boolean[] keyTriggered = new boolean[256];
	
	public static int getMouseX() {
		return mouseX;
	}
	public static void setMouseX(int mouseX) {
		InputUtility.mouseX = mouseX;
	}
	public static int getMouseY() {
		return mouseY;
	}
	public static void setMouseY(int mouseY) {
		InputUtility.mouseY = mouseY;
	}
	
	public static boolean isMouseLeftDown() {
		return mouseLeftDown;
	}
	public static void setMouseLeftDown(boolean mouseLeftDown) {
		InputUtility.mouseLeftDown = mouseLeftDown;
	}
	public static boolean isMouseRightDown() {
		return mouseRightDown;
	}
	public static void setMouseRightDown(boolean mouseRightDown) {
		InputUtility.mouseRightDown = mouseRightDown;
	}
	
	public static boolean isMouseOnScreen() {
		return mouseOnScreen;
	}
	public static void setMouseOnScreen(boolean mouseOnScreen) {
		InputUtility.mouseOnScreen = mouseOnScreen;
	}
	
	/*
	public static void setMouseLeftLastDown(){
		setMouseLeftDown(false);
	}
	*/
	
	public static boolean isMouseLeftClicked() {
		return mouseLeftTriggered;
	}
	public static void setMouseLeftTriggered(boolean v){
		InputUtility.mouseLeftTriggered = v;
		
	}
	public static boolean isMouseRightClicked() {
		return mouseRightTriggered;
	}
	public static void setMouseRightTriggered(boolean v){
		InputUtility.mouseRightTriggered = v;
	}
	
	public static boolean getKeyPressed(int key) {
		if(key>=0 && key < 256)
			return keyPressed[key];
		else return false;
	}
	public static void setKeyPressed(int key,boolean pressed) {
		if(key>=0 && key < 256)	keyPressed[key] = pressed;
	}
	
	public static boolean getKeyTriggered(int key) {
		if(key>=0 && key < 256)
			return keyTriggered[key];
		else return false;
	}
	public static void setKeyTriggered(int key,boolean pressed) {
		if(key>=0 && key < 256) keyTriggered[key] = pressed;
	}
	
	public static void postUpdate(){
		mouseLeftTriggered = false;
		mouseRightTriggered = false;
		for(int i=0;i<256;i++){
			keyTriggered[i] = false;
		}
	}
	
}
