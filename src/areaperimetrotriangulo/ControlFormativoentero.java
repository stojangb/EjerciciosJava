/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrotriangulo;
import java.util.Arrays;
import java.util.Scanner;



public class ControlFormativoentero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        // Se define renglon como los numeros horizontales de la matriz
        int d=4,maximo=0,minimo=1000,renglon1=0,renglon2=0;
       Scanner aas = new Scanner(System.in);
        
    
       int[][] numeros = new int[d][d];
       int[][] matrizrandom = new int[d][d];
       int[][] matrizresultado = new int[d][d];
       
       for(int a=0;a<4;a++){
       for(int b=0;b<4;b++){
 
           System.out.println("Ingrese un/otro numero para el arreglo en la posición: "+a+","+b);
           
           
           numeros[a][b]= aas.nextInt();

       }       
       }
        System.out.println("Matriz 1 Ingresada por el usuario");
       for(int a=0;a<4;a++){
       for(int b=0;b<4;b++){
           System.out.print(numeros[a][b]+"\t");

       }       
           System.out.println("");
       }
       // System.out.println("El numero de 0 en el renglon 1 es: "+renglon1+" Y en el renglon 2 es: "+renglon2);
       
System.out.println("Matriz 2 RaNdomica");
       for(int a=0;a<4;a++){
       for(int b=0;b<4;b++){
 
matrizrandom[a][b] = (int) (Math.random() * 80) + 1;
           
      

       }       
       }
        
       for(int a=0;a<4;a++){
       for(int b=0;b<4;b++){
           System.out.print(matrizrandom[a][b]+"\t");

       }       
           System.out.println("");
       }

     System.out.println("¿Que desea hacer? 1: sumar, 2: restar, 3: multiplicar, 4: dividir ");
     
     
     int desicion =0;
     desicion = aas.nextInt();
     
     
     
        System.out.println("Matriz Resultado");
   

       for(int a=0;a<4;a++){
       for(int b=0;b<4;b++){
 
          
           switch(desicion){
           case 1:{
            matrizresultado[a][b] = matrizrandom[a][b] + numeros[a][b];
           break;
           }
           case 2:{
           matrizresultado[a][b] = matrizrandom[a][b] - numeros[a][b];
           break;
           }
           
           case 3:{
           matrizresultado[a][b] = matrizrandom[a][b] * numeros[a][b];
            break;
           }
           
            case 4:{
                matrizresultado[a][b] = matrizrandom[a][b] / numeros[a][b];
           break;
           }
           
           }
           

           
      

       }       
       }
        
       for(int a=0;a<4;a++){
       for(int b=0;b<4;b++){
           System.out.print(matrizresultado[a][b]+"\t");

       }       
           System.out.println("");
       }
       
    }}
    

