package drugie;
import java.util.Scanner;
public class zadanie23 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int distance;
        double weight;
                double cost;

        System.out.println("Wpisz wage przesylki");
        weight = klawiatura.nextDouble();

        System.out.println("Wpisz odleglosc: ");
        distance = klawiatura.nextInt();
        {
            cost =1.10 * ((distance / 500) +1);
            System.out.println("Zaplacisz za wysylke: " + cost);

        }
         if (weight > 1 && weight < 3)
        {
            cost = 2.20 * ((distance / 500) +1);
            System.out.println("Zaplacisz za wysylke: " + cost);
        }
        {
        System.out.println("Zaplacisz za wysylke: " + cost);
        }
         if (weight > 5)
        {
            cost = 3.80 * ((distance / 500 + 3.80 * 1));
            System.out.println("Zaplacisz za wysylke: " + cost);
        }
}

}