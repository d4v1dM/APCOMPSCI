package GUI.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import GUI.Screen;
import GUI.components.Action;
import GUI.components.Button;
import GUI.components.TextArea;
import GUI.components.TextLabel;
import GUI.components.Visible;

public class CoordinateScreen extends Screen 
implements MouseMotionListener{


//FIELD
private Button button;
private TextArea text;

public CoordinateScreen(int width, int height) {
super(width, height);
// TODO Auto-generated constructor stub
}

@Override
public void initObjects(ArrayList<Visible> viewObjects) {
	button = new Button(20,100,80,40,"The Button with a long name",new Color(100,100,250),
	new Action() {
		public void act() {
			// TODO Auto-generated method stub
	
		}
	});
	viewObjects.add(button);
	text = new TextArea(20, 200, 500, 150, "Some text");
	viewObjects.add(text);
}

public void mouseDragged(MouseEvent e) {
// TODO Auto-generated method stub

}

public void mouseMoved(MouseEvent e) {
	int mx = e.getX();//get mouse X coordinate
	int my = e. getY();//get Y coord
	text.setText("Mouse at: "+mx +", "+my);
}

public MouseMotionListener getMouseMotionListener(){ 
	return this;
}











}