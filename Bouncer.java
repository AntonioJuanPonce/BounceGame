package MoveGame;

public class Bouncer extends NPC
{
	public int speed_x = 1;
	public int speed_y = 1;
	public int speed_inv;
	
	public Bouncer(int x, int y, int speed_inv)
	{
		super(x, y);
		this.speed_inv = speed_inv;
	}

	@Override
	public void update()
	{
		// Check if the enemy is colliding with the player, if it is, end the game.
		if
		(
			((main.player.x > x-main.tile_size) && (main.player.x < x+main.tile_size))
			&&
			((main.player.y > y-main.tile_size) && (main.player.y < y+main.tile_size))
		){main.GameOver();}
		
		//Slow down the bouncer.
		if(main.mili % speed_inv != 0)
		{
			return;
		}
		
		// Have the Bouncer bounce off the walls.
		if(speed_x > 0)
		{
			// Direction: Lower right.
			if(speed_y > 0)
			{
				if
				(
					main.check_col(x+main.tile_size,y)
					||
					main.check_col(x+main.tile_size,y+main.tile_size-1)
				){speed_x*=-1;}
				else if
				(
					main.check_col(x,y+main.tile_size)
					||
					main.check_col(x+main.tile_size-1,y+main.tile_size)
				){speed_y *=-1;}
			}
			else // Direction: Upper right.
			{
				if
				(
					main.check_col(x+main.tile_size,y)
					||
					main.check_col(x+main.tile_size,y+main.tile_size)
				){speed_x*=-1;}
				else if
				(
					main.check_col(x+main.tile_size,y-1)
					||
					main.check_col(x,y-1)
				){speed_y*=-1;}
			}
		}
		else
		{
			// Direction: Lower left.
			if(speed_y > 0)
			{
				if
				(
					main.check_col(x,y)
					||
					main.check_col(x,y+main.tile_size-1)
				){speed_x*=-1;}
				else if
				(
					main.check_col(x,y+main.tile_size)
					||
					main.check_col(x+main.tile_size-1,y+main.tile_size)
				){speed_y*=-1;}
			}
			else // Direction: Upper left.
			{
				if
				(
					main.check_col(x,y)
					||
					main.check_col(x,y+main.tile_size)
				){speed_x*=-1;}
				else if
				(
					main.check_col(x,y-1)
					||
					main.check_col(x+main.tile_size,y-1)
				){speed_y*=-1;}
			}
		}
		x += speed_x;
		y += speed_y;
		
		/*
		 * Old code, re-implement possible.
		if(main.mili % 3 == 0)
		{
			if
			(
				(main.check_col(x,y-1) || main.check_col(x+main.tile_size,y-1))
				||
				(main.check_col(x,y+main.tile_size)) || main.check_col(x+main.tile_size,y+main.tile_size+1)
				){speed_y*=-1;}
			if
			(
				(main.check_col(x,y) || main.check_col(x,y+main.tile_size+1))
				||
				(main.check_col(x+main.tile_size-1,y) || main.check_col(x+main.tile_size,y+main.tile_size+1))
				){speed_x*=-1;}
			x += speed_x;
			y += speed_y;
		}
		*/
	}

}
