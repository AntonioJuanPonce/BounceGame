/*
 * MoveGame by Antonio Ponce.
 * */
package MoveGame;

import java.applet.AudioClip;
//Graphics
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

//Input and time.
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

/* main is an underling of JComponent.*/
public class main extends JComponent implements ActionListener
{
	//My email address to throw at the user when an error occurs
	public static String email = "improbablynotaspider@gmail.com";
	
	//Sound
	public static PlaySound play_sound = new PlaySound();
	
	//JFrame in which the game is drawn in.
	public static JFrame window = new JFrame("Move game.");

	//Game constants
	public static final int tile_size = 48;
	public static final int frame_length = 1;

	//Playable maps
	public static Map[] maps = MapsTemp.maps/*{new Map(data,1*tile_size,3*tile_size)}*/;
	
	//Level number
	public static int level_n = 0;
		
	//Player.
	public static Player player =  new Player(maps[level_n].spawn_x,maps[level_n].spawn_y);
	
	//The amount of milliseconds the game has run.
	public static int mili;
	
	
	//The camera.
	static Dimension screen_d = new Dimension(maps[level_n].width * tile_size,maps[level_n].height * tile_size);
	static Camera cam = new Camera(screen_d);
	
	/* Checks if a point is in a block.*/
	public static boolean check_col(int xPos,int yPos)
	{
		try
		{
			if(maps[level_n].map[yPos / tile_size][xPos / tile_size] == 1)
			{
				return true;
			}
			return false;
		}
		catch(Exception error)
		{
			Error("Something went out of bounds\nContact "+email);
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException
	{
		play_sound.change_music(0);
		main main = new main();
		window.add(main);
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.addKeyListener(new KeyListener() {
	          @Override
	          public void keyTyped(KeyEvent e){}
	          @Override
	          public void keyPressed(KeyEvent e) 
	          {
	        	  if(e.getKeyCode() == 32){NextLevel();}
	        	  player.key_on(e.getKeyCode());
	          }
	          @Override
	          public void keyReleased(KeyEvent e)
	          {
	        	  player.key_off(e.getKeyCode());
	          }
	      });
		Timer t = new Timer(frame_length,main);
		t.start();
	}
	@Override
	public Dimension getPreferredSize()
	{
		return screen_d;
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
		if(level_n >= maps.length)
		{
			Win();
		}else
		{
			player.x = maps[level_n].spawn_x;
			player.y = maps[level_n].spawn_y;
		}
	}
	public static void GameOver()
	{
		Error("Gameover.");
	}
	public static void Win()
	{
		Error("You win!\nThanks for playing!");
	}
	
	//Do not use transparency unless absolutely needed.
	protected void paintComponent(Graphics g)
	{
		//Fill background with Color WHITE
		g.setColor(Color.WHITE);
		g.fillRect(0,0,maps[level_n].width * tile_size,maps[level_n].height * tile_size);
		
		//Draw the game map.
		g.setColor(Color.BLACK);
		for(int i = 0;i < maps[level_n].width;i++)
		{
			for(int j = 0;j < maps[level_n].height;j++)
			{
				if(maps[level_n].map[j][i] != 0)
				{
					g.fillRect((tile_size * i)-Camera.x,(tile_size * j)-Camera.y,tile_size,tile_size);
				}
			}
		}
		
		for(int i = 0;i < maps[level_n].npcs.length;i++)
		{
			maps[level_n].npcs[i].draw(g);
		}
		
		player.draw(g);
	}
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		mili++;
		player.update();
		cam.update();
		
		for(int i = 0;i < maps[level_n].npcs.length;i++)
		{
			maps[level_n].npcs[i].update();
		}
		repaint();
	}
}