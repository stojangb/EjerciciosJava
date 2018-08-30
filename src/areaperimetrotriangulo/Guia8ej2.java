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
       int[] arregloacomparar = new int[d];
       
              for(int a=0;a<2;a++){
       
 
           System.out.println("Ingrese un/otro numero para el arreglo  en la posición: "+a+" A comparar... ");
           Scanner aas = new Scanner(System.in);
           
           arregloacomparar[a]= aas.nextInt();
       }       
                     for(int a=0;a<2;a++){
       
 
                         System.out.println("El numero del arreglo es: "+arregloacomparar[a]);
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
       int l=0;
       for(int a=0;a<2;a++){
           
           if(arregloacomparar[a]==numeros[a][0]){
               System.out.println("Numeros iguales detectados "+a+" en la posicion y 0");
           }
           if(arregloacomparar[a]==numeros[a][1]){
               System.out.println("Numeros iguales detectados "+a+"en laposicion y 1");
           }
               
       
       
    }}}
    

