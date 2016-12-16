package GUI.sampleGames;

import java.util.ArrayList;

import GUI.GUIApplication;
import GUI.components.TextLabel;
import GUI.components.Visible;
import GUI.screens.CoordinateScreen;

public class MouseFollower extends GUIApplication {
	public static MouseFollower game; // Only one exists.
	private CoordinateScreen cs;
	
	public MouseFollower(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void initScreen() {
		// TODO Auto-generated method stub
		cs = new CoordinateScreen(getWidth(), getHeight());
		setScreen(cs);
	}
	public void initObjects(ArrayList<Visible> viewObjects){
		TextLabel text = new TextLabel(20,200,500,40, "Some text");
		viewObjects.add(text);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		game = new MouseFollower(800,600);
		Thread app = new Thread(game);
		app.start();
	}

}
