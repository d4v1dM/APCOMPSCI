package GUI;

import javax.swing.JFrame;

public class GUIApplication extends JFrame{
	
	public GUIApplication(int width, int height){
		//constructor
		super();
		setBounds(20,20,width,height);
		// terminates program when window is closed.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	// demo purposes only.
	public static void main(String[] args){
		// TODO Auto-generated method stub
		new GUIApplication(800,600);
	}

}
