package MoveGame;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Particle extends NPC
{
	public int x_speed;
	public int y_speed;
	public int life;
	public int size;
	
	public double speed_inv;
	
	public boolean alive = true;
	
	/*
	 * Give the particle random property's,
	 * great for explosions.
	 */
	public Particle(int x, int y, Color c)
	{
		super(x, y);
		Random rng = new Random();
		
		
		x_speed = rng.nextInt(2);
		if(rng.nextBoolean()){x_speed*=-1;}
		
		y_speed = rng.nextInt(2);
		if(rng.nextBoolean()){y_speed*=-1;}
		
		
		speed_inv = rng.nextInt(8) + 1;
		
		
		life = rng.nextInt(1000) + 500;
		
		
		size = rng.nextInt(tile_size) + 1;
		
		
		this.c = c;
	}

	/* 
	 * Give the particle random property's
	 * except for size and life, 
	 * great for explosions. 
	 * */
	public Particle(int x, int y, int life, int size, Color c)
	{
		super(x,y);
		Random rng = new Random();
		
		x_speed = rng.nextInt(2) + 1;
		if(rng.nextBoolean()){x_speed*=-1;}
		
		y_speed = rng.nextInt(2) + 1;
		if(rng.nextBoolean()){y_speed*=-1;}
		
		speed_inv = rng.nextInt(3) + 5;
		
		this.life = life;
		
		this.size = size;
		
		
		this.c = c;
	}
	
	/*
	 * Fully Controlled Particle.
	 */
	public Particle(int x, int y, int life, int size, int x_speed, int y_speed, int speed_inv, Color c)
	{
		super(x,y);
		
		this.x_speed = x_speed;
		
		this.y_speed = y_speed;
		
		
		this.speed_inv = speed_inv;
		
		
		this.life = life;
		
		
		this.size = size;
		
		
		this.c = c;
	}
	@Override
	public void update()
	{
		if(!alive){return;}
		
		/* Take off a millisecond of the particles life,
		 *  then check if its alive. Negative values result
		 *  in infinite life.*/
		if(life == 0){alive = false;}
		else{life--;}
		
		/* Slow down particle.*/
		if(Game.mili % speed_inv != 0){return;}
		
		x+=x_speed;
		y+=y_speed;
		
	}
	
	@Override
	public void draw(Graphics g)
	{
		if(!alive){return;}
		
		if(life <= 255)
		{
			c = new Color(c.getRed(), c.getGreen(), c.getBlue(), life);
		}
		
		g.setColor(c);
		g.fillRect(x-Camera.x,y-Camera.y,size,size);
	}
	
}