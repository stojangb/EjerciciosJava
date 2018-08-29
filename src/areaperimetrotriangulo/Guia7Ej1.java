/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrotriangulo;
import java.util.Arrays;
import java.util.Scanner;


public class Guia7Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        // TODO code application logic here

        
    
        String clientes[]={"","","",""};
        
        
      
        
        for(int x=0;x<4;x++){
        
            switch(x){
            
                case 0:{
                System.out.println("Ingrese nombre");
                break;
                }
                case 1:{
                System.out.println("Ingrese apellido");
                break;
                }
                case 2:{
                System.out.println("Ingrese rut");
                break;
                }
                case 3:{
                System.out.println("Ingrese dirección");
                break;
                }
                
                
                
            }
            Scanner leer = new Scanner(System.in);
            clientes[x]= leer.next();
        
        
        }
        
        for (int i = 0; i < 4; i++) {
            
            switch(i){
            
                case 0:{
                System.out.print("Nombre: \t");
                break;
                }
                case 1:{
                System.out.print("Apellido: \t");
                break;
                }
                case 2:{
                System.out.print("Rut: \t\t");
                break;
                }
                case 3:{
                System.out.print("Dirección: \t");
                break;
                }            
            
            
            
            }
        
            System.out.println(clientes[i]);
            
        }

    }}
    

