/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.awt.BorderLayout;
import java.util.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import javax.swing.*;
/**
 *
 * @author gussr
 */
public class Utilidades{
    
Scanner scan = new Scanner(System.in);
String original= "";
String Final="";

public void leeroriginal(int c, String original){

    String[] nueva = original.split(" ");
String[] resultado = new String[nueva.length];

for(int i=0, j=resultado.length-1 ; i< nueva.length; i++,j--){
resultado[i]=nueva[j];
}

for(int i=0;i<resultado.length;i++){
if(i%2 != 0){
Final+=resultado[i]+" ";
}else{
Final+=resultado[i];
}
}

JOptionPane.showMessageDialog(null,"Caso "+c+":"+Final+"\n");
Final="";
}
}