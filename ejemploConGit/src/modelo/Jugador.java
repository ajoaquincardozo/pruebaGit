package modelo;

import java.util.ArrayList;

public class Jugador {
	private Casillero posicion;
	private long dinero;
	private String nombre;
	private ArrayList<Propiedad> propiedades; //ver esto
	private int casillerosAMoverse;

	public Jugador(long dineroInicial, Casillero casilleroInicial, String nombreJugador) {
		this.posicion = casilleroInicial;
		this.dinero = dineroInicial;
		this.propiedades = new ArrayList<Propiedad>();
		this.nombre = nombreJugador;
		this.casillerosAMoverse = 0;
	}

	public Casillero casilleroActual() {
		return this.posicion;
	}


	public boolean pagarFianza(Carcel carcel){
		if (carcel.puedeSalir(this.nombre)){
			carcel.liberar(this.nombre);
			this.dinero -= 45000;
			return true;
		}
		return false;
	}

	public void cambiarCasillero(Casillero otroCasillero) {
		this.posicion.desocuparCasillero(this.nombre);
		this.posicion = otroCasillero;
		otroCasillero.jugadorCayo(this.nombre);
	}


	public void finalizarTurno() {
		
	}

	public void tirarDados(Dados dados) {
		dados.combinacionDeDados();
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


	public int cantidadPropiedades() {
		return this.propiedades.size();
	}

	public int cantidadCasillerosAMoverse(){
		return this.casillerosAMoverse;
	}

	public void setCasillerosAMoverse(int cantCasilleros) {
		this.casillerosAMoverse = cantCasilleros;
	}
}
