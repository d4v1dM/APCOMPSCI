package GUI.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel implements Clickable{
	private Color color;
	private Action action;

	public Button(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text);
		this.color = color;
		this.action = action;
		update();
		
	}
	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(Color.black);
		g.setFont(new Font(super.getFont(), Font.PLAIN, super.getSize()));
		if(getText() != null){
			g.fillRoundRect(getX(), getY(), 125, 100, 25, 35);
			g.drawRoundRect(getX(), getY(), 125, 100, 25, 35);
		}
	}
	@Override
	public boolean isHovered(int x, int y) {
		// TODO Auto-generated method stub
		return ((x >= super.getX() && x <= super.getWidth()) && (y >= super.getY() && y <= super.getHeight()));
	}
	@Override
	public void act() {
		// TODO Auto-generated method stub
		this.action.act();
	}
}