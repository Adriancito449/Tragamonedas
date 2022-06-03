
package Proyecto_tragamonedas;

import java.io.*;


/**
 *
 * @author Usuario
 */





public class coincidencias {
    PrintWriter pf;
    FileReader fr;
    int cantTotalFichas;
    int cantFichasJugador;
    int cantAciertos;
    int cantApuesta;
    int resultadoApuesta;

    int calcularAciertosGanancias(String tipoJugada) {

        int[][] valores = new int[3][3];

        // PRIMERA FILA
        valores[0][0] = 2;
        valores[0][1] = 1;
        valores[0][2] = 1;
        // SEGUNDA FILA
        valores[1][0] = 2;
        valores[1][1] = 2;
        valores[1][2] = 1;
        // TERCERA FILA
        valores[2][0] = 1;
        valores[2][1] = 1;
        valores[2][2] = 2;


        // JUGADA A, LINEA MEDIA HORIZONTAL
        if (tipoJugada.equals("A") || tipoJugada.equals("a")) {
            cantApuesta = 5;
            cantFichasJugador = cantFichasJugador - cantApuesta;
            System.out.println("Esta jugada tiene un costo de 5 fichas");
            if (cantFichasJugador < 10) {
                System.out.println("No cuenta con las fichas suficientes");
            } else {
                // comprobar si gano
                if (valores[0][1] == valores[1][1] && valores[1][1] == valores[2][1]) {
                    cantAciertos++;

                    System.out.println("si son iguales");
                    System.out.println(cantAciertos);
                } else {
                    System.out.println("NO TUVISTE ACIERTOS");
                }

                if (cantAciertos == 0) {
                    System.out.println("Las fichas que te quedan son: " + cantFichasJugador);
                } else {
                    resultadoApuesta = 5 * cantApuesta * 2 ^ cantAciertos - 1;
                    System.out.println("Haz ganado cant Fichas:" + resultadoApuesta);
                    cantTotalFichas = cantFichasJugador + resultadoApuesta;
                    System.out.println("Tu fichas actuales son: " + cantTotalFichas);
                }

            }

        } else {
            // JUGABA B, LINEA MEDIA HORIZONTAL Y PRIMERA DIAGONAL
            if (tipoJugada.equals("B") || tipoJugada.equals("b")) {
                cantApuesta = 10;
                cantFichasJugador = cantFichasJugador - cantApuesta;
                // COMPROBAMOS SI TIENE LAS FICHAS NECESARIAS
                if (cantFichasJugador < 10) {
                    System.out.println("No cuenta con las fichas suficientes");
                } else {
                    // LINEA HORIZONTAL
                    if (valores[0][1] == valores[1][1] && valores[1][1] == valores[2][1]) {
                        cantAciertos++;

                        System.out.println("si son iguales");
                        System.out.println(cantAciertos);
                    } else {
                        System.out.println("NO TUVISTE ACIERTOS");
                    }
                    // PRIMERA DIAGONAL
                    if (valores[0][0] == valores[1][1] && valores[1][1] == valores[2][2]) {
                        cantAciertos++;

                        System.out.println("si son iguales");
                        System.out.println(cantAciertos);
                    } else {
                        System.out.println("NO TUVISTE ACIERTOS");
                    }
                    if (cantAciertos == 0) {
                        System.out.println("Las fichas que te quedan son: " + cantFichasJugador);
                    } else {
                        resultadoApuesta = 5 * cantApuesta * 2 ^ cantAciertos - 1;
                        System.out.println("Haz ganado cant Fichas:" + resultadoApuesta);
                        cantTotalFichas = cantFichasJugador + resultadoApuesta;
                        System.out.println("Tu fichas actuales son: " + cantTotalFichas);
                    }

                }

            } else {
                if (tipoJugada.equals("C") || tipoJugada.equals("c")) {
                    cantApuesta = 15;
                    cantFichasJugador = cantFichasJugador - cantApuesta;
                    if (cantFichasJugador < 15) {
                        System.out.println("No cuenta con las fichas suficientes");
                    } else {
                        // LINEA HORIZONTAL
                        if (valores[0][1] == valores[1][1] && valores[1][1] == valores[2][1]) {
                            cantAciertos++;

                            System.out.println("si son iguales");
                            System.out.println(cantAciertos);
                        } else {
                            System.out.println("NO TUVISTE ACIERTOS");
                        }
                        // PRIMERA DIAGONAL
                        if (valores[0][0] == valores[1][1] && valores[1][1] == valores[2][2]) {
                            cantAciertos++;

                            System.out.println("si son iguales");
                            System.out.println(cantAciertos);
                        } else {
                            System.out.println("NO TUVISTE ACIERTOS");
                        }
                        // SEGUNDA DIAGONAL
                        if (valores[0][2] == valores[1][1] && valores[1][1] == valores[2][0]) {
                            cantAciertos++;

                            System.out.println("si son iguales");
                            System.out.println(cantAciertos);
                        } else {
                            System.out.println("NO TUVISTE ACIERTOS");
                        }
                        if (cantAciertos == 0) {

                            System.out.println("Las fichas que te quedan son: " + cantFichasJugador);
                        } else {
                            resultadoApuesta = 5 * cantApuesta * 2 ^ cantAciertos - 1;
                            System.out.println("Haz ganado cant Fichas:" + resultadoApuesta);
                            cantTotalFichas = cantFichasJugador + resultadoApuesta;
                            System.out.println("Tu fichas actuales son: " + cantTotalFichas);
                        }

                    }
                } else {
                    if (tipoJugada.equals("D") || tipoJugada.equals("d")) {
                        cantApuesta = 20;
                        cantFichasJugador = cantFichasJugador - cantApuesta;
                        if (cantFichasJugador < 20) {
                            System.out.println("No cuenta con las fichas suficientes");
                        } else {
                            // LINEA HORIZONTAL CENTRAL
                            if (valores[0][1] == valores[1][1] && valores[1][1] == valores[2][1]) {
                                cantAciertos++;

                                System.out.println("si son iguales");
                                System.out.println(cantAciertos);
                            } else {
                                System.out.println("NO TUVISTE ACIERTOS");
                            }
                            // LINEA HORIZONTAL TOP
                            if (valores[0][0] == valores[1][0] && valores[1][0] == valores[2][0]) {
                                cantAciertos++;

                                System.out.println("si son iguales");
                                System.out.println(cantAciertos);
                            } else {
                                System.out.println("NO TUVISTE ACIERTOS");
                            }
                            // LINEA HORIZONTAL BOTTOM
                            if (valores[0][2] == valores[1][2] && valores[1][2] == valores[2][2]) {
                                cantAciertos++;

                                System.out.println("si son iguales");
                                System.out.println(cantAciertos);
                            } else {
                                System.out.println("NO TUVISTE ACIERTOS");
                            }
                            // PRIMERA DIAGONAL
                            if (valores[0][0] == valores[1][1] && valores[1][1] == valores[2][2]) {
                                cantAciertos++;

                                System.out.println("si son iguales");
                                System.out.println(cantAciertos);
                            } else {
                                System.out.println("NO TUVISTE ACIERTOS");
                            }
                            // SEGUNDA DIAGONAL
                            if (valores[0][2] == valores[1][1] && valores[1][1] == valores[2][0]) {
                                cantAciertos++;

                                System.out.println("si son iguales");
                                System.out.println(cantAciertos);
                            } else {
                                System.out.println("NO TUVISTE ACIERTOS");
                            }
                            if (cantAciertos == 0) {
                                System.out.println("Las fichas que te quedan son: " + cantFichasJugador);
                            } else {
                                resultadoApuesta = 5 * cantApuesta * 2 ^ cantAciertos - 1;
                                System.out.println("Haz ganado cant Fichas:" + resultadoApuesta);
                                cantTotalFichas = cantFichasJugador + resultadoApuesta;
                                System.out.println("Tu fichas actuales son: " + cantTotalFichas);
                            }

                        }
                    }
                }
            }
        }
        return cantTotalFichas;
    }

    public coincidencias() {
    }

    public coincidencias(int cantTotalFichas, int cantFichasJugador, int cantAciertos, int cantApuesta, int resultadoApuesta) {
        this.cantTotalFichas = cantTotalFichas;
        this.cantFichasJugador = cantFichasJugador;
        this.cantAciertos = cantAciertos;
        this.cantApuesta = cantApuesta;
        this.resultadoApuesta = resultadoApuesta;
    }
    
}
