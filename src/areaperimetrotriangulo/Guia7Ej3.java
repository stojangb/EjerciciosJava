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
       int[] numeros3 = new int[d];
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
      
        
        //copiar Arreglo en otro arreglo y darlo vuelta..(Abajo)
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

        System.out.println("El arreglo 2 copiado en otro arreglo al revez es: ");
        
        //Dando vuelta el arreglo:
                int w=14;
               for(int x=0;x<numeros2.length;x++){
                  
               numeros2[w] = numeros[x];
               w--;
                }
                
                for(int e=0;e<numeros2.length;e++){
                    System.out.println("En la posición " +e+" se encuentra el valor: "+numeros2[e] );
                }
                //se ordenada el arreglo en forma ascendente y descendente
        System.out.println("El arreglo 2 en orden ascendente es: ");
        
        Arrays.sort(numeros2);
        
        for(int e=0;e<numeros2.length;e++){
            System.out.println("En la posición " +e+" se encuentra el valor: "+numeros2[e] );
        }
        
        numeros3 = Arrays.copyOf(numeros2, 15);
        System.out.println("El arreglo 2 en orden descendente es: ");
        
               int o=14;
               for(int x=0;x<numeros2.length;x++){
                  
               numeros2[o] = numeros3[x];
               o--;
                }
        for(int e=0;e<numeros2.length;e++){
            System.out.println("En la posición " +e+" se encuentra el valor: "+numeros2[e] );
        }
    }}
    

