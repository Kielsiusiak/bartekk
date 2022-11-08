package drugie;
import java.util.Scanner;
public class zadanie16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double waga;
        System.out.println("podaj wage: ");
        waga = klawiatura.nextDouble();

        double ciezar;
        ciezar = waga* 9.8;

        if(ciezar > 1000) {
            System.out.println("Rzecz jest ciezka");
        }
        if(ciezar < 10){
            System.out.println("Rzecz jest lekka");

        }
        else{
            System.out.println("rzecz ma mase: " + ciezar + "N");

        }
    }
}
