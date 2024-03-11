import java.util.Scanner;

public class Stepeni {
    public static void main(String[] args) {
        int f; // broj na stepeni vo Farenhajt
        int c; // broj na stepeni vo Celzijus
        // Vlez na podatoci preku tastatura
        Scanner tastatura = new Scanner(System.in);
        // Vcituvanje na stepeni vo Celzijus od korisnikot
        System.out.print("Vnesete Celziusovi stepeni: ");
        c = tastatura.nextInt();
        // Presmetka na stepeni vo Farenhajt po formula
        f = 9 * c / 5 + 32;
        // Prikazuvanje na rezultat na ekran
        System.out.println(c + " stepeni Celziusovi = " + f + " Farenhajtovi stepeni");
    }
}