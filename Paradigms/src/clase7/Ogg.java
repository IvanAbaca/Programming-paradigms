package clase7;

public class Ogg implements Playable {

	@Override
	public void reproducir(String cancion) {
		System.out.println("Reproduciendo desde ogg... " + cancion);
	}

}
