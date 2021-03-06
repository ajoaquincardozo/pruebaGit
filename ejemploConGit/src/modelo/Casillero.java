package modelo;

import java.util.Hashtable;

public abstract class Casillero {
	public Hashtable<String,String> personasAdentro;
	private String nombre;

	public Casillero(String nombreCasillero){
		personasAdentro = new Hashtable<String, String>();
		this.nombre = nombreCasillero;
	}

	public String nombre(){
		return this.nombre;
	}

	public void jugadorCayo(String nombreJugador) {
		this.personasAdentro.put(nombreJugador, "-");
	}

	public void desocuparCasillero(String nombre){
		this.personasAdentro.remove(nombre);
	}
}
