package MoveGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Chronometer extends NPC{
	public int wait = 650;
	public int remaining;
	public int number;
	public Chronometer(int x, int y) {
		super(x, y);
		c = Color.lightGray;
		text_c = Color.LIGHT_GRAY;
		// TODO Auto-generated constructor stub
	}
	public Color text_c;
	public Font font = new Font("System", Font.ITALIC ,tile_size / 2);
	public void update() {
		remaining++;
		if(remaining == wait) {
			remaining = 0;
			number++;
		}
	}
	@Override
	public void draw(Graphics g)
	{
		g.setColor(text_c);
		g.setFont(font);
		g.drawString(""+number/60+":"+number%60,x,y);
	}
}
