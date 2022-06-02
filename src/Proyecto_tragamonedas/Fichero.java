/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_tragamonedas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Fichero {
    
    PrintWriter pf;
    FileReader fr;
    
    void crear(String pNombre,String pDatos) throws IOException
    {
        pf=new PrintWriter(new FileWriter(pNombre, true));
        pf.println(pDatos);
        pf.close();
        System.out.println("Generacion ok");
        
    }
    
    void leer(String pNombre) throws IOException
    {
        fr=new FileReader(pNombre);
        BufferedReader br=new BufferedReader(fr);
        String linea;
        while ((linea=br.readLine())!=null)
        {
            String[] datos = linea.split("//");
            
            //lis.crear(nombre, cedula, materia, nota);
        }
    }
    
}
