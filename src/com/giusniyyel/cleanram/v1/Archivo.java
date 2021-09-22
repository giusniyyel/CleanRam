/*
 * CleanRam
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, January 2019
 */
package com.giusniyyel.cleanram.v1;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author GiusNiyyel
 */
public class Archivo {
    
    public void Escribir(String name, String tmRam){
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        
        try {
            /* Crea las carpetas para el guardado del archivo de la RAM */
            File gius = new File(System.getenv("APPDATA")+"\\GiusNiyyel");
                gius.mkdir();
            File cr = new File(System.getenv("APPDATA")+"\\GiusNiyyel\\CleanRam");
                cr.mkdir();
            /* Se encarga de hacer la escritura del archivoS */
            f = new File(name);
            w = new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            /* Mensaje del archivo */
            wr.write(tmRam);
            wr.append("\n\n" + "CleanRam\n" + "Version 1.0\n" + "Copyright (C) GiusNiyyel, Inc - All Rights Reserved\n" + "Unauthorized copying of this file, via any medium is strictly prohibited\n" +
"Proprietary and confidential\n" + "Written by Daniel Campos <giusniyyel@gmail.com>, January 2019\n");
            /* Cierra el archivo para evitar problemas */
            wr.close();
            bw.close();
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ha currido un error "+e, "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Leer(String name){
        File f;
        FileReader fr;
        BufferedReader br;
        
        try {
            f = new File(name);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            
            String linea;
            linea = br.readLine();
            
            if(linea=="1")
                    Runtime.getRuntime().exec( "cscript com/giusniyyel/cleanram/v1/util/free1gb.vbe");
            if(linea=="2")
                    Runtime.getRuntime().exec( "cscript com/giusniyyel/cleanram/v1/util/free2gb.vbe");
            if(linea=="4")
                    Runtime.getRuntime().exec( "cscript com/giusniyyel/cleanram/v1/util/free4gb.vbe");
            if(linea=="6")
                    Runtime.getRuntime().exec( "cscript com/giusniyyel/cleanram/v1/util/free6gb.vbe");
            if(linea=="8")
                    Runtime.getRuntime().exec( "cscript com/giusniyyel/cleanram/v1/util/free8gb.vbe");
            if(linea=="12")
                    Runtime.getRuntime().exec( "cscript com/giusniyyel/cleanram/v1/util/free12gb.vbe");
            if(linea=="16")
                    Runtime.getRuntime().exec( "cscript com/giusniyyel/cleanram/v1/util/free16gb.vbe");
            if(linea=="32")
                    Runtime.getRuntime().exec( "cscript com/giusniyyel/cleanram/v1/util/free32gb.vbe");
            if(linea=="64")
                    Runtime.getRuntime().exec( "cscript com/giusniyyel/cleanram/v1/util/free64gb.vbe");
            if(linea=="128")
                    Runtime.getRuntime().exec( "cscript com/giusniyyel/cleanram/v1/util/free128gb.vbe");
            JOptionPane.showMessageDialog(null, "Se ha limpiado su RAM correctamente","RAM",JOptionPane.INFORMATION_MESSAGE);
            
            br.close();
            fr.close();
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ha currido un error "+e, "Error",JOptionPane.ERROR_MESSAGE);
        }
            
        
    }
    
}
