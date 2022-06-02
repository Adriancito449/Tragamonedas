package Proyecto_tragamonedas;

import java.io.*;

class Nodo {

    int Indice;
    Nodo Siguiente = null;
    Nodo Anterior = null;
    Boolean Primero = false;
    Boolean Ultimo = false;

    String Rotores[];

}

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
        
        Fichero kkoo = new Fichero();
        
        kkoo.crear("Oki.in", "Hola bb");
    }
