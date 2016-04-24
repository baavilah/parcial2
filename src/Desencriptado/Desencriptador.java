/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desencriptado;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import parcial.pkg2.*;


/**
 *
 * @author FamiliaOrjRod
 */
public class Desencriptador {
    
    
    public void Desencriptar(Scanner leer, FileWriter escribir)throws Exception{
    String lectura = leer.next();
    char izar;
    for(int i=0; i < lectura.length(); i++ ){
        char mber = lectura.charAt(i);
        int b = mber;
        if(65<= b && b<=90){
            b -= 65;
            b = (b-3)%26;
            if(b<0){
                b += 26;
            }
            b+=65;
        }
        izar = (char)b;
        escribir.write(izar);   
    }
    escribir.write(",");
    
  }
    
 public void nachoLee() throws Exception{
     Scanner leer = new Scanner(new File("datos.txt"));
     FileWriter escribir = new FileWriter(new File("salida.txt"));
     leer.useDelimiter(",");
     while(leer.hasNext()){
       Desencriptar(leer, escribir); 
     }
     escribir.close();
 }
 public void marketValue(Scanner leer){
     
     
     
 }
    
    
}
