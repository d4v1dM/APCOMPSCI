package GUI.screens;

import java.awt.Color;
import java.util.ArrayList;

import GUI.Screen;
import GUI.components.Action;
import GUI.components.Button;
import GUI.components.TextLabel;
import GUI.components.Visible;

public class CoordinateScreen extends Screen {
	public Button myButton;

	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		TextLabel Text = new TextLabel(20,200,500,40, "Text.");
		myButton = new Button(20,100,80,40,"Button",new Color(100,100,250), new Action(){
			public void act(){
				//code for action will be in here.
				
			}
		});
		viewObjects.add(Text);
		viewObjects.add(myButton);
	}

}
