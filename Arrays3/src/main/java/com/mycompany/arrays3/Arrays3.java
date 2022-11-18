package com.mycompany.arrays3;

import java.util.ArrayList;

/**
 *
 * @author Franco
 */
public class Arrays3 {
    
public static boolean esPrimo(int numero){
    int inicio = 2;
    boolean primo=true;
    while ((primo) && (inicio!=numero)){
      if (numero % inicio == 0)
            primo = false;
      inicio++;
    }
    return primo;
}
public static void main(String[] args) {    
    ArrayList  <String>  losPrimos  = new ArrayList<String> ();    
        
    for(int i = 2; i <= 1000; i++){
        if(esPrimo(i)){
          losPrimos.add(Integer.toString(i));


        }
    }
        System.out.println("Los primos del 1 al 1000 son: " + losPrimos);

       
}
}