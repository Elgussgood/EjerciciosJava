/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.Scanner;
import Main.Aleatorio.*;

/**
 *
 * @author gussr
 */
public class main {
public static void main (String args[]){
    String abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    Scanner leer = new Scanner(System.in);
    Aleatorio obj = new Aleatorio();
    String [][] sala = new String[9][8];

try{
System.out.println("¿Cuál es el nombre de la pelicula?");
            String name = leer.nextLine();
            System.out.println("¿Cuánto cuesta la entrada de la pelicula?");
            float precio = leer.nextFloat();
            System.out.println("¿Cuál es el nombre del director?");
            String namedirec = leer.nextLine();
            System.out.println("¿Cuantos minutos dura la función?");
            int duracion = leer.nextInt();
            System.out.println("¿Cuál es la edad minima para verla?");
            int edadmin = leer.nextInt();

System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
System.out.println("Sala de "+name+"\n");
System.out.println("Director: "+namedirec+"\n");
System.out.println("Duración: "+duracion+" minutos\n");
System.out.println("Edad minima: "+ edadmin+"\n");
System.out.println("Costo de entrada: "+precio+"\n");
System.out.println("--------------------------------------------------------------------------------------------------------------------------------------SALA--------------------------------------------------------------------------------------------------------------------------------------");
            
          for(int i=0; i <= 9 ;i++){
            for(int j=0; j < 8; j++){
int h = 10-i;
            String Final="Lugar: "+h+abc.charAt(j);
            System.out.println(Final);
            obj.randPer(precio, edadmin);
            }   
            }
}catch(Exception e){
System.out.println("Ingresa los datos correctamente");
}

}
}
