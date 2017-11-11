package modelo;

import org.junit.Assert;
import org.junit.Test;

public class Quini6Test {

    private Jugador inicializarJugadorConCaidaEnQuini6(int cantCaidas, long dineroInicial){
        Casillero quini6 = new Quini6();
        Jugador jugador = new Jugador(dineroInicial, quini6,"Pablo");
        for (int i = 0; i < cantCaidas ; i++) {
            Quini6 quini = (Quini6) quini6;
            quini.jugadorCayo(jugador);
        }
        return jugador;
    }

    @Test
    public void alPasarPorCasilleroUnaVezCobra50000DePremio() {
        Jugador jugadorCon1Caida = inicializarJugadorConCaidaEnQuini6(1,0);
        Assert.assertEquals(50000, jugadorCon1Caida.dinero());
    }

    @Test
    public void alPasarPorCasilleroPor2daVezCobra30000DePremio(){
        Jugador jugadorCon2Caidas = inicializarJugadorConCaidaEnQuini6(2,0);
        Assert.assertEquals( 80000, jugadorCon2Caidas.dinero());
    }

    @Test
    public void alPasarPorCasilleroPorMasDe2daVecesNoRecibeNadaDePremio(){
        Jugador jugadorCon3Caidas = inicializarJugadorConCaidaEnQuini6(3,0);
        Jugador jugadorCon80Caidas = inicializarJugadorConCaidaEnQuini6(80,20000);
        Assert.assertEquals(80000, jugadorCon3Caidas.dinero());
        Assert.assertEquals(100000, jugadorCon80Caidas.dinero());
    }
}