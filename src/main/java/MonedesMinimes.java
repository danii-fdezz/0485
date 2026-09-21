// Activitat 12 — Monedes mínimes

import java.util.Scanner;

public class MonedesMinimes {
    public static void main(String[] args) {
      
    // MID
    
     Scanner teclat = new Scanner (System.in);
    
    System.out.println("Introdueix els centims");


int centims = teclat.nextByte();
int monedes = centims / 200;
System.out.println(monedes + " monedes de 2 euros");
centims = centims % 200;

monedes = centims / 100;
System.out.println(monedes + " monedes d'1 euro");
centims = centims % 100;

monedes = centims / 50;
System.out.println(monedes + " monedes de 50 cèntims");
centims = centims % 50;

monedes = centims / 20;
System.out.println(monedes + " monedes de 20 cèntims");
centims = centims % 20;

monedes = centims / 10;
System.out.println(monedes + " monedes de 10 cèntims");
centims = centims % 10;

monedes = centims / 5;
System.out.println(monedes + " monedes de 5 cèntims");
centims = centims % 5;

monedes = centims / 2;
System.out.println(monedes + " monedes de 2 cèntims");
centims = centims % 2;

monedes = centims / 1;
System.out.println(monedes + " monedes de 1 cèntims");

      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
        // TODO: llegeix una quantitat en cèntims i mostra quantes monedes de
        //       cada tipus calen (200, 100, 50, 20, 10, 5, 2, 1), una per línia.
        //       Per a l'entrada 123:
        //   0 monedes de 2 euros
        //   1 monedes d'1 euro
        //   0 monedes de 50 cèntims
        //   1 monedes de 20 cèntims
        //   0 monedes de 10 cèntims
        //   0 monedes de 5 cèntims
        //   1 moneda de 2 cèntims
        //   1 moneda de 1 cèntims
    }
}
