package modelo;

import org.junit.Assert;
import org.junit.Test;


public class CarcelTest {

    private Carcel inicializarJugadorEnCarcel(int cantCaidas, long dineroInicial, String nombreJugador  ){
        Casillero carcel = new Carcel("Carcel");
        Jugador jugador = new Jugador(dineroInicial, carcel,"Pablo");
        Carcel carcel1 = (Carcel) carcel;
        for (int i = 0; i < cantCaidas ; i++) {
            carcel1.jugadorCayo(jugador);
        }
        return carcel1;
    }


    @Test
    public void alCaerEnLaCarcelElJugadorNoPuedeJugar(){
        String nombreJugador = "Pablo";
        Carcel carcel1 = inicializarJugadorEnCarcel(1,0, nombreJugador);
        Assert.assertFalse(carcel1.puedeSalir(nombreJugador));
    }

    @Test
    public void alPasarUnTurnoElJugadorPuedePagarUnaFianzaParaSalirDeLaCarcel(){
        String nombreJugador1 = "Pablo";
        String nombreJugador2 = "Juan";
        Carcel carcel1 = inicializarJugadorEnCarcel(2,0, nombreJugador1);
        Carcel carcel2 = inicializarJugadorEnCarcel(3,0,nombreJugador2);
        Assert.assertTrue(carcel1.puedeSalir(nombreJugador1));
//        Assert.assertTrue(carcel2.puedeSalir(nombreJugador2));
    }


    @Test
    public void alPasar3TurnosCompletosEnEl4toTurnoEljugadorSaleDeLaCarcel(){
        String nombreJugador = "Pablo";
        Carcel carcel1 = inicializarJugadorEnCarcel(4,0, nombreJugador);
        Assert.assertTrue(carcel1.esLibre(nombreJugador));
    }


    @Test
    public void alPagarLaFianzaElJugadorSaleDeLaCarcel(){
        Casillero carcel = new Carcel("Carcel");
        Jugador jugador = new Jugador(45000, carcel,"Pablo");
        Carcel carcel1 = (Carcel) carcel;
        carcel1.jugadorCayo(jugador);
        carcel1.jugadorCayo(jugador);

        jugador.pagarFianza(carcel1);
        Assert.assertTrue(carcel1.esLibre(jugador.nombre()));
    }

}