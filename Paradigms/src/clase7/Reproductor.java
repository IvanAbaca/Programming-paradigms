package clase7;

public class Reproductor {
	
	public static void main(String[] args) {
		
		Ogg ogg = new Ogg();
		MP3 mp3 = new MP3();
		PlayableMP3 mp3Adapter = new PlayableMP3(mp3);
		
		ogg.reproducir("Cancionrandom");
		mp3Adapter.reproducir("Cancionrandom");
	}
}
