package GUI.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextArea extends TextLabel {

	public TextArea(int x, int y, int w, int h, String text) {
		super(x, y, w, h, text);
	}
	
	@Override
	public void update(Graphics2D g) {
		if(getText() == null){
			return;
		}
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		FontMetrics fm = g.getFontMetrics();//width of pixel
		String[] words = getText().split(" ");//splits word at every space
		int widthLimit = getWidth();
		int heightLimit = getHeight();
		int tempH = getHeight() - 5;
		int tempW = 4;
		String line = "";
		for(String w : words){
			if((tempW + fm.stringWidth(w)) < widthLimit){
				line += w;
				tempW += fm.stringWidth(w);
			}
			else if((tempH + fm.getHeight()+fm.getDescent())<heightLimit){
				g.drawString(line, 4, tempH);
				tempH += (fm.getDescent() + fm.getHeight());
				// reset line:
				line = "";
				tempW = 0;
			}
			else break; // no more space for other words.
		}
		//setText(line);
	}
}