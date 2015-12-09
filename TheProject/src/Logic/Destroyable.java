package Logic;

public interface Destroyable {
	public static final int MAX_P = 100;
	public static final int MIN_P = 0;
	
	public abstract void decreaseHP(int decrease);
	public abstract boolean isDestroyed();
	public abstract int getX();
	public abstract int getY();
	public abstract void move();
}
