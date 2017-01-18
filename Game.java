/*
 * MoveGame by Antonio Ponce.
 * */
package MoveGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//Input and time.
import java.awt.Toolkit;
/* main is an underling of JComponent.*/
public class Game implements Screen
{
	//My email address to throw at the user when an error occurs
	public static String email = "improbablynotaspider@gmail.com";
	
	//Sound
	public static PlaySound play_sound = new PlaySound();
	
	//Game constants
	public static final int tile_size = main.tile_size;
	public static final int update_length =  1;
	public static final int frame_length = 12;
	
	//Level number
	public static int level_n = 0;
	
	//Playable maps
	public static Map[] maps = MapsTemp.maps/*{new Map(data,1*tile_size,3*tile_size)}*/;
	public static Map current_map = maps[level_n];
		
	//Player.
	public static Player player =  new Player(current_map.spawn_x,current_map.spawn_y);

	//Display of time played.
	public static Chronometer timer = new Chronometer(0*tile_size,10*tile_size);
	
	//The amount of milliseconds the game has run.
	public static int mili;
	
	
	//The camera.
	static Dimension screen_d = new Dimension(current_map.width * tile_size,current_map.height * tile_size);
	static Camera cam = new Camera(screen_d);
	
	/* Start the game as normal.*/
	public Game()
	{
		player.x = current_map.spawn_x;
		player.y = current_map.spawn_y;
		play_sound.change_music(0);
	}
	
	/* Checks if a point is in a block.*/
	public static boolean check_col(int xPos,int yPos)
	{
		try
		{
			if(current_map.map[yPos / tile_size][xPos / tile_size] == 1)
			{
				return true;
			}
			return false;
		}
		catch(IndexOutOfBoundsException error)
		{
			System.out.println("Error at xPos:"+xPos+", yPos:"+yPos);
		}
		return true;
	}

	//Frame length of game.
	public int getFrameLength()
	{
		return frame_length;
	}
	
	//TODO: implement better error handling system.
	public static void Error(String mesasage)
	{
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null,mesasage);
		System.exit(1);
	}
	
	public static void NextLevel()
	{
		Camera.x = 0;
		Camera.y = 0;
		level_n++;
		current_map = maps[level_n];
		if(level_n >= maps.length)
		{
			Win();
		}else
		{
			player.x = current_map.spawn_x;
			player.y = current_map.spawn_y;
		}
	}
	public static void GameOver()
	{
		//Error("Gameover.");
		Camera.x = 0;
		Camera.y = 0;
		player.x = current_map.spawn_x;
		player.y = current_map.spawn_y;
		current_map = maps[level_n];
	}
	public static void Win()
	{
		Error("You win!\nThanks for playing!");
	}
	
	//Do not use transparency unless absolutely needed.
	public void draw(Graphics g)
	{	
		//Fill background with Color WHITE
		g.setColor(Color.WHITE);
		g.fillRect(0,0,current_map.width * tile_size,current_map.height * tile_size);
		
		
		//Draw the game map.
		g.setColor(Color.BLACK);
		for(int i = 0;i < current_map.width;i++)
		{
			for(int j = 0;j < current_map.height;j++)
			{
				if(current_map.map[j][i] != 0)
				{
					g.fillRect((tile_size * i)-Camera.x,(tile_size * j)-Camera.y,tile_size,tile_size);
				}
			}
		}
		//Draw a timer
		timer.draw(g);
		
		for(int i = 0;i < current_map.npcs.length;i++)
		{
			current_map.npcs[i].draw(g);
		}
		
		player.draw(g);
	}
	
	public Screen tick(Screen previous_screen)
	{
		mili++;
		
		if(mili % update_length != 0)
		{return null;}
		
		player.update();
		timer.update();
		cam.update();
		
		for(int i = 0;i < current_map.npcs.length;i++)
		{
			current_map.npcs[i].update();
		}
		
		return null;
	}
	
	public void key_on(int key_code)
	{
		player.key_on(key_code);
	}
	
	public void key_off(int key_code)
	{
		player.key_off(key_code);
	}
}