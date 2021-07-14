/**
*Nombre del programa: Era geologica de una piedra
*Descripción: Determinar el era geologica de una piedra basado en la edad aproximada de la mismas.
*Autor: Kimberly C.
*Fecha de creación:07-06-20
*Modificado por: Kimberly Cascante
*Fecha de modificacion: 09/06/2020
*/

import java.io.*;
public class ejer1 {

    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out = System.out;

    public static void main(String[] args) throws Exception {

        //Declaracion de variables
        double eraGeo; 
        String era;

        System.out.println("Digite la edad aproximada de la piedra");
        eraGeo = Double.parseDouble(in.readLine());

        if (eraGeo < 65.5) {
            era = "Cenozoica";

        } else {
            if (eraGeo < 251) {
                era = "Mesozoica";

            } else {
                if (eraGeo < 542) {
                    era = "Paleozoica";

                } else {
                    era = "Prepaleozoica";

                }
            }
        }

        System.out.println("La era de la piedra es " + era);
    }
}
