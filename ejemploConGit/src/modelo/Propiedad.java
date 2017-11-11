package modelo;

public class Propiedad extends Casillero {
	private  String nombreDuenio;
	
	public Propiedad(){
		super("Propiedad");
		this.nombreDuenio = "hola123";
	}
	
	public void jugadorCayo(Jugador jugador) {
	}

	@Override
	public void desocuparCasillero(String nombre) {

	}

	public String duenio() {
		return nombreDuenio;
	}
	
	public void comprar(String posibleDuenio) {
		if (this.nombreDuenio.isEmpty()) {
			nombreDuenio = posibleDuenio;
		}
	}
}
