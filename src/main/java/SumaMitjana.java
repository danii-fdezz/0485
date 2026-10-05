// Activitat 08 — Suma i mitjana de 4 enters

import java.util.Scanner;

public class SumaMitjana {
    public static void main(String[] args) {
        
        
        Scanner teclat = new Scanner(System.in);

        int valor1 = teclat.nextInt();
        int valor2 = teclat.nextInt();
        int valor3 = teclat.nextInt();
        int valor4 = teclat.nextInt();

        int suma = valor1 + valor2 + valor3 + valor4;
        double mitjana = suma / 4.0;

        System.out.println("Suma = " + suma);
        System.out.println("Mitjana = " + mitjana); 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO: llegeix 4 enters i mostra:
        //   Suma = ...
        //   Mitjana = ...      (recorda que la mitjana pot tenir decimals)
    }
}
