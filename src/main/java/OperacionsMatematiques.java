
import java.util.Scanner;

// Activitat 05 — Operacions aritmètiques fonamentals
public class OperacionsMatematiques {
    public static void main(String[] args) {

        try {
            
        
        Scanner teclat = new Scanner (System.in);
        
        System.out.println("Introdueix el primer número: ");
      
        int num1= teclat.nextInt(); 

        System.out.println("Introdueix el segon número: ");
       
        int num2= teclat.nextInt();
        
        System.out.println(" Resultats: ");

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        

        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));


        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));


        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); 

         } catch (Exception e) { System.out.println("Error!");
        
        
        }

        




        
        
        
        
        
        // TODO: llegeix dos enters i mostra suma, resta, producte i divisió:
        //   4 + 2 = 6
        //   4 - 2 = 2
        //   4 * 2 = 8
        //   4 / 2 = 2
    }
}
