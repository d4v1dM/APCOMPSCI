package GUI.components;

import java.awt.image.BufferedImage;

public interface Visible {
	public BufferedImage getImage();
	public int getWidth();
	public int getHeight();
	public int getX();
	public int getY();
	public boolean isAnimated();
	public void update();
	
}
