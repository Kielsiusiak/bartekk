import java.util.Scanner;
public class ZADANIE12 {


    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double numer;

        System.out.println("Podajj liczbe: ");
        numer = klawiatura.nextDouble();


        if(numer==1)
        {
            System.out.println("numer rzymski: I ");
        }
        if(numer==2)
        {
            System.out.println("numer rzymski: II ");
        }
        if(numer==3)
        {
            System.out.println("numer rzymski: III ");
        }
        if(numer==4)
        {
            System.out.println("numer rzymski: IV ");
        }
        if(numer==5)
        {
            System.out.println("numer rzymski: V ");
        }
        if(numer==6)
        {
            System.out.println("numer rzymski: VI ");
        }
        if(numer==7)
        {
            System.out.println("numer rzymski: VII ");
        }
        if(numer==8)
        {
            System.out.println("numer rzymski: VIII ");
        }
        if(numer==9)
        {
            System.out.println("numer rzymski: IX ");
        }
        if(numer==10)
        {
            System.out.println("numer rzymski: X ");
        }
        if(numer>10)
        {
            System.out.println("Zle");
        }

    }
}

