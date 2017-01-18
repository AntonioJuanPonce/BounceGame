package MoveGame;

public class Guider extends NPC
{
	public int speed_inv;
	public Guider(int x, int y,int speed_inv)
	{
		super(x, y);
		this.speed_inv = speed_inv;
	}

	public void update()
	{
		if(Game.mili % speed_inv != 0)
		{
			return;
		}
		if(speed > 0)
		{
			if
			(
			Game.check_col(x+tile_size, y)
			||
			Game.check_col(x+tile_size,y+tile_size-1)
			){speed*=-1;}
		}else
		{
			if
			(
				Game.check_col(x,y)
				||
				Game.check_col(x,y+tile_size-1)
			){speed*=-1;}
		}
		
		x+=speed;
		
		if
		(play_col(x,y,tile_size,tile_size))
		{Game.player.kill();}
		
	}
}
