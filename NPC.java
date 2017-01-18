package MoveGame;

import java.awt.Color;
import java.awt.Graphics;

public abstract class NPC
{
	public int x;
	public int y;
	public Color c = Color.RED;
	public int tile_size = Game.tile_size;
	public int size_x = tile_size;
	public int size_y = tile_size;
	
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
	public boolean play_col(int x,int y,int width,int height)
	{
		if
		(
			((Game.player.x > x-Game.player.size) && (Game.player.x < x+width))
			&&
			((Game.player.y > y-Game.player.size) && (Game.player.y < y+height))
		){return true;}
		
		return false;
	}
}