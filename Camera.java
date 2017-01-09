package MoveGame;

import java.awt.Dimension;

public class Camera
{
	public static int x;
	public static int y;
	//How far from the screen the player can
	//be before the camera starts to scroll.
	public static int focus = main.tile_size;
	public static Dimension size;
	public Camera(Dimension size)
	{
		Camera.size =  size;
		update();
	}
	public void update()
	{
		//Left bound.
		if(main.player.x < x + focus)
		{x--;}
		
		//Right bound.
		if(main.player.x+main.tile_size > (x+size.width) - focus)
		{x++;}
		
		//Up bound.
		if(main.player.y < Camera.y + focus)
		{y--;}
		
		//Down bound.
		if(main.player.y + main.tile_size > (Camera.y+size.height) - focus)
		{y++;}
	}
}