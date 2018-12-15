
import java.util.Scanner;

public class KolmenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen luku!");
        int ekaLuku = Integer.parseInt(lukija.nextLine());
        
        System.out.println("Syötä toinen luku!");
        int tokaLuku = Integer.parseInt(lukija.nextLine());
        
        System.out.println("Syötä kolmas luku!");
        int kolmasLuku = Integer.parseInt(lukija.nextLine());
        
        System.out.println("Lukujen summa on " + (ekaLuku + tokaLuku + kolmasLuku));

    }
}
