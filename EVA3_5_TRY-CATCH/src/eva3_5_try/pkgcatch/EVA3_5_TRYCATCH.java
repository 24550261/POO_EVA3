/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_try.pkgcatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author oujeffu
 */
public class EVA3_5_TRYCATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            int[] datos = new int[5];
            datos[7]=0;
            
            int x= 7, y=0;
            int resu =x/y;
            
            Scanner cap= new Scanner (System.in);
            System.out.println("Introduce un numero: ");
            int nume =cap.nextInt();
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            
        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch(InputMismatchException e){
            e.printStackTrace();
            
        }
            
        
    }
    
}
