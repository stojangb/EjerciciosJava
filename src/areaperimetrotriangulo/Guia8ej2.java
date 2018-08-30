/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrotriangulo;
import java.util.Arrays;
import java.util.Scanner;



public class Guia8ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        // Se define renglon como los numeros horizontales de la matriz
        int d=2,maximo=0,minimo=1000,renglon1=0,renglon2=0;
       
        
    
       int[][] numeros = new int[d][d];
       
              for(int a=0;a<2;a++){
       for(int b=0;b<2;b++){
 
           System.out.println("Ingrese un/otro numero para el arreglo  en la posición: "+a+","+b);
           Scanner aas = new Scanner(System.in);
           
           numeros[a][b]= aas.nextInt();
       }       
       }
              
//                  “Construir un programa en PseInt que permita llenar una matriz de 5X5 y un arreglo
//    unidimensional de capacidad 5, con números enteros leídos desde teclado, luego deberá imprimir en la
//    salida cuántas veces se encuentra el arreglo en la matriz por fila y por columna, en el mismo orden”.
//    Por ejemplo, sea la matriz: Y el vector:
//    “Su programa debería escribir "3 veces" osea es decir yo escribo 12345 y el vector tiene que buscar esos numeros de forma 
//    Horizontal y vertical..
              
              
              
              
       
       for(int a=0;a<2;a++){
       for(int b=0;b<2;b++){
 
           System.out.println("Ingrese un/otro numero para el arreglo en la posición: "+a+","+b);
           Scanner aas = new Scanner(System.in);
           
           numeros[a][b]= aas.nextInt();
       }       
       }
       
       for(int a=0;a<2;a++){
       
       for(int b=0;b<2;b++){
 
           System.out.print(numeros[a][b]+"\t");
           
           
       
       }       
           System.out.println("");
       }
        System.out.println("El numero de 0 en el renglon 1 es: "+renglon1+" Y en el renglon 2 es: "+renglon2);
    }}
    

