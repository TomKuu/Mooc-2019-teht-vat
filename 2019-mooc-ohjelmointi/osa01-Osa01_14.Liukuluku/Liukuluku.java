
import java.util.Scanner;

public class Liukuluku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä luku!");
        double luku = Double.parseDouble(lukija.nextLine());
        System.out.println("Syötit luvun " + luku);

    }
}
