package modelo;

import java.util.ArrayList;

public class Jugador {
	private Casillero posicion;
	private long dinero;
	private String nombre;
	private ArrayList<Propiedad> propiedades; //ver esto
	
	public Jugador(long dineroInicial, Casillero casilleroInicial, String nombreJugador) {
		this.posicion = casilleroInicial;
		this.dinero = dineroInicial;
		this.propiedades = new ArrayList<Propiedad>();
		this.nombre = nombreJugador;
	}
	public void finalizarTurno() {
		
	}
	public void tirarDados() {
		
	}
	public void edificar() {
		
	}

	public String nombre(){
		return this.nombre;
	}

	public long dinero(){
		return this.dinero;
	}

	public void recibirDinero(long dineroaSumar){
		this.dinero += dineroaSumar;
	}

}
