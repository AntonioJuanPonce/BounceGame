package MoveGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Map
{
	public int[][] map;
	public int width;
	public int height;
	public int spawn_x;
	public int spawn_y;
	public NPC[] npcs;
	public Map(int[][] map,NPC[] npcs,int spawn_x,int spawn_y)
	{
		this.map = map;
		this.spawn_x = spawn_x;
		this.spawn_y = spawn_y;
		this.npcs = npcs;
		width = map[0].length;
		height = map.length;
	}
	
	/* TODO: implement file reader.*/
	public Map(String filename/*,NPC[] npcs*/)
	{
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			main.Error("The map: "+filename+" could not be found.\nContact "+main.email);
		}
		
		/*
		//code included on stackoverflow.com example, 
		//kept for reference.
		int [] tall = new int [100];
		int i = 0;
		while(scanner.hasNextInt()){
		   tall[i++] = scanner.nextInt();
		}
		*/
	}
	public int[] GetIntArray(Scanner scanner)
	{
		return new int[0];
	}
}