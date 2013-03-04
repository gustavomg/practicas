/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gustavo.millan
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File archivo= new File("datos.txt");
         if ( !archivo.exists()) {
         
         System.out.println("archvi no existe");
            try {
                //CREAR
                archivo.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(JavaApplication2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
         
         }
       
       
       
       
    }
}
