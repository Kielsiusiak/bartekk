package drugie;
import java.util.Scanner;

public class zadanie18 {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String name1;

        System.out.println(" enter name 1 : ");
        name1 = klawiatura.nextLine();
        klawiatura.nextLine();
        String name2;

        System.out.println("enter name 2 : ");
        name2 = klawiatura.nextLine();
        klawiatura.nextLine();
        String name3;

        System.out.println("enter name 3: ");
        name3 = klawiatura.nextLine();
        klawiatura.nextLine();

        if (name1.compareToIgnoreCase(name2) < 0 && name1.compareToIgnoreCase(name3) < 0)
        {
            System.out.println(name1);
            if (name2.compareToIgnoreCase(name3) < 0)
            {
                System.out.println(name2);
                System.out.println(name3);
            }
            if (name3.compareToIgnoreCase(name2) < 0)
            {
                System.out.println(name3);
                System.out.println(name2);
            }
        }
        if (name2.compareToIgnoreCase(name1) < 0 && name2.compareToIgnoreCase(name3) < 0)
        {
            System.out.println(name2);

            if (name1.compareToIgnoreCase(name3) < 0)
            {
                System.out.println(name1);
                System.out.println(name3);
            }

            if (name3.compareToIgnoreCase(name1) < 0)
            {
                System.out.println(name3);
                System.out.println(name1);
            }
        }

        if (name3.compareToIgnoreCase(name1) < 0 && name3.compareToIgnoreCase(name1) < 0)
        {
            System.out.println(name3);

            if (name1.compareToIgnoreCase(name2) < 0)
            {
                System.out.println(name1);
                System.out.println(name2);
            }

            if (name2.compareToIgnoreCase(name1) < 0)
            {
                System.out.println(name2);
                System.out.println(name1);
            }
        }

    }

}