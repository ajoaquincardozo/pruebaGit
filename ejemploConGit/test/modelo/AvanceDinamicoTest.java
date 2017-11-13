package modelo;

import org.junit.Test;

import org.junit.Assert;

public class AvanceDinamicoTest {

    private void agregarPropiedadesSegunCantidad(Jugador jugador, int cantidadPropiedades){
        for (int i = 0; i < cantidadPropiedades; i++) {
            jugador.agregarPropiedad(new Propiedad());
        }
    }


    private Jugador inicializarJugadorConCaidaEnQuini6(int sumaDados,String nombreJugador ,long dineroInicial, int cantidadPropiedades){
        Casillero avanceDinamico = new AvanceDinamico("Avance  Dinamico");
        Jugador jugador = new Jugador(dineroInicial,avanceDinamico,nombreJugador);
        Dados dados = new Dados();
        jugador.tirarDados(dados);
        jugador.setCasillerosAMoverse(sumaDados);
        agregarPropiedadesSegunCantidad(jugador,cantidadPropiedades);
        ((Evento) avanceDinamico).jugadorCayo(jugador);
        return jugador;
    }


    @Test
    public void alCaerEnAvanceDinamicoConNumeroMenorA7ElAvanceDependeDeLaSumaDeDadosMenos2(){
        Jugador jugador = inicializarJugadorConCaidaEnQuini6(6 ,"Pablo",0,0);
        Assert.assertEquals(4,jugador.cantidadCasillerosAMoverse());
    }


    @Test
    public void alCaerEnAvanceDinamicoConNumerosMayoresA6yMenoresA11ElAvanceDependeDelaCantidadDeDineroYlaCantidadDeDados(){
        Jugador jugador = inicializarJugadorConCaidaEnQuini6(9 ,"Pablo",50000,0);
        Assert.assertEquals(5,jugador.cantidadCasillerosAMoverse());
    }

    @Test
    public void alCaerEnAvanceDinamicoConNumerosMayoresA10YConPropiedadesElAvanceDependeDeLaSumaDeDadosMenosLaCantidadDePropiedades(){
        Jugador jugador = inicializarJugadorConCaidaEnQuini6(12 ,"Pablo",50000,3);
        Assert.assertEquals(9,jugador.cantidadCasillerosAMoverse());
    }

    @Test
    public void alCaerEnAvanceDinamicoConNumeroMayorA10YSinPropiedadesNoAvanzo(){
        Jugador jugador = inicializarJugadorConCaidaEnQuini6(11 ,"Pablo",50000,0);
        Assert.assertEquals(11,jugador.cantidadCasillerosAMoverse());
    }

}