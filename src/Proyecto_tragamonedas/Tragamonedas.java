package Proyecto_tragamonedas;

import java.io.*;
import java.util.Arrays;

class Listas {

    Nodo aux;
    Nodo nodo;

    Listas() {
        nodo = null;
    }

    Boolean Verprimero(Nodo lnodo,String LRotores[]) {

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

    void Crear(Nodo lnodo,String LRotores[]) {
        aux = nodo;
        if (Verprimero(lnodo,LRotores) == false) {
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

    void Mostrar(Nodo lnodo) {

        aux = lnodo;
        String a[];
        
        while (aux.Siguiente != null) {
            a = aux.Rotores;
            System.out.println("  "+Arrays.toString(a));
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
