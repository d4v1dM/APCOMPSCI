package GUI.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import GUI.Screen;
import GUI.components.Action;
import GUI.components.Button;
import GUI.components.TextLabel;
import GUI.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{
	private Button myButton;
	private TextLabel text;

	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		text = new TextLabel(20,200,500,40, "Text.");
		myButton = new Button(20,100,80,40,"Button",new Color(100,100,250), new Action(){
			public void act(){
				//code for action will be in here.
				
			}
		});
		viewObjects.add(text);
		viewObjects.add(myButton);
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int mx = e.getX();
		int my = e.getY();
		
		text.setText("Mouse at " + mx + ", " + my);
	}
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
}