/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis;
import java.util.Scanner;
/**
 *
 * @author estudiante
 */
public class Luis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Usuario = "";
        int Edad;
        
        System.out.println("Ingrese su Edad");
        Scanner D1 = new Scanner(System.in);
        Edad =D1.nextInt();
        
        System.out.println("Ingrese su Nombre");
        Scanner D2 = new Scanner(System.in);
        Usuario =D2.nextLine();
        
        if(Edad>18){
         System.out.println("Tiene DPI");
                  } else {
         System.out.println("Aun es Niño");
         
             
         }
 
    }
    
}
