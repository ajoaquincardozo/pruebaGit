package modelo;

import java.util.Hashtable;

public class Quini6 extends Evento{

    private Hashtable<String,Integer> historialDePaso;
    private static long premiosPorCaida[] = { 50000, 30000 };

    public Quini6(){
        super();
        historialDePaso = new Hashtable<String, Integer>();
    }

    public void darPremioPorCaida(int numCaida, Jugador jugador){
        if (numCaida == 0 || numCaida == 1){
            jugador.recibirDinero( premiosPorCaida[numCaida]);
        }
    }

    @Override
    public void desocuparCasillero(String nombre) {
    }

    public void aplicarEfecto(Jugador jugador) {
        int numCaida;
        if (! historialDePaso.containsKey(jugador.nombre()) ){
            historialDePaso.put(jugador.nombre(), 0);
            numCaida = 0;
        } else {
            Integer valor = historialDePaso.get(jugador.nombre());
            numCaida = valor;
        }
        darPremioPorCaida(numCaida,jugador);
        historialDePaso.put(jugador.nombre(),numCaida+1);
    }

}
