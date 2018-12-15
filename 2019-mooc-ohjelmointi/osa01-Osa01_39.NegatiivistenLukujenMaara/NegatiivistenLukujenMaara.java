
import java.util.Scanner;

public class NegatiivistenLukujenMaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        
        int negatiivistenLukujenSumma = 0;
        
        while (true) {
            System.out.print("Syötä luku");
            int luku = Integer.parseInt(lukija.nextLine());
          
            if (luku == 0) {
                break;
            } else if (luku < 0) {
                negatiivistenLukujenSumma++;
            }
        } 
        System.out.println("Negatiivisia lukuja yhteensä " + negatiivistenLukujenSumma);
    }
}
