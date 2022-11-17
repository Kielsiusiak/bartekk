package drugie;
import java.util.Scanner;
public class zadanie25 {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double check;
        double payment = 0;

        System.out.println("Ile zakupiłes checkow w danym miesiacu: ");
        check = klawiatura.nextDouble();
        klawiatura.nextLine();

        if (check < 20)
        {
            payment = (0.1*check+10);
        }

        if (check >= 20 && check < 40)
        {
            payment = (0.08*check+10);
        }
        if (check >= 40 && check < 60)
        {
            payment = (0.06*check+10);
        }
        if (check >= 60)
        {
            payment = (0.04*check+10);
        }
        System.out.println("Ilosc pobranych oplat przez bank: " + payment+ " w miesiącu");
    }
}
