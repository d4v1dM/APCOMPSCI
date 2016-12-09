package GUI;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Screen {

	private BufferedImage image;
	public Screen(int width, int height){
		initImage(width, height);
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB_PRE);
		update();
	}
	public BufferedImage getImage(){
		return this.image;
	}
	public void update(){
		Graphics2D g = image.createGraphics();
		g.setColor(Color.pink);
		g.fillRect(0,0,image.getWidth(), image.getHeight());
	}
}
