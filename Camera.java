package MoveGame;

import java.awt.Dimension;

public class Camera
{
	public static int x;
	public static int y;
	//How far from the screen the player can
	//be before the camera starts to scroll.
	public static int focus = (Game.tile_size*5);
	public static Dimension size;
	public Camera(Dimension size)
	{
		Camera.size =  size;
		x = 0;
		y = 0;
		update();
	}
	public void update()
	{
		//Left bound follow player.
		if(Game.player.x < x + focus)
		{x--;}
		
		//Right bound follow player.
		if(Game.player.x+Game.tile_size > (x+size.width) - focus)
		{x++;}
		
		//Up bound follow player.
		if(Game.player.y < Camera.y + focus)
		{y--;}
		
		//Down bound follow player.
		if(Game.player.y + Game.tile_size > (Camera.y+size.height) - focus)
		{y++;}
		
		//Left bound stay in bounds.
		if(x<0)
		{x=0;}
		
		//Right bound stay in bounds.
		if(x+size.width>Game.current_map.width * Game.tile_size)
		{x = (Game.current_map.width * Game.tile_size) - size.width;}
		
		//Up bound stay in bounds.
		if(y<0)
		{y = 0;}
		
		//Down bound stay in bounds.
		if(y+size.height>Game.current_map.height * Game.tile_size)
		{y = (Game.current_map.height * Game.tile_size) - size.height;}
	}
}