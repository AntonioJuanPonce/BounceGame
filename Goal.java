package MoveGame;

import java.awt.Color;

public class Goal extends NPC {

	public Goal(int x, int y)
	{
		super(x, y);
		this.x = x;
		this.y = y;
		this.c = Color.GREEN;
	}

	@Override
	public void update()
	{
		//Check if the player is in the goal, if it is, progress to the next level.
		if
		(
			((main.player.x > x-main.tile_size) && (main.player.x < x+main.tile_size))
			&&
			((main.player.y > y-main.tile_size) && (main.player.y < y+main.tile_size))
		){main.NextLevel();}
	}

}
