package MoveGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Start_Menu implements Screen
{	
	public Color background_c = Color.WHITE;
	public Color frame_c = Color.BLACK;
	public int frame_thick = 10;
	
	public Color title_c = Color.BLACK;
	public String title = "Bounce Game.";
	public int titlebar_height = 75;
	public Font title_f = new Font("Consolas",Font.BOLD,(int) (titlebar_height * .85));
	
	@Override
	public void draw(Graphics g)
	{
		//Draw the frame.
		g.setColor(frame_c);
		g.fillRect(0, 0, main.screen_d.width, main.screen_d.height);
		g.setColor(background_c);
		g.fillRect
		(
			frame_thick,
			frame_thick,
			main.screen_d.width - (frame_thick * 2),
			main.screen_d.height - (frame_thick * 2)
		);
		
		//Draw the title-bar frame
		g.setColor(frame_c);
		g.fillRect
		(
			0,
			frame_thick + titlebar_height,
			main.screen_d.width,
			frame_thick
		);
		
		g.setColor(title_c);
		g.setFont(title_f);
		g.drawString
		(
			title,
			frame_thick,
			titlebar_height
		);
		
	}

	@Override
	public int getFrameLength()
	{
		
		return 1;
	}

	@Override
	public Screen tick(Screen previous_screen)
	{
		return null;
	}

	@Override
	public void key_on(int key_code)
	{

	}

	@Override
	public void key_off(int key_code)
	{

	}

}
