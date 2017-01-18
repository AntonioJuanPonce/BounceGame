package MoveGame;
import java.awt.Graphics;

public interface Screen
{
	void draw(Graphics g);
	
	int getFrameLength();
	
	Screen tick(Screen previous_screen);
	
	void key_on(int key_code);
	
	void key_off(int key_code);
}