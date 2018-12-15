
import java.util.Scanner;

public class KahdenLuvunKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen luku!");
        double ekaLuku = Integer.parseInt(lukija.nextLine());
        
        System.out.println("Syötä toinen luku!");
        double tokaLuku = Integer.parseInt(lukija.nextLine());
        
        System.out.println("Syötettyjen lukujen keskiarvo on " + ((ekaLuku + tokaLuku) / 2));

    }
}
