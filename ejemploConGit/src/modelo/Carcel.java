
package modelo;

import java.util.Hashtable;

public class Carcel extends Evento {
	private Hashtable<String,Integer> encarcelados;

	public Carcel(String nombreCasillero){
		super(nombreCasillero);
		encarcelados = new Hashtable<>();
	}


	public void liberar(String nombre){
		this.encarcelados.remove(nombre);
	}

	public boolean esLibre(String nombre){
		return this.encarcelados.containsKey(nombre) == false;
	}

	@Override
	public void aplicarEfecto(Jugador jugador) {
		if ( this.encarcelados.containsKey(jugador.nombre()) ){
			this.encarcelados.put(jugador.nombre(),this.encarcelados.get(jugador.nombre()) + 1);
		}

		int numTurnosEnlaCarcel;
		if (! this.encarcelados.containsKey(jugador.nombre()) ){
			numTurnosEnlaCarcel = 0;
			this.encarcelados.put(jugador.nombre(), numTurnosEnlaCarcel);
		} else {
			Integer valor = this.encarcelados.get(jugador.nombre());
			numTurnosEnlaCarcel = valor;
		}
		if (numTurnosEnlaCarcel == 3) {
			this.liberar(jugador.nombre());
		}
	}

	public boolean puedeSalir(String nombre){
		//Hay que hacer una validacion para que no pueda entrar aca, sino existe.
		return this.encarcelados.get(nombre) >= 1;
	}

}

