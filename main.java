package MoveGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.WindowConstants;

class main extends JComponent implements ActionListener
{
	//Starting screen.
	public static Screen current_screen = new Start_Menu();
	
	public static Screen previous_screen = null;
	
	public static final int tile_size = 48;
	
	public static Dimension screen_d = new Dimension(10*tile_size,10*tile_size);
	
	//Window
	public static JFrame window = new JFrame("Bounce Game.");
	
	public static int time_in_milli = 0;
	
	public static void main(String[] args)
	{
		main main = new main();
		
		
		
		window.add(main);
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		BufferedImage image = null;
        try {
            image = ImageIO.read(
                    main.getClass().getResource("Icon.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        window.setIconImage(image);
		
		window.setVisible(true);
		
		window.addKeyListener
		(
			new KeyListener()
			{

				@Override
				public void keyPressed(KeyEvent e)
				{
					current_screen.key_on(e.getKeyCode());
				}

				@Override
				public void keyReleased(KeyEvent e)
				{
					current_screen.key_off(e.getKeyCode());
				}
				@Override
				public void keyTyped(KeyEvent e)
				{
					current_screen.key_on(e.getKeyCode());
				}
			}
		);
		
		
		Timer time = new Timer(1,main);
		time.start();
	}

	@Override
	public Dimension getPreferredSize()
	{
		return screen_d;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		time_in_milli++;
		
		if(time_in_milli % current_screen.getFrameLength() == 0)
		{repaint();}
		
		Screen temp_screen = current_screen.tick(previous_screen);
		if(temp_screen != null)
		{
			System.out.println("The screen changed.");
			
			previous_screen = current_screen;
			current_screen = temp_screen;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		current_screen.draw(g);
	}
}