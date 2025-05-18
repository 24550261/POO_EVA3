/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author oujeffu
 */
public class EVA3_6_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
          int nume;
       
          while(true){
           
           try{
               Scanner cap= new Scanner (System.in);
               System.out.println("Introduce un numero: ");
            nume=cap.nextInt();
            cap.nextLine();
            break;
            
           }catch(InputMismatchException e){
               System.out.println("El valor no es valido vuelve a intentarlo: ");
              
           }
           
           }      
               
               
                
            
    
    


}
    }

