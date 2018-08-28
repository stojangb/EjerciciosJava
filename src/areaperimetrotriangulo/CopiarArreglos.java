/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrotriangulo;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 19759309-1
 */
public class CopiarArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        // TODO code application logic here

        
        int arr1[] ={7,5,1,9,10};
        int arr2[] ={7,56,1,4,10};
        
        
        arr2=Arrays.copyOf(arr1, 5);
        
        
        for(int x=0;x<arr2.length;x++){
        
        System.out.println(arr2[x]);
        }
        
  

        
        
       
        
        
        

    }
    
}
