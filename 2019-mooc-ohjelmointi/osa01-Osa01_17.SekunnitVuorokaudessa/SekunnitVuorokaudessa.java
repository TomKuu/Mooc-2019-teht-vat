
import java.util.Scanner;

public class SekunnitVuorokaudessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int sekunnitVuorokaudessa = 60*60*24;
                
        System.out.println("Kuinka monen vuorokauden sekunnit tulostetaan?");
        int vuorokaudet = Integer.parseInt(lukija.nextLine());
        
        
        System.out.println(vuorokaudet * sekunnitVuorokaudessa);

    }
}
