/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Programacion3 {

    public static void main(String[] args) {
        /*creo vectores para almacenar las posiciones del eje x y del eje y */
        float[] x = new float[200];
        float[] y = new float[200];

        /* Vector para guardar las nuevas posiciones
        float[] puntos = new float[200]; */
    
        /* creo un conador para poner un tope máximo*/
        int contador = 0;
        /* creo un objeto de la clase Scanner para leer datos por teclado */
        Scanner sc = new Scanner(System.in);
        
        /*bucle para pedir y guardar las coordenadas*/
        while (contador <= 2) {
            System.out.print("Ingrese la posicion x:");
            x[contador] = sc.nextFloat();
            System.out.print("Ingrese la posicion y:");
            y[contador] = sc.nextFloat();

            /*guardo las coordenadas en un vector llamado "puntos"
            puntos[contador] = (x[contador]); */

            /* mostrar la nueva posicion */
           System.out.println("----------Nueva posicion: (" + x[contador] + "," + y[contador]+ ")-----------");
        }

    }

}
