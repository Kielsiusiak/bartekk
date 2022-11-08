package drugie;

import java.util.Scanner;

public class zadanie15 {
    public static void main(String[] args){
        double sprawdzian1;
        double sprawdzian2;
        double sprawdzian3;
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Pokaz wyniki z trzech sprawdzianow");
        sprawdzian1 = klawiatura.nextDouble();
        sprawdzian2 = klawiatura.nextDouble();
        sprawdzian3 = klawiatura.nextDouble();
        double srednia;
        srednia = sprawdzian1 + sprawdzian2 + sprawdzian3;
        srednia = srednia / 3;
        System.out.println(srednia);

        if (srednia > 90){
            System.out.println("5");
        } else if (srednia > 80) {
            System.out.println("4");
        } else if (srednia > 70){
            System.out.println("3");
        }else if (srednia > 60) {
            System.out.println("2");
        }else if (srednia > 50){
            System.out.println("1");
        }
        else{
            System.out.println("Liczba jest niewlasciwa");
        }
    }
}
