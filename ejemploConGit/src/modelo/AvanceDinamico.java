package modelo;

public class AvanceDinamico extends Evento {

    //Logica
    // El jugador avanzar tantos casilleros como lo indica los dados(extremos incluidos):
    // 2 a 6   ---> Avanza el numero sacado - 2;
    // 6 a 10  ---> Avanza #cantidad de efectivo % numero sacado
    // 11 o 12 --.> Avanza numero sacado menos la sumatoria de propiedades del jugador. Tanto los terrenos como casas, como los hoteles suman como propiedad

    public AvanceDinamico(String nombreCasillero){
        super("Avance Dinamico");
    }

    @Override
    public void aplicarEfecto(Jugador jugador) {
        int sumaDados = jugador.cantidadCasillerosAMoverse();
        int casillerosAmoverse = 0;
        if ( sumaDados > 1 && sumaDados < 7  ){
            casillerosAmoverse = sumaDados - 2;
        } else if (sumaDados > 6 && sumaDados < 11 ){
            casillerosAmoverse = (int) (jugador.dinero() % sumaDados);
        } else {
            casillerosAmoverse = sumaDados - jugador.cantidadPropiedades();
        }
        jugador.setCasillerosAMoverse(casillerosAmoverse);
    }
}
