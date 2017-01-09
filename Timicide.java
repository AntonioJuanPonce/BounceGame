package MoveGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Timicide extends NPC
{
	public int play_last_x;
	public int play_last_y;
	public int wait;
	public int remaining;
	public int number;
	public Color text_c;
	public Font font = new Font("Consolas", Font.BOLD ,main.tile_size / (""+number).length());
	public Timicide(int x, int y, int wait, int number)
	{
		super(x, y);
		this.wait = wait;
		this.number = number;
		remaining =  this.wait;
		c = Color.lightGray;
		text_c = Color.BLACK;
	}

	public void update()
	{
		//check if timicide is still alive, if not, return.
		if(number <= 0){return;}
		
		//Length of a unit of time is defined in milliseconds
		//As wait, after one unit of time has passed decrement number.
		remaining--;
		if(remaining <= 0)
		{
			remaining = wait;
			number--;
		}
		
		//Have the timicide act as if its a solid.
		if
		(
			((main.player.x > x-main.tile_size) && (main.player.x < x+main.tile_size))
			&&
			((main.player.y > y-main.tile_size) && (main.player.y < y+main.tile_size))
		){main.player.x=play_last_x;main.player.y=play_last_y;}
		play_last_x = main.player.x;
		play_last_y = main.player.y;
	}
	
	@Override
	public void draw(Graphics g)
	{
		//If timicide is dead, return.
		if(number <= 0)
		{
			return;
		}
		g.setColor(c);
		g.fillRect(x-Camera.x,y-Camera.y,main.tile_size,main.tile_size);
		g.setColor(text_c);
		g.setFont(font);
		g.drawString(""+number,x-Camera.x,y+main.tile_size-Camera.y);
	}
}