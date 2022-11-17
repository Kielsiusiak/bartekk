package drugie;
import java.util.Scanner;
public class zadanie21 {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println(" Ilosc kalorii w produkcie : ");

        double kalorie = klawiatura.nextDouble();
        System.out.println(" Ile gramow tluszczu ma produkt");

        double fat = klawiatura.nextDouble();
        double calories, procents;
        calories = fat*9;
        procents = calories/kalorie;
        if(calories>kalorie){
            System.out.println("Wprowadzono zle dane");

        }

        else {
            System.out.println(procents);
        }

        if(procents<=0.30){
            System.out.println("Produkt ma malo tluszczu");

        }

        else{
            System.out.println("produkt posiada odpowiednia wartosc tluszczowa");

        }



    }
}
