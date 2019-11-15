/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

/**
 *
 * @author User
 */
public class Method {

    /**
     * @param args the command line arguments
     */
   static void checkIPK(double ipk) {

    // If age is less than 18, print "access denied"
    if (ipk > 3.5) {
      System.out.println("caumloud!");
    }
    else if (ipk > 3.0) {

      System.out.println("Sangat memuaskan!");

    }
    else if (ipk > 2.75){

      System.out.println("Memuaskan");

    }

    else if (ipk > 2.5){

      System.out.println("Cukup");

    }
  
    
    else {
      System.out.println("jelek, kuliah ngapain saja!");
      System.out.println("masih proses pak!");
    }

  }

  public static void main(String[] args) {
    checkIPK(2); 
        
        
    }
    
}
