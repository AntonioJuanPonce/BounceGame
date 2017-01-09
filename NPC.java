package MoveGame;

import java.awt.Color;
import java.awt.Graphics;

public abstract class NPC
{
	public int x;
	public int y;
	public Color c = Color.RED;
	public int size_x = main.tile_size;
	public int size_y = main.tile_size;
	
	public int speed = 1;
	public NPC(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public abstract void update();
	
	public void draw(Graphics g)
	{
		g.setColor(c);
		g.fillRect(x-Camera.x,y-Camera.y,size_x,size_y);
	}
}