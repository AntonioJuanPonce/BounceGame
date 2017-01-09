package MoveGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Player
{
	public int x;
	public int y;
	
	private int move_speed = 1;
	private int speed_inv = 1;
	
	Color c = Color.BLUE;
	
	private boolean left$b = false;
	private boolean right$b = false;
	private boolean up$b = false;
	private boolean down$b = false;
	
	public Player(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void update()
	{
		/* Slow down movement of the player.*/
		if(main.mili % speed_inv != 0){return;}
		
		/* Check if the position the player would be put in,
		 * from the key_code is illegal, if not, move it.
		 * Otherwise nothing happens.*/
		if(left$b){
			if(!(main.check_col(x-1,y) || main.check_col(x-1,y+main.tile_size-1))){x-=move_speed;};
		};
		if(right$b){
			if(!(main.check_col(x+main.tile_size,y) || main.check_col(x+main.tile_size,y+main.tile_size-1))){x+=move_speed;};
		};
		if(up$b){
			if(!(main.check_col(x,y+main.tile_size) || main.check_col(x+main.tile_size-1,y+main.tile_size))){y+=move_speed;};
		};
		if(down$b){
			if(!(main.check_col(x,y-1) || main.check_col(x+main.tile_size-1,y-1))){y-=move_speed;};
		}
	}
	
	public void key_on(int keycode)
	{
		switch(keycode)
		{
			case KeyEvent.VK_LEFT:
				left$b = true;
				break;
			case KeyEvent.VK_RIGHT:
				right$b = true;
				break;
			case KeyEvent.VK_DOWN:
				up$b = true;
				break;
			case KeyEvent.VK_UP:
				down$b = true;
				break;
		}
	}
	public void key_off(int keycode)
	{
		switch(keycode)
		{
			case KeyEvent.VK_LEFT:
				left$b = false;
				break;
			case KeyEvent.VK_RIGHT:
				right$b = false;
				break;
			case KeyEvent.VK_DOWN:
				up$b = false;
				break;
			case KeyEvent.VK_UP:
				down$b = false;
				break;
		}
	}
	public void draw(Graphics g)
	{
		g.setColor(c);
		g.fillRect(x-Camera.x,y-Camera.y,main.tile_size,main.tile_size);
	}
}