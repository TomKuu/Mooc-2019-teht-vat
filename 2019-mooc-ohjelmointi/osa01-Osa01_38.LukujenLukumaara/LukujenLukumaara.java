
import java.util.Scanner;

public class LukujenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int lukujenSumma = 0;
        
        while (true) {
            System.out.print("Syötä luku");
            int luku = Integer.parseInt(lukija.nextLine());
          
            if (luku == 0) {
                break;
            }
            lukujenSumma++;
        } 
        System.out.println("Lukuja yhteensä " + lukujenSumma);
    }
}
