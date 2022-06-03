package Proyecto_tragamonedas;

import java.io.*;
import java.util.Arrays;

class Listas {

    
    Nodo nodo;
    Nodo aux=nodo;
    Listas() {
        nodo = null;
    }

    Nodo Verprimero(Nodo lnodo, String LRotores[]) {

        if (lnodo == null) {
            lnodo = new Nodo();
            lnodo.Rotores = LRotores;
            lnodo.Primero = true;

            nodo = lnodo;
        }
        return nodo;
    }

    void Crear(Nodo lnodo, String LRotores[]) {
        
        Verprimero(lnodo,LRotores);

        if (nodo != null ) {
            aux = nodo;
            while (aux.Siguiente != null) {
                aux = aux.Siguiente;
            }
            aux.Siguiente = new Nodo();
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

    void Mostrar(Nodo lnodo) {

        aux = lnodo;
        String a[];

        while (aux.Siguiente != null) {
            a = aux.Rotores;
            System.out.println("  " + Arrays.toString(a));
            aux = aux.Siguiente;
        }

    }

}

public class Tragamonedas {

    public static void main(String[] args) throws IOException {
        Fichero jj = new Fichero();
        Listas lis = new Listas();

        jj.leer("Rotores.txt", lis);

        lis.Mostrar(lis.nodo);

    }
}
