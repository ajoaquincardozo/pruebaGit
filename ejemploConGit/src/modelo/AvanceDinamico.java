package modelo;

public class AvanceDinamico extends Evento {
    private static int restarDos = 2;


    public AvanceDinamico(String nombreCasillero){
        super(nombreCasillero);
    }

    public int restarSumaDados(int sumaDados){
        return sumaDados - restarDos;
    }

    public int moduloDeSumaSobreSumaDados(long dinero, int sumaDados){
        return (int) (dinero % sumaDados);
    }

    public int restarSumaDadosMenosCantidadPropiedades(int sumaDados, int cantidadPropiedades){
        return sumaDados - cantidadPropiedades;
    }

    @Override
    public void aplicarEfecto(Jugador jugador) {
        int sumaDados = jugador.cantidadCasillerosAMoverse();
        int casillerosAmoverse = 0;
        if ( sumaDados > 1 && sumaDados < 7  ){
            casillerosAmoverse = restarSumaDados(sumaDados);
        } else if (sumaDados > 6 && sumaDados < 11 ){
            casillerosAmoverse = moduloDeSumaSobreSumaDados(jugador.dinero(), sumaDados);
        } else {
            casillerosAmoverse = restarSumaDadosMenosCantidadPropiedades(sumaDados, jugador.cantidadPropiedades());
        }
        jugador.setCasillerosAMoverse(casillerosAmoverse);
    }
}
