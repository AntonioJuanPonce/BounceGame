package MoveGame;

import java.awt.Color;
import java.awt.Graphics;

public class Door extends NPC
{
	public int key_x;
	public int key_y;
	private int play_last_x;
	private int play_last_y;
	public boolean destroyed = false;
	private Color key_c = Color.MAGENTA;
	private Color inset_c = Color.GRAY;
	
	public Door(int x, int y, int key_x, int key_y)
	{
		super(x, y);
		this.x = x;
		this.y = y;
		this.key_x = key_x;
		this.key_y = key_y;
		c = Color.BLACK;
	}

	public void update()
	{
		//If the key has not been collected,
		//Stop the player from going through the door, otherwise
		//Do nothing
		if(!destroyed)
		{
			if
			(play_col(key_x, key_y, tile_size, tile_size))
			{destroyed = true;Game.play_sound.play_sound(0);}
			if
			(play_col(x,y,tile_size,tile_size))
			{Game.player.x=play_last_x;Game.player.y=play_last_y;}
			play_last_x = Game.player.x;
			play_last_y = Game.player.y;
		}
	}
	@Override
	public void draw(Graphics g)
	{
		if(!destroyed)
		{
			g.setColor(c);
			g.fillRect(x-Camera.x,y-Camera.y,tile_size,tile_size);
			g.setColor(inset_c);
			g.fillRect(x+(tile_size/4)-Camera.x,y+(tile_size/4)-Camera.y,tile_size/2,tile_size/2);
			g.setColor(key_c);
			g.fillRect(key_x-Camera.x,key_y-Camera.y,tile_size,tile_size);
		}
	}
}
