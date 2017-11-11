package modelo;

import java.util.Hashtable;

public class Carcel extends Evento {
	private Hashtable<String,Integer> encarcelados;

	public Carcel(){
		encarcelados = new Hashtable<String, Integer>();
	}

	@Override
	public void aplicarEfecto(Jugador jugador) {
		System.out.println("Me falta implementacion");
	}

	public void jugadorCayo(Jugador jugador) {
		// TODO Auto-generated method stub
		System.out.println("hola");
	}

	@Override
	public void desocuparCasillero(String nombre) {

	}

}
