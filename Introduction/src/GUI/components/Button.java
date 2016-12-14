package GUI.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel {
	private Color color;
	private Action action;

	public Button(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text);
		this.color = color;
		this.action = action;
		
	}
	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(Color.black);
		g.setFont(new Font(super.getFont(), Font.PLAIN, super.getSize()));
		if(super.getText() != null){
			g.fillRoundRect(super.getX(), super.getY(), super.getWidth(), super.getHeight(), 30, 30);
			g.drawRoundRect(super.getX(), super.getY(), super.getWidth(), super.getHeight(), 30, 30);
		}
		
	}
}
