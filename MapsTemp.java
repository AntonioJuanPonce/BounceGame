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
		new Slider(4*Game.tile_size,3*Game.tile_size,5),
		new Guider(5*Game.tile_size,4*Game.tile_size,5),
		new Goal(8*Game.tile_size,8*Game.tile_size),
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
		{1,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,1},
		{1,0,1,1,1,1,1,1,1,1},
		{1,0,0,0,0,0,0,0,0,1},
		{1,1,1,1,1,1,1,1,1,1}
	};
	public static NPC[] NPC1 =
	{
		new Goal(8*Game.tile_size,10*Game.tile_size),
		new Slider(3*Game.tile_size,1*Game.tile_size,5),
		new Slider(4*Game.tile_size,1*Game.tile_size,5),
		//new Slider(5*Game.tile_size,1*Game.tile_size,5),
		//new Slider(6*Game.tile_size,1*Game.tile_size,5),
		new Slider(7*Game.tile_size,1*Game.tile_size,5),
		new Guider(1*Game.tile_size,5*Game.tile_size,5),
		new Guider(1*Game.tile_size,6*Game.tile_size,5),
		new Guider(8*Game.tile_size,7*Game.tile_size,5),
		new Guider(8*Game.tile_size,8*Game.tile_size,5)
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
			new Slider(2*Game.tile_size,4*Game.tile_size,3),
			new Slider(3*Game.tile_size,4*Game.tile_size,3),
			new Bouncer(5*Game.tile_size, 5*Game.tile_size,10),
			new Door(1*Game.tile_size,2*Game.tile_size,3*Game.tile_size,2*Game.tile_size),
			new Goal(1*Game.tile_size,1*Game.tile_size)
		};
	public static int[][] Aidanlvl = 
		{
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,0,0,0,0,0,0,1,1,0,0,0,1},
			{1,0,0,1,1,0,1,0,0,0,0,0,0,1},
			{1,0,1,1,0,1,1,0,0,1,0,0,0,1},
			{1,0,0,0,0,0,1,0,0,1,0,0,0,1},
			{1,0,0,0,0,0,1,0,0,1,0,0,0,1},
			{1,0,1,1,0,1,1,1,0,1,0,0,0,1},
			{1,0,0,1,1,0,1,0,0,1,0,0,0,1},
			{1,1,0,0,0,0,0,0,1,1,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,1,1,1,0,1,1,1,0,1,1,1,1},
			{1,0,0,0,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1},
		};
	public static NPC[] AidanNPC =
		{
			//sliders slide up
			new Slider(1*Game.tile_size,3*Game.tile_size,2),
			new Slider(8*Game.tile_size,3*Game.tile_size,2),
			//new Slider(7*Game.tile_size,3*Game.tile_size,4),
			new Guider(2*Game.tile_size,8*Game.tile_size,3),
			new Guider(2*Game.tile_size,1*Game.tile_size,3),
			new Guider(3*Game.tile_size,10*Game.tile_size,2),
			new Goal(5*Game.tile_size,5*Game.tile_size),
			new Bouncer(11*Game.tile_size,2*Game.tile_size,5),
			new Door(10*Game.tile_size,2*Game.tile_size,11*Game.tile_size,6*Game.tile_size)
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
		{1,0,0,0,0,0,0,1,0,1},
		{1,0,0,0,0,0,0,1,0,1},
		{1,0,0,0,0,0,0,1,0,1},
		{1,1,1,1,1,1,1,1,1,1}
	};
	public static NPC[] NPC3 =
	{
		new Goal(8*Game.tile_size,10*Game.tile_size),
		new Timicide(7*Game.tile_size,1*Game.tile_size,1000,10),
		new Bouncer(5*Game.tile_size,5*Game.tile_size,5),
		new Bouncer(2*Game.tile_size,3*Game.tile_size,3),
		new Bouncer(6*Game.tile_size,2*Game.tile_size,4)
		//new Slider(1*Game.tile_size,7*Game.tile_size,5),
		//new Slider(6*Game.tile_size,7*Game.tile_size,5)
		//new Sentry2(4*Game.tile_size,5*Game.tile_size)
		//new Sentry(4*Game.tile_size,5*Game.tile_size)
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
		new Bouncer(Game.tile_size*10,Game.tile_size*1,5),
		new Bouncer(Game.tile_size*10,Game.tile_size*2,5),
		new Bouncer(Game.tile_size*10,Game.tile_size*3,5),
		new Bouncer(Game.tile_size*10,Game.tile_size*4,5),
		new Bouncer(Game.tile_size*10,Game.tile_size*5,5),
		new Bouncer(Game.tile_size*11,Game.tile_size*1,5),
		new Bouncer(Game.tile_size*11,Game.tile_size*2,5),
		new Bouncer(Game.tile_size*11,Game.tile_size*3,5),
		new Bouncer(Game.tile_size*11,Game.tile_size*4,5)
	};
	public static Map[] maps = 
	{
		new Map(Data0,NPC0,1*Game.tile_size,1*Game.tile_size),
		new Map(Data1,NPC1,1*Game.tile_size,1*Game.tile_size),
		new Map(Data2,NPC2,1*Game.tile_size,3*Game.tile_size),
		new Map(Data3,NPC3,1*Game.tile_size,1*Game.tile_size),
		new Map(Aidanlvl,AidanNPC,2*Game.tile_size,12*Game.tile_size),
		new Map(Data4,NPC4,1*Game.tile_size,1*Game.tile_size)
	};
}