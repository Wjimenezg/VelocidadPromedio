package Tarea1;

import java.util.*;
public class Vehiculo {
 public static void main (String args[]) {
   	 Scanner entrada=new Scanner(System.in);
 int cantVehiculos=0;
 int cantVueltas=0;
 int contador=1;
 double tiempo;
 double promedio;
 
 System.out.println("Cuantos vehiculos ingresara");
 cantVehiculos=entrada.nextInt();
 if(cantVehiculos>=1) {
 while(contador<=cantVehiculos) {
	 System.out.println("Cuantas vueltas realizo el vehiculo #"+contador);
	 cantVueltas=entrada.nextInt();
             
             int contador2=1;
             double sumaTiempos=0;
             
	 while(contador2<=cantVueltas) {
		 System.out.println("Ingrese el tiempo de la vuelta #"+contador2);
		 tiempo=entrada.nextDouble();
                     sumaTiempos= sumaTiempos+tiempo;
		 contador2++;
	 }
             promedio=sumaTiempos/cantVueltas;
             System.out.println("El Promedio del vehiculo #"+contador+"es: "+promedio);
	 contador++;
 }
 }else{
         System.out.println("Ingrese al menos un vehiculo");
     }
	 
	 
	 
 }
	
}
