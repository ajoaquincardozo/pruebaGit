package modelo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Tablero {
	private Casillero[] casilleros;
	private static int cantCasilleros = 20;
	private Jugador jugadorActual = null;
	private static List<String> accionesPosibles = new LinkedList<String>(Arrays.asList("Comprar ","Tirar Dados","Pasar Turno"));

	private void cargarTablero(){
	}

	public Tablero() {
		this.casilleros = new Casillero[cantCasilleros];
	}

	public List<String> accionesPosibles(Jugador jugador){
		Casillero casillero = jugador.casilleroActual();
		if ( casillero.nombre().equals("CARCEL") ){
			List<String> accionesPosibles = new LinkedList<String>(Arrays.asList("Pasar Turno"));
			if ( ((Carcel)casillero).puedeSalir(jugador.nombre()) ){
				accionesPosibles.add(0,"Pagar Fianza");
			}
			return accionesPosibles;
		}
		return this.accionesPosibles;
	}

	public int posicionJugadorEnTablero(Casillero casillero){
		Casillero otroCasillero = this.casilleros[0];
		int posicionCasillero = 0;
		while( casillero != otroCasillero){
			posicionCasillero += 1;
			otroCasillero = this.casilleros[posicionCasillero];
		}
		return posicionCasillero;
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

}
