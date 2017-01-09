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
			if(!(main.check_col(x,y+1) || main.check_col(x+main.tile_size-1,y+1)))
			{if(main.mili % speed_inv == 0){y+=speed;}}else{speed*=-1;}
		}else
		{
			if(!(main.check_col(x,y+main.tile_size) || main.check_col(x+main.tile_size-1, y+main.tile_size)))
			{if(main.mili % speed_inv == 0){y+=speed;}}else{speed*=-1;}
		}
		
		// Check if the enemy is colliding with the player, if it is, end the game.
		if
		(
			((main.player.x > x-main.tile_size) && (main.player.x < x+main.tile_size))
			&&
			((main.player.y > y-main.tile_size) && (main.player.y < y+main.tile_size))
		){main.GameOver();}
	}
	
}