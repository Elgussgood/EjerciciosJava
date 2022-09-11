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
public class Randomizador {
    String[] Lnombres = new String [100];
    Random ram = new Random();
    Informacion info = new Informacion();
    int edad =0;
    double saldo = 0;
    double precio = 0;
    String permisoED ="No tiene la edad suficiente para ver la pelicula";
    String permisoSA ="No tiene el saldo requerido para ver la pelicula";
    public void randPer (){
       
         do{
            edad=ram.nextInt();
            saldo=ram.nextDouble();
            if(edad <100 && edad>0 && saldo>0){

            if(edad>18 && saldo > precio){
                permisoED="Iiene la edad suficiente para ver la pelicula";
                permisoSA="Tiene el saldo suficiente para ver la pelicula";
            }
            }else{
            edad=0;
            saldo=0;
            }
        }while(edad == 0);
       

        for(int i =0;i==100;i++){
            
            String nombre = info.lista[10];
            info.personas(nombre, edad, 0, permisoED, permisoSA);
        }

    }
}
