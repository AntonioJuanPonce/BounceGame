package MoveGame;

import java.applet.AudioClip;

import javax.swing.JApplet;

public class PlaySound
{	
	//The song that is currently playing
	public int current_id = -1;
	
	public AudioClip music[] =
	{
		JApplet.newAudioClip(getClass().getResource("Portal Soundtrack - Taste of Blood.wav")),
	};
	
	public AudioClip sound[] =
	{
		JApplet.newAudioClip(getClass().getResource("Portal gun Shooting Sound Effect.wav")),
		//JApplet.newAudioClip(getClass().getResource(""))
	};
	public void play_sound(int sound_id)
	{
		if(sound_id >= sound.length)
		{
			System.out.println("ERROR: Sound "+sound_id+" does not exist.");
		}
		
		sound[sound_id].play();
	}
	
	public void change_music(int song_id)
	{
		if(song_id >= music.length)
		{
			System.out.println("ERROR: Song "+song_id+" does not exist.");
			return;
		}
		
		if(current_id == -1)
		{
			music[song_id].loop();
			current_id = song_id;
		}else if(current_id != song_id)
		{
			music[current_id].stop();
			music[song_id].loop();
			current_id = song_id;
		}
	}
}