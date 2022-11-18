
package com.mycompany.arrays2;

import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author Franco
 */
public class Arrays2 {
          public static void main(String[] args) {
    int  seleccionados [] = new int [20];
    ArrayList  <String>  par  = new ArrayList<String> ();
     ArrayList  <String>    impar = new ArrayList<String> ();
    
   
    
    for (int i=0; i<seleccionados.length; i++){
        seleccionados [i] =  (int) (Math.random()*100)+1;
       
       if ( seleccionados [i] % 2 == 0 )
        {
            par.add(Integer.toString(seleccionados [i]));
        }
        else
        {
            impar.add(Integer.toString(seleccionados [i]));
        }
    }    
    
        System.out.println("Estos son los pares: "+ Arrays.asList(par));
        System.out.println("Estos son los impares: "+  Arrays.asList(impar));


       }
  
}
