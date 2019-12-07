public class Kalkulator {
    public static int  dodaj(int ... paramtry) {
        int wynik = 0;
        for (int i : paramtry) {
            wynik += i;

        }
        return wynik;
    }

}
