package TRZECIE;
import java.util.Scanner;
public class zad2 {
    public static void main(String[] args){
        boolean twierdzenie = true;
        Scanner scan = new Scanner(System.in);
        char number;
        String download;

        while (twierdzenie){
            System.out.println("Wpisz litere");
            download = scan.nextLine();
            number = download.charAt(0);
            if(number == 't' || number == 'n' || number == 'N'){
                twierdzenie = false;
            }else{
                twierdzenie = true;
            }
            System.out.println("wpisales " + number);
        }
    }
}


