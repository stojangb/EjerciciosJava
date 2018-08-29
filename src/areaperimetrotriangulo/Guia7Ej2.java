/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrotriangulo;
import java.util.Arrays;
import java.util.Scanner;


public class Guia7Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        // TODO code application logic here
        int d=0;
        
        System.out.println("¿Cuantos nombres ingresará?");
        Scanner as = new Scanner(System.in);
        d = as.nextInt();
        
        
        
    
        String[] clientes = new String[d];
       
        for(int x=0;x<clientes.length;x++){
            System.out.println("Ingrese el nombre del cliente: ");
            Scanner leer = new Scanner(System.in);
            clientes[x]= leer.next();
        }
        
        for (int i = 0; i < clientes.length; i++) {
            System.out.println("");
            System.out.print(" El cliente de la posición "+i+" es: ");

            System.out.print(clientes[i]);
            
        }

    }}
    

