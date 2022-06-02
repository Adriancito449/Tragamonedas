package Proyecto_tragamonedas;

import java.io.*;
import java.util.Scanner;

class Listas {

    Nodo aux;
    Nodo nodo;

    Listas() {
        nodo = null;
    }

    Boolean Verprimero(Nodo nodo, String LRotores[]) {

        Boolean pave;
        
        if (nodo == null) {
            nodo = new Nodo();
            nodo.Rotores = LRotores;
            nodo.Indice++;
            nodo.Primero = true;
            pave = true;
        } else {
            pave = false;
        }
        return pave;
    }

    void Crear(Nodo nodo, String LRotores[]) {

        if (Verprimero(nodo, LRotores) == false) {
            aux = nodo;
            while (aux.Siguiente != null) {
                aux = aux.Siguiente;
            }
            aux.Siguiente = new Nodo();
            aux.Indice++;
            aux.Ultimo = true;
            aux.Rotores = LRotores;
            if (aux.Primero == true) {
                aux.Anterior = null;
            } else {
                if (aux.Siguiente.Anterior == null) {
                    aux.Siguiente.Anterior = aux;
                }
            }

        }

    }

    void pasarDato(){


    }









}

public class Tragamonedas {

    public static void main(String[] args) throws IOException 
    {
        Motor inicio= new Motor();
        
        inicio.start();
        
    }
}
