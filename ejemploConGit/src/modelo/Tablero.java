package modelo;

import java.util.ArrayList;

public class Tablero {
	private ArrayList<Casillero> casilleros;
	private static int cantCasilleros = 20;
	private Jugador jugadorActual = null;
	private String accionesPosibles[] = {}; 
	
	public Tablero() {
		this.casilleros = new ArrayList<Casillero>(cantCasilleros);
	}
}
