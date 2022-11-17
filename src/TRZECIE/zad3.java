package TRZECIE;
import java.util.Scanner;
public class zad3 {
    public static void main(String[] args){
        boolean twierdzenie = true;
        Scanner scan = new Scanner(System.in);
        String download;
        while (twierdzenie){
            System.out.println("Wpisz slowo");
            download = scan.nextLine();
            if(download.equals(" Yes ") || download.equals("No")){
                twierdzenie = false;
            }else{
                twierdzenie = true;
            }
            System.out.println("Wpisales " + download);
        }
    }
}

