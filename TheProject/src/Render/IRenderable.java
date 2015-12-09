package Render;

import java.awt.Graphics;

public interface IRenderable {
	public abstract void draw(Graphics g);
	public abstract boolean isVisible();
	public abstract int getZ();
}
