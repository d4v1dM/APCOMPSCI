package GUI.screens;

import java.util.ArrayList;

import GUI.Screen;
import GUI.components.TextLabel;
import GUI.components.Visible;

public class CoordinateScreen extends Screen {

	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		TextLabel Text = new TextLabel(20,200,500,40, "Text");
		viewObjects.add(Text);
	}

}
