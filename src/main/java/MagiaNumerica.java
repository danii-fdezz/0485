
import java.util.Scanner;

// Activitat 03 — Màgia numèrica
public class MagiaNumerica {
    public static void main(String[] args) {
       
       Scanner teclat = new Scanner (System.in);

       int numero= teclat.nextInt();
       int resultat= teclat.nextInt();



       resultat = numero * 3;
       resultat = resultat + 6;
       resultat = resultat / 3;
       resultat = resultat - numero;

       System.out.println("El resultat és " + resultat); 
       



       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        // TODO: llegeix un número del teclat; multiplica'l per 3, suma-li 6,
        //       divideix entre 3 i resta-li el número inicial. Mostra el resultat:
        //   El resultat és 2
    }
}
