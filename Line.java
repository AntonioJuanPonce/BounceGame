package MoveGame;

public class Line
{
	public int a = 0;
	public int b = 0;
	
	public Line(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public Line(int x1,int y1,int x2,int y2)
	{
		try
		{
			a = (y2-y1)/(x2 - x1);
			b = x1 + a*(x1-x2);
		}catch(ArithmeticException Error)
		{	
		}
	}
	
	public int y_at_x(int x)
	{
		return a*x+b;
	}
	
	/* Not implemented. */
	public int x_at_y(int y)
	{
		return 0;
	}
}




