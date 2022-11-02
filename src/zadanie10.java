import java.util.Scanner;

public class zadanie10 {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double cena;
        double podatekStanowy = 0.04;
        double podatekLokalny = 0.02;

        System.out.println("Jaka jest cena produktu: ");
        cena = klawiatura.nextInt();
        klawiatura.nextLine();
        double podatekstanowy1 = cena * podatekStanowy;
        double podatekLokalny1 = cena * podatekLokalny;
        double calosc = cena + (cena * podatekLokalny) + (cena * podatekStanowy);
        System.out.println(" cena netto to: " + cena);
        System.out.println(" podatek stanowy jest rowny:" + podatekstanowy1);
        System.out.println(" podatek lokalny jest rowny: " + podatekLokalny1);
        System.out.println(" cena brutto to: " + calosc);




    }
}
