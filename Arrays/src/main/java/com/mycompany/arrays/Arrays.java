package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Arrays {

          public static void main(String[] args) {
    int  seleccionados [] = new int [5];
    Scanner entrada = new Scanner (System.in);
    System.out.println("Guardando datos");
   
    
    for (int i=0; i<5; i++){
        System.out.print("Digite un numero para sumar al array : ");
        seleccionados [i] = entrada.nextInt();  
                
    }
    
    System.out.println("\n Mostrar datos en el array");
    for (int i=0; i<5; i++){
        
        System.out.println( "[" + i + "]" + " = " + seleccionados[i]  );
        
    }
    
       }
}



