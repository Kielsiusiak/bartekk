package drugie;
import java.util.Scanner;
public class zadani27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String restauracja1, restauracja2, restauracja3, restauracja4, restauracja5;

        restauracja1 = "burgery u Jarka";
        restauracja2 = "Pizzeria ";
        restauracja3 = "kawiarnia na rogu";
        restauracja4 = "kuchnia u szefa";
        restauracja5 = "wloskie specjaly";
        char weganin, wegetarianin, bezglutenowiec;

        System.out.println(" czy jestes wegetarianinem? Tak T czy Nie N?");
        wegetarianin = scanner.next().charAt(0);

        System.out.println("czy jestes wegetarianinem? Tak T czy Nie N?");
        weganin = scanner.next().charAt(0);

        System.out.println("czy jestes osoba ktora nie je glutenu? Tak T czy Nie N?");
        bezglutenowiec = scanner.next().charAt(0);
        System.out.println(" proponuje isc do tych restauracji: ");

        if (wegetarianin =='N'&& weganin=='N'&& bezglutenowiec=='N' )
        {
            System.out.println(" mozesz isc do: "+ restauracja1);
            System.out.println(" mozesz isc do: "+ restauracja2);
            System.out.println(" mozesz isc do: "+ restauracja4);
        }
        else if (weganin =='T'&& wegetarianin=='N'&& bezglutenowiec=='N' )
        {
            System.out.println(" mozesz isc do:"+ restauracja2);
            System.out.println(" mozesz isc do:"+ restauracja5);
        }
        else if (weganin=='N'&& wegetarianin=='N'&& bezglutenowiec=='T' )
        {
            System.out.println("mozesz isc do:"+ restauracja2);
            System.out.println("mozesz isc do:"+restauracja3);
            System.out.println(" mozesz isc do:"+ restauracja5);
        }

        else if (weganin =='T'&& wegetarianin  =='T'&& bezglutenowiec=='T' )
        {
            System.out.println(" mozesz isc do:"+ restauracja2);
            System.out.println(" mozesz isc do:"+ restauracja3);
            System.out.println(" mozesz isc do:"+ restauracja4);
            System.out.println(" mozesz isc do:"+ restauracja5);
        }
        else if (weganin =='N'&& wegetarianin=='T'&& bezglutenowiec=='N' )
        {
            System.out.println(" mozesz isc do:"+ restauracja2);
            System.out.println(" mozesz isc do:"+ restauracja3);
            System.out.println(" mozesz isc do:"+ restauracja4);
            System.out.println(" mozesz isc do:"+ restauracja5);
        }
        else if (weganin =='T'&& wegetarianin=='T'&& bezglutenowiec=='N' )
        {
            System.out.println(" mozesz isc do:"+ restauracja3);
            System.out.println(" mozesz isc do:"+ restauracja5);
        }
        else if (weganin =='N'&& wegetarianin=='T'&& bezglutenowiec=='T' )
        {
            System.out.println(" mozesz isc do:"+ restauracja2);
            System.out.println(" mozesz isc do:"+ restauracja3);
            System.out.println(" mozesz isc do:"+ restauracja5);
        }
        else if (weganin =='T'&& wegetarianin=='N'&& bezglutenowiec=='T' )
        {
            System.out.println(" mozesz isc do:"+ restauracja2);
            System.out.println(" mozesz isc do:"+ restauracja3);
            System.out.println(" mozesz isc do:"+ restauracja5);
        }

    }

}
