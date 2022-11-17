package TRZECIE;

import java.util.Scanner;
public class zad1 {
    public static void main(String[] args){
        boolean twierdzenie = true;
        Scanner scan = new Scanner(System.in);
        int liczba;

        while (twierdzenie){
            System.out.println("wpisz liczbe  10-24");
            liczba= scan.nextInt();

            if (liczba<10||liczba>24){
                twierdzenie = true;
            }else{
                twierdzenie = false;
            }
            System.out.println("wpisales " + liczba);
        }

    }
}

