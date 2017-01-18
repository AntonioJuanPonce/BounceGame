package MoveGame;

public class Slider extends NPC
{
	public int speed_inv;
	
	public Slider(int x, int y,int speed_inv)
	{
		super(x, y);
		this.speed_inv = speed_inv;
	}

	public void update()
	{
		if(speed < 0)
		{
			if(!(Game.check_col(x,y+1) || Game.check_col(x+tile_size-1,y+1)))
			{if(Game.mili % speed_inv == 0){y+=speed;}}else{speed*=-1;}
		}else
		{
			if(!(Game.check_col(x,y+tile_size) || Game.check_col(x+tile_size-1, y+tile_size)))
			{if(Game.mili % speed_inv == 0){y+=speed;}}else{speed*=-1;}
		}
		
		// Check if the enemy is colliding with the player, if it is, end the game.
		if
		(play_col(x,y,tile_size,tile_size))
		{Game.player.kill();}
	}
}