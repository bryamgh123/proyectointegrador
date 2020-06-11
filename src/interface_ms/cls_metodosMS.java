/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_ms;

import java.util.Random;

/**
 *
 * @author clina
 */
public class cls_metodosMS {

    public static void metodo (String args[]){
        
        
// ...
Random number = new Random(123L);
//...
for (int i = 0; i < 20; i++) {
  // Generate another random integer in the range [0, 20]
  int n = number.nextInt(21);
  System.out.println(n);
}
      
    }  
}
