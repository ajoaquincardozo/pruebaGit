package modelo;

public abstract class Evento extends Casillero {

	public Evento(){
		super();
	}

	public abstract void aplicarEfecto(Jugador jugador);

	public void jugadorCayo(Jugador jugador){
		super.jugadorCayo(jugador.nombre());
		this.aplicarEfecto(jugador);
	}
}