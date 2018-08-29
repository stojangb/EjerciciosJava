/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrotriangulo;
import java.util.Arrays;
import java.util.Scanner;



public class Guia7Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        // TODO code application logic here
        int d=15,maximo=0,minimo=1000;
        

        
        
        
    
       int[] numeros = new int[d];
       int[] numeros2 = new int[d];
        System.out.println("Arreglo 1: ");
        for(int x=0;x<numeros.length;x++){
            
            
            //System.out.println("Ingrese el numero: ");
            //Scanner leer = new Scanner(System.in);
            numeros[x] = (int) (Math.random()*100+1);
            
        
        }
        System.out.println("");
     
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("");
            System.out.print(" El numero de la posición "+i+" es: ");

            System.out.print(numeros[i]);
        if (numeros[i]> maximo){
        maximo = numeros[i];
        }
        if (numeros[i]< minimo){
        minimo = numeros[i];
        }
        }
        
        //Arreglo en orden ascendente
      
        
        //copiar Arreglo en otro arreglo y darlo vuelta..
        System.out.println("");
        System.out.println("Arreglo 2: ");
           numeros2=Arrays.copyOf(numeros, 15);
           
           for(int x=0;x<numeros2.length;x++){
               System.out.println("En la posición "+x+" esta el numero "+numeros2[x]);
           }
           
        //Fin copiado de arreglo
        System.out.println("");//No poner nada AQUI, mejora la visualizacion
        System.out.println("El numero maximo es: "+maximo);
        System.out.println("El numero minimo es: "+minimo);
        System.out.println("El arreglo en orden ascendente es: ");
        System.out.println("El arreglo en orden descendente es: ");
        System.out.println("El arreglo 2 copiado en otro arreglo al revez es: ");
        
        
        

    }}
    

