/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradocersar;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author gussr
 */
public class cifrar {
String Resultado="";
static String abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    
 public void codi (String original, int casi){
        char [] caracteres = new char[original.length()];
        original=original.toUpperCase();

        try{
            for(int i=0; i<= original.length();i++){
                    caracteres[i] = abc.charAt(abc.indexOf(original.charAt(i)+casi));
                    Resultado += caracteres[i];
            }
        }catch(Exception e){
            
        }
            JOptionPane.showMessageDialog(null,Resultado);
Resultado="";
}

public void descodi (String original, int casi){
        char [] caracteres = new char[original.length()];
        original=original.toUpperCase();

        try{
            for(int i=0; i<= original.length();i++){
                    caracteres[i] = abc.charAt(abc.indexOf(original.charAt(i)-casi));
                    Resultado += caracteres[i];
            }
        }catch(Exception e){
            
        }
            JOptionPane.showMessageDialog(null,Resultado);
Resultado="";
}
}

