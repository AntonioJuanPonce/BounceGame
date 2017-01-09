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
		if(main.mili % speed_inv != 0)
		{
			return;
		}
		if(speed > 0)
		{
			if
			(
			main.check_col(x+main.tile_size, y)
			||
			main.check_col(x+main.tile_size,y+main.tile_size-1)
			){speed*=-1;}
		}else
		{
			if
			(
				main.check_col(x,y)
				||
				main.check_col(x,y+main.tile_size-1)
			){speed*=-1;}
		}
		
		x+=speed;
		
		if
		(
			((main.player.x > x-main.tile_size) && (main.player.x < x+main.tile_size))
			&&
			((main.player.y > y-main.tile_size) && (main.player.y < y+main.tile_size))
		){main.GameOver();}
		
	}

}
