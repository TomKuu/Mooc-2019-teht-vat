
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int lukujenSumma = 0;
        int lukujenMaara = 0;
        
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.parseInt(lukija.nextLine());
            
            if (luku == 0) {
                break;
            }
            lukujenSumma += luku;
            lukujenMaara++;
        }
        System.out.println("Lukujen keskiarvo " + (double)lukujenSumma / (double)lukujenMaara);
    }
}
