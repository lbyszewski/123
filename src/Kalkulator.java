import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Kalkulator {
    public static int  dodaj(int ... paramtry) {
        int wynik = 0;
        for (int i : paramtry) {
            wynik += i;

        }
        return wynik;

    }

    public static void main(String[] args) {
        System.out.println("początek zakresu");
        Scanner skaner = new Scanner(System.in);

        int poczatekZakresu =  skaner.nextInt();

        System.out.println("koniec zakresu");
        double koniecZakresu =  skaner.nextDouble();

        if (poczatekZakresu<koniecZakresu)
        {
            System.out.println("dzielnik: ");
            int dzielnik = skaner.nextInt();

            for (int i = poczatekZakresu ; i<koniecZakresu;i++)
            {
                if(i % dzielnik == 0 && i % dzielnik == 0)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
