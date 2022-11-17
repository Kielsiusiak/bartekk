package drugie;
import java.util.Scanner;
public class zadani20 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println(" Ile przesylka wazy: ");
        double scales = klawiatura.nextDouble();
        System.out.println(" Podaj trase pzesylki w km: ");
        double odleglosc = klawiatura.nextDouble();
        double cennik;
        double km;
        km = 500/odleglosc;
         if(km<=500){
            if(scales <=1){
                cennik = 1.10;
                System.out.println(" Zaplacisz : "+cennik);
            }
            else if(scales>=1 && scales <=3){
                cennik = 2.20;
                System.out.println(" Zaplacisz: "+cennik);
            }
            else if(scales>=3 && scales<=5){
                cennik = 3.70;
                System.out.println(" Zaplacisz: "+cennik);
            }
            else if(scales>=5){
                cennik = 3.80;
                System.out.println(" Zaplacisz: "+cennik);
            }
        }

    }
}