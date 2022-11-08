package drugie;
import java.util.Scanner;
public class zadanie14 {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double weight;

        System.out.println("podaj wage w kg: ");
        weight = klawiatura.nextDouble();
        klawiatura.nextLine();

        double height;

        System.out.println("podaj wzrost w metrach: ");
        height = klawiatura.nextDouble();
        klawiatura.nextLine();



        double height2;
        height2 = 2*height;

        double BMI;
        BMI = weight / height2;

        System.out.println("BMI wynosi: " + BMI);
    }
}
