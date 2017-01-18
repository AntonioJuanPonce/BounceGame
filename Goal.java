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
		(play_col(x,y,tile_size,tile_size))
		{Game.NextLevel();}
	}
}
