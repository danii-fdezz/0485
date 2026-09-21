
import java.util.Scanner;

// Activitat 10 — Hores, minuts i segons
public class HoresMinutsSegons {
    public static void main(String[] args) {
       
       int segons;
       Scanner teclat = new Scanner(System.in);
       
       System.out.println("Entra numero de segons: ");
       segons = teclat.nextInt();

       int hores = segons / 3600;
       System.out.println("Hores:" + hores);
       segons = segons % 3600;
       
       int minuts = segons / 60;
       System.out.println("Minuts:" + minuts);
       segons = segons % 60;
       System.out.println("segons:" + segons);
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        // TODO: llegeix un nombre de segons i mostra:
        //   Hores: ...
        //   Minuts: ...
        //   Segons: ...
    }
}
