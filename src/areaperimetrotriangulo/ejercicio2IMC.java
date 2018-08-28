/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrotriangulo;
import java.util.Scanner;


public class ejercicio2IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        // TODO code application logic here

        double Peso = 0,Altura = 0,IMC = 0;
        System.out.println("hola este programa ha cambiado");
        System.out.println("Este programa le calculara el IMC: Indice de masa corporal");
        
        System.out.println("Ingrese la altura en metros: ");
        Scanner ha = new Scanner(System.in);
        Altura = ha.nextDouble();
        
        System.out.println("Ingrese el peso en kilos: ");
        Scanner ha2 = new Scanner(System.in);
        Peso = ha2.nextDouble();
        
        IMC = Peso * Altura * Altura;
        
        
        
        
   
        
        if (IMC<16){
            System.out.println("Criterio de ingreso en hospital");
        }
        else if(IMC>=16 && IMC<=17){
            System.out.println("Infrapeso");
        }
                else if(IMC>=17 && IMC<=18){
            System.out.println("bajo peso");
        }
                else if(IMC>=18 && IMC<=25){
            System.out.println("Peso Normal (Saludable)");
        }
                else if(IMC>=25 && IMC<=30){
            System.out.println("Sobrepeso (Obesidad de grado I)");
        }
                else if(IMC>=30 && IMC<=35){
            System.out.println("Sobrepeso Crónico (Obesidad de grado II)");
        }
                else if(IMC>=35 && IMC<=40){
            System.out.println("Obesidad Premórbida (Obesidad de grado III)");
        }
                else if(IMC>40){
            System.out.println("Obesidad Mórbida (Obesidad de grado IV)");
        }
   

    }
    
}
