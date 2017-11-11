package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Tablero {
	private Casillero[] casilleros;
	private static int cantCasilleros = 20;
	private Jugador jugadorActual = null;
	private String accionesPosibles[] = {}; 
	
	public Tablero() {
		this.casilleros = new Casillero[cantCasilleros];
	}

	public void saltarTurno(){

	}

	public void moverJugadorEnCasillero(int cantPosicionesAMover, Jugador jugador){
		int posicion = this.posicionJugadorEnTablero(jugador.casilleroActual());
		if ( (posicion + cantPosicionesAMover)  < cantCasilleros  ){
			int nuevaPosicion = posicion + cantPosicionesAMover;
			jugador.cambiarCasillero(casilleros[nuevaPosicion]);
		} else {
			int posicionSobrepasada = (posicion + cantPosicionesAMover);
			int posiscionDesdeSalida =  posicionSobrepasada - cantCasilleros;
			jugador.cambiarCasillero(casilleros[posiscionDesdeSalida]);
		}
	}

	public int posicionJugadorEnTablero(Casillero casillero){
		Casillero otroCasillero= this.casilleros[0];
		int posicionCasillero = 0;
		while( casillero != otroCasillero){
			posicionCasillero += 1;
			otroCasillero = this.casilleros[posicionCasillero];
		}

		return posicionCasillero;
	}
}
