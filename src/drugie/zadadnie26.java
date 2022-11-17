package drugie;
import java.util.Scanner;
public class zadadnie26 {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double books;
        double points = 0;

        System.out.println("Ilosc zakupionych ksiazek w danym miesiacu: ");
        books = klawiatura.nextDouble();
        klawiatura.nextLine();

        if (books == 1)
        {
            points = 5;
        }

        if (books == 2)
        {
            points = 15;
        }

        if (books == 3)
        {
            points = 30;
        }
        if (books >= 4)
        {
            points = 60;
        }
        System.out.println("Jesli kupimy " + books + " ksiazek nabywca dostanie: " + points+ " punktow");
    }
}
