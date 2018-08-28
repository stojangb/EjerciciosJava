/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrotriangulo;
import java.util.Arrays;
import java.util.Scanner;


public class BusquedaArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        // TODO code application logic here

        
        int miarreglo[] ={7,56,1,9,10};
        
        Arrays.sort(miarreglo);
        
        int a=Arrays.binarySearch(miarreglo, 9);
        
        System.out.println(a);
        
        
       
        
        
        

    }
    
}
