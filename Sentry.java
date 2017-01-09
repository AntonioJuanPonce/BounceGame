package MoveGame;

import java.awt.Color;
import java.awt.Graphics;

public class Sentry extends NPC {
	//Visible ray that kills the player
	public int ray_x;
	public int ray_y;
	//Invisible ray that determines if a real ray should be fired.
	//It will only fire if it manages to connect with the player.
	private int inv_ray_x;
	private int inv_ray_y;
	
	public Sentry(int x, int y) {
		super(x, y);
		this.x = x;
		this.y = y;
		c = Color.YELLOW;
	}
	
	public void update()
	{
	int targetx = main.player.x;
	int targety = main.player.y;
	
	}
	@Override
	public void draw(Graphics g)
	{
		g.setColor(c);
		g.fillRect(x,y,main.tile_size,main.tile_size);
		g.drawLine(x + 24, y + 24, main.player.x + 24, main.player.y + 24);
		while(check_col2(inv_ray_x,inv_ray_y,main.player.x,main.player.y)) {
			
		}
	}
	public int[] axb(int x1, int y1, int x2, int y2){
		
		return new int[2];
	}
	//This draws a ray to the player.  If it collides, fire away.
	private boolean check_col2(int inv_ray_x2, int inv_ray_y2, int x, int y) {
		if((x > main.player.x) && y > (main.player.y)) {
			if((x < main.player.x + main.tile_size) && (y < main.player.y + main.tile_size)){
				return true;
			}
		}
		return false;
	}
	public boolean hit_player() {
		Line line = new Line(inv_ray_x,inv_ray_y,main.player.x,main.player.y);
		while(true) {
			main.check_col(ray_x,ray_y);
		}
	}
}