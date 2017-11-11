
package modelo;

import java.util.Hashtable;

public class Carcel extends Evento {
	private Hashtable<String,Integer> encarcelados;

	public Carcel(){
		encarcelados = new Hashtable<>();
	}


	public void liberar(String nombre){
		this.encarcelados.remove(nombre);
	}

	@Override
	public void aplicarEfecto(Jugador jugador) {
		int numTurnosEnlaCarcel;
		if (! encarcelados.containsKey(jugador.nombre()) ){
			numTurnosEnlaCarcel = 0;
			encarcelados.put(jugador.nombre(), numTurnosEnlaCarcel);
		} else {
			Integer valor = encarcelados.get(jugador.nombre());
			numTurnosEnlaCarcel = valor;
		}

		if (numTurnosEnlaCarcel == 3){
			liberar(jugador.nombre());
		} else {
			encarcelados.put(jugador.nombre(),numTurnosEnlaCarcel+1);
		}
	}

	public boolean puedeSalir(Jugador jugador) {
		return this.encarcelados.get(jugador.nombre()) == 1;
	}

}

