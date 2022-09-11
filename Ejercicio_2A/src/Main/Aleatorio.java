/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.Random;

/**
 *
 * @author gussr
 */
public class Aleatorio {
    String[] Lnombres = new String [100];
    Random ram = new Random();
    Informacion info = new Informacion();
    int edad =0;
    double saldo = 0;
    String permisoED ="Denegado";
    String permisoSA ="Denegado";
    String resper ="Asiento vacío\n";
    boolean alert =false;

public void randPer (float precio, int edadmin){
       
            edad=ram.nextInt((100 - 1) + 1);
            saldo=ram.nextFloat()*300;

                if(edad >= edadmin && saldo >= precio){
                    permisoED="Aprobado";
                    permisoSA="Aprobado";
                    String nombre = info.lista[ram.nextInt((100 - 1) + 1)];
                    resper= info.personas(nombre, edad, saldo, permisoED, permisoSA+"\n-----------------------------------------------------------------------------------------------------------------------------------");
                }else{
                    resper ="Asiento vacío\n-----------------------------------------------------------------------------------------------------------------------------------";
                }
            
System.out.println(resper);
resper="";
edad =0;
saldo =0;
    }
}
