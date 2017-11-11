package modelo;

import java.util.Hashtable;

public abstract class Casillero {
	public Hashtable<String,String> personasAdentro;

	public Casillero(){
		personasAdentro = new Hashtable<String, String>();
	}

	public void jugadorCayo(String nombreJugador) {
		this.personasAdentro.put(nombreJugador, "-");
	}

	public void desocuparCasillero(String nombre){
		this.personasAdentro.remove(nombre);
	}
}
