package MoveGame;

public class Bouncer extends NPC
{
	public int speed_x = 1;
	public int speed_y = 1;
	public double speed_inv;
	
	public Bouncer(int x, int y, double speed_inv)
	{
		super(x, y);
		this.speed_inv = speed_inv;
	}

	@Override
	public void update()
	{
		// Check if the enemy is colliding with the player, if it is, end the game.
		if
		(play_col(x,y,tile_size,tile_size))
		{Game.player.kill();}
		
		//Slow down the bouncer.
		if(Game.mili % speed_inv != 0)
		{
			return;
		}
		
		//Code for bouncer.
		if(speed_x > 0)
		{
			//Collision direction lower-right.
			if(speed_y > 0)
			{
				if //Check corner.
				(
					Game.check_col(x + tile_size, y + tile_size)
				){speed_x *= -1; speed_y *= -1;}
				else if //Check bottom.
				(
					Game.check_col(x + speed_x,y + tile_size + speed_y)
					||
					Game.check_col(x + tile_size + speed_x,y + tile_size + speed_y)
				){speed_y *= -1;}
				else if //Check right side.
				(
					Game.check_col(x + tile_size + speed_x,y + speed_y)
					||
					Game.check_col(x + tile_size + speed_x,y + tile_size + speed_y)
				){speed_x *= -1;}
			}else // Collision direction upper-right.
			{
				if //Check top.
				(
					Game.check_col(x + speed_x,y + speed_y)
					||
					Game.check_col(x + tile_size + speed_x,y + speed_y)
				){speed_y *= -1;}
				else if //Check right side.
				(
					Game.check_col(x + tile_size + speed_x,y + speed_y)
					||
					Game.check_col(x + tile_size + speed_x,y + tile_size + speed_y)
				){speed_x *= -1;}
				else if //Check corner.
				(
					Game.check_col(x + tile_size,y)
				){speed_x *= -1; speed_y *= -1;}
			}
		}else
		{
			if(speed_y > 0) //Collision direction lower-left.
			{
				if //Check corner.
				(
					Game.check_col(x, y + tile_size)
				){speed_x *= -1; speed_y *= -1;}
				else if //Check top.
				(
					Game.check_col(x + speed_x,y + speed_y)
					||
					Game.check_col(x + tile_size + speed_x,y + speed_y)
				){speed_y *= -1;}
				else if //Check left side.
				(
					Game.check_col(x + speed_x,y + speed_y)
					||
					Game.check_col(x + speed_x,y + tile_size + speed_y)
				){speed_x *= -1;}
			}else //Collision direction upper-left.
			{
				if //Check corner.
				(
					Game.check_col(x,y)
				){speed_y *= -1; speed_x *= -1;}
				else if //Check left side.
				(
					Game.check_col(x + speed_x,y + speed_y)
					||
					Game.check_col(x + speed_x,y + tile_size + speed_y)
				){speed_x *= -1;}
				else if //Check top.
				(
					Game.check_col(x + speed_x,y + speed_y)
					||
					Game.check_col(x + tile_size + speed_x,y + speed_y)
				){speed_y *= -1;}
			}
		}
		x += speed_x;
		y += speed_y;
	}
}
