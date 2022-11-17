package drugie;
import java.util.Scanner;
public class zadanie19 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println(" Ilosc zakupioncy hpakietow ");
        double ilosc = klawiatura.nextDouble();
        double price = 77;
        double zejscieZceny;
        double wartoscc;
        double rabat;
        double calacena;

        wartoscc = price * ilosc;
        if (ilosc >= 100) {
            rabat = 0.50;
            zejscieZceny = rabat * wartoscc;
            calacena = wartoscc - zejscieZceny;
            System.out.println("DOstajesz rabat: " + rabat + " Cena zakupu po znizce sklepowej: " + calacena);

        } else if (ilosc <=99 && ilosc >=50) {
            rabat = 0.40;
            zejscieZceny = rabat * wartoscc;
            calacena = wartoscc - zejscieZceny;
            System.out.println(" DOstajesz rabat: " + rabat + " Cena zakupu po znizce sklepowej: " + calacena);

        } else if (ilosc <=49 && ilosc >=20) {
            rabat = 0.30;
            zejscieZceny = rabat * wartoscc;
            calacena = wartoscc - zejscieZceny;
            System.out.println(" DOstajesz rabat: " + rabat + " Cena zakupu po znizce sklepowej: " + calacena);


        } else if (ilosc <=19 && ilosc >=10) {
            rabat = 0.20;
            zejscieZceny = rabat * wartoscc;
            calacena = wartoscc - zejscieZceny;
            System.out.println(" DOstajesz rabat: " + rabat + " Cena zakupu po znizce sklepowej: " + calacena);

        }
    }
}

