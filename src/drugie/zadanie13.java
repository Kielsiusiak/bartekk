package drugie;
import java.util.Scanner;


public class zadanie13 {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double day;

        System.out.println("Podaj jakikolwiek dzien: ");
        day = klawiatura.nextInt();
        klawiatura.nextLine();

        double month;

        System.out.println("podaj jakikolwiek miesiac: ");
        month = klawiatura.nextInt();
        klawiatura.nextLine();

        double year;

        System.out.println("Wpisz ostatnie dwie cyfry roku: ");
        year = klawiatura.nextInt();
        klawiatura.nextLine();

        double info1 = day*month;

        if(info1 == year)
        {
            System.out.println("Data jest magic");
        }

        if(info1 != year)
        {
            System.out.println("Data nie jest magic");
        }
    }
}