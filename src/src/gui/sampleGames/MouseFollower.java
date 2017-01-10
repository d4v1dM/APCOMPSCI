package GUI.sampleGames;
import GUI.GUIApplication;
import GUI.screens.CoordinateScreen;

import java.util.ArrayList;

import GUI.GUIApplication;
import GUI.components.TextLabel;
import GUI.components.Visible;
import GUI.screens.CoordinateScreen;

public class MouseFollower extends GUIApplication {

	//FIELDS
	public static MouseFollower game;//only ONE exists
	private CoordinateScreen cs;
	
	
	public MouseFollower(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		cs = new CoordinateScreen(getWidth(), getHeight());
		setScreen(cs);
	}

	public static void main(String[] args) {
		System.out.println("AAA");
		game = new MouseFollower(800,600);
		Thread app = new Thread(game);
		app.start();
	}

}
