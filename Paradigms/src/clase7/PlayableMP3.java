package clase7;

public class PlayableMP3 implements Playable  {

	private MP3 adaptado;
	
	public PlayableMP3(MP3 adaptado) {
		this.adaptado = adaptado;
	}
	
	@Override
	public void reproducir(String cancion) {
		adaptado.reproduccionMP3(cancion);
		
	}
}
