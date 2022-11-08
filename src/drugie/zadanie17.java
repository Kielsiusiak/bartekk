package drugie;
import java.util.Scanner;
public class zadanie17 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double iloscsekund;
        System.out.println(" wpisz ilosc sekund: ");
        iloscsekund = klawiatura.nextDouble();
        if (iloscsekund > 86400) {
            double day;
            day = iloscsekund / 86400;
            System.out.println("ilosc dni: " + day);
        }else if (iloscsekund > 3600) {
            double hours;
            hours = iloscsekund / 3600;
            System.out.print("Ilosc godzin: " + hours);
        }else if(iloscsekund > 60){
            double minutes;
            minutes = iloscsekund / 60;
            System.out.print("ilosc minut: " + minutes);
        }
    }
}
