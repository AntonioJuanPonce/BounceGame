package MoveGame;

public class MapsTemp
{
	public static int[][] Data0 =
	{
		{1,1,1,1,1,1,1,1,1,1},
		{1,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,1},
		{1,1,1,1,1,0,0,0,0,1},
		{1,1,1,1,1,0,0,0,0,1},
		{1,1,1,1,1,0,0,0,0,1},
		{1,1,1,1,1,1,1,1,0,1},
		{1,1,1,1,1,1,1,1,0,1},
		{1,1,1,1,1,1,1,1,1,1}
	};
	public static NPC[] NPC0 =
	{
		new Slider(4*main.tile_size,3*main.tile_size,5),
		new Guider(5*main.tile_size,4*main.tile_size,5),
		new Goal(8*main.tile_size,8*main.tile_size),
	};
	public static int[][] Data1 = 
	{
		{1,1,1,1,1,1,1,1,1,1},
		{1,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,1},
		{1,1,1,1,1,1,1,1,0,1},
		{1,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,1},
		{1,0,1,1,1,1,1,1,1,1},
		{1,0,0,0,0,0,0,0,0,1},
		{1,1,1,1,1,1,1,1,1,1}
	};
	public static NPC[] NPC1 =
	{
		new Goal(8*main.tile_size,8*main.tile_size),		//0
		new Slider(3*main.tile_size,1*main.tile_size,5),	//1
		new Slider(4*main.tile_size,1*main.tile_size,5),	//2
		new Slider(5*main.tile_size,1*main.tile_size,5),	//3
		new Slider(6*main.tile_size,1*main.tile_size,5),	//4
		new Slider(7*main.tile_size,1*main.tile_size,5),	//5
		new Guider(1*main.tile_size,5*main.tile_size,5),	//6
		new Guider(8*main.tile_size,6*main.tile_size,5),    //7
	};
	public static int[][] Data2 = 
	{
				
		{1,1,1,1,1,1,1,1,1,1},
		{1,0,1,0,0,0,0,0,0,1},
		{1,0,1,0,0,0,0,0,0,1},
		{1,0,1,1,1,1,1,1,0,1},
		{1,0,0,0,1,0,0,0,0,1},
		{1,0,0,0,1,0,0,0,0,1},
		{1,0,0,0,1,0,0,0,0,1},
		{1,0,0,0,1,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,1},
		{1,1,1,1,1,1,1,1,1,1}
	};
	public static NPC[] NPC2 =
		{
			new Slider(2*main.tile_size,4*main.tile_size,3),
			new Slider(3*main.tile_size,4*main.tile_size,3),
			new Bouncer(5*main.tile_size,(int) (5.5*main.tile_size),10),
			new Door(1*main.tile_size,2*main.tile_size,3*main.tile_size,2*main.tile_size),
			new Goal(1*main.tile_size,1*main.tile_size)
		};
	public static int[][] Data3 =
	{
		{1,1,1,1,1,1,1,1,1,1},
		{1,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,1,0,1},
		{1,0,0,0,0,0,0,1,0,1},
		{1,0,0,0,0,0,0,1,0,1},
		{1,0,0,0,0,0,0,1,0,1},
		{1,0,0,0,0,0,0,1,0,1},
		{1,0,0,0,0,0,0,1,0,1},
		{1,0,0,0,0,0,0,1,0,1},
		{1,1,1,1,1,1,1,1,1,1}
	};
	public static NPC[] NPC3 =
	{
		new Goal(8*main.tile_size,8*main.tile_size),
		new Timicide(7*main.tile_size,1*main.tile_size,1000,15),
		new Bouncer(5*main.tile_size,5*main.tile_size,5),
		new Bouncer(2*main.tile_size,3*main.tile_size,5),
		new Bouncer(6*main.tile_size,2*main.tile_size,5)
		//new Slider(1*main.tile_size,7*main.tile_size,5),
		//new Slider(6*main.tile_size,7*main.tile_size,5)
		//new Sentry2(4*main.tile_size,5*main.tile_size)
		//new Sentry(4*main.tile_size,5*main.tile_size)
	};
	public static int[][] Data4 =
	{
		{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
		{1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
		{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
		
	};
	public static NPC[] NPC4 =
	{
		new Bouncer(main.tile_size*10,main.tile_size*1,5),
		new Bouncer(main.tile_size*10,main.tile_size*2,5),
		new Bouncer(main.tile_size*10,main.tile_size*3,5),
		new Bouncer(main.tile_size*10,main.tile_size*4,5),
		new Bouncer(main.tile_size*10,main.tile_size*5,5),
		new Bouncer(main.tile_size*11,main.tile_size*1,5),
		new Bouncer(main.tile_size*11,main.tile_size*2,5),
		new Bouncer(main.tile_size*11,main.tile_size*3,5),
		new Bouncer(main.tile_size*11,main.tile_size*4,5)
	};
	public static Map[] maps = 
	{
		new Map(Data0,NPC0,1*main.tile_size,1*main.tile_size),
		new Map(Data1,NPC1,1*main.tile_size,1*main.tile_size),
		new Map(Data2,NPC2,1*main.tile_size,3*main.tile_size),
		new Map(Data3,NPC3,1*main.tile_size,1*main.tile_size),
		new Map(Data4,NPC4,1*main.tile_size,1*main.tile_size)
	};
}