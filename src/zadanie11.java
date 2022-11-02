import java.util.Scanner;

public class zadanie11 {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double km;
        System.out.println("Podaj ile kilometrow zostalo przejechanych: ");
        km = klawiatura.nextInt();
        klawiatura.nextLine();
        double benzyna;
        System.out.println(" Podaj ile litrow benzyny zostalo uzyte: ");
        benzyna = klawiatura.nextInt();
        klawiatura.nextLine();
        double kmnalitr = km/benzyna;
        System.out.println(" Auto spala litr na " + kmnalitr + " kilometrow");


    }
}