package MoveGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Player
{
	/* Array Dimensions dictate how many bits the player
	 * explodes into when killed.*/
	public Particle[][] player_bits  = new Particle[3][3];
	
	public int x;
	public int y;
	
	public int size = Game.tile_size;
	
	private int move_speed = 1;
	private int speed_inv = 2;
	
	Color c = Color.BLUE;
	
	public boolean dead = false;
	
	private boolean left$b = false;
	private boolean right$b = false;
	private boolean up$b = false;
	private boolean down$b = false;
	
	public Player(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void kill()
	{	
		/* Make sure the player cannot be killed multiple times,
		 * because that would reset the death animation.*/
		if(dead){return;}
		else{dead = true;}
		
		/* Excuse the code please, i =  x, j = y */
		for(int i = 0; i < player_bits[0].length; i++)
		{
			for(int j = 0; j < player_bits.length; j++)
			{
				player_bits[j][i] = new Particle
				(
					x + (size / player_bits[0].length) * i,
					y + (size / player_bits.length) * j,
					500,
					((size / player_bits.length) + (size / player_bits[0].length)) / 2,
					c
				);
			}
		}
		
	}
	
	public void dead_update()
	{
		/* Respawn player.*/
		if(!player_bits[0][0].alive)
		{
			dead = false;
			x = Game.current_map.spawn_x;
			y = Game.current_map.spawn_y;
			return;
		}
		
		/* Update every particle.*/
		for(int i  = 0; i < player_bits[0].length; i++)
		{
			for(int j = 0; j < player_bits.length; j++)
			{
				player_bits[j][i].update();
			}
		}
	}
	
	public void update()
	{
		if(dead)
		{
			dead_update();
			return;
		}
		
		/* Slow down movement of the player.*/
		if(Game.mili % speed_inv != 0){return;}
		
		/* Check if the position the player would be put in,
		 * from the key_code is illegal, if not, move it.
		 * Otherwise nothing happens.*/
		if(left$b){
			if(!(Game.check_col(x-1,y) || Game.check_col(x-1,y+size-1))){x-=move_speed;};
		};
		if(right$b){
			if(!(Game.check_col(x+size,y) || Game.check_col(x+size,y+size-1))){x+=move_speed;};
		};
		if(up$b){
			if(!(Game.check_col(x,y+size) || Game.check_col(x+size-1,y+size))){y+=move_speed;};
		};
		if(down$b){
			if(!(Game.check_col(x,y-1) || Game.check_col(x+size-1,y-1))){y-=move_speed;};
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
		if(dead)
		{
			for(int i = 0; i < player_bits[0].length; i++)
			{
				for(int j = 0; j < player_bits.length; j++)
				{
					player_bits[j][i].draw(g);
				}
			}
			return;
		}
		g.setColor(c);
		g.fillRect(x-Camera.x,y-Camera.y,size,size);
	}
}