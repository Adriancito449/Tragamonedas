/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_tragamonedas;

import java.util.Scanner;

/**
 *
 * @author yulie
 */
public class Motor {

    void start(){
    
        coincidencias pp = new coincidencias();
        Scanner in = new Scanner(System.in);
        System.out.println("Quieres jugar?");
        System.out.println("Escribir Si o no");
        String respuesta = in.nextLine();
        if (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI")) {
            System.out.println("Por favor ingrese el tipo de jugaba que quiere hacer");
            System.out.println("A), B), C), D)");
            String tipoJugada = in.nextLine();

            while (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI")) {
                if (tipoJugada.equals("A") || tipoJugada.equals("a")
                        || tipoJugada.equals("B") || tipoJugada.equals("b")
                        || tipoJugada.equals("C") || tipoJugada.equals("c")
                        || tipoJugada.equals("D") || tipoJugada.equals("d")) {
                    pp.calcularAciertosGanancias(tipoJugada);
                    System.out.println("Quieres volver a jugar?");
                    System.out.println("Escribir Si o no");
                    respuesta = in.nextLine();
                    if(respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI")){

                        System.out.println("Por favor ingrese el tipo de jugada que quiere hacer");
                    System.out.println("A), B), C), D)");
                    tipoJugada = in.nextLine();
                    pp.calcularAciertosGanancias(tipoJugada);
                    }else{
                        break;
                    }
                    
                } else {
                    System.out.println("Por favor ingrese un tipo de jugada correcta");
                    System.out.println("A), B), C), D)");
                    //System.out.println("Desea salir del juego? " + "escribir si");

                    tipoJugada = in.nextLine();
                    //if (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI")) {
                        //break;
                    //}
                }

            }

        }

        System.out.println("No quiere jugar mas");
    
    }
}
