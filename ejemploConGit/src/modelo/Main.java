package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        ArrayList<String> cadenas = new ArrayList<>();
//        cadenas.add("hola");
//        cadenas.add("Mundo");
//        String cadenasAux[] = (String[]) cadenas.toArray();
//        for (int i = 0; i < cadenasAux.length; i++) {
//            System.out.println(cadenasAux[i]);
//        }
        List<String> lista = new LinkedList<String>(Arrays.asList("hola","mundo"));
        lista.add(0,"aloha");

        for (String cad: lista) {
            System.out.println(cad);
        }
    }//Fin de la clase Main
}
