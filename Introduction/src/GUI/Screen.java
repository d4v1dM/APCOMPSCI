package GUI;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import GUI.components.Visible;

public abstract class Screen {
	/*
	 *  AP Topic:
	 *  wrapper class -> class for primitive types
	 *  
	 *  
	 * */

	private BufferedImage image;
	private ArrayList<Visible> viewObjects;
	
	public Screen(int width, int height){
		viewObjects = new ArrayList<Visible>();
		initImage(width, height);
		initObjects(viewObjects);
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB_PRE);
		update();
	}
	public abstract void initObjects(ArrayList<Visible> viewObjects);
	private void initImage(int width, int height) {
		// TODO Auto-generated method stub
		//image = new BufferedImage(width, height, BufferedImage)
	}
	public BufferedImage getImage(){
		return this.image;
	}
	public int getWidth(){
		return image.getWidth();
	}
	public int getHeight(){
		return image.getHeight();
	}
	public void update(){
		Graphics2D g = image.createGraphics();
		// smooth the graphics
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.white);
		g.fillRect(0,0,image.getWidth(), image.getHeight());
		g.setColor(Color.black);
		for(Visible v: viewObjects){
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
	}
}