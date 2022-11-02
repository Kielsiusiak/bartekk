public class zadanie6 {


    public static void main(String[] args) {
        int pomieszczenie1;
        int pomieszczenie2;
        int pomieszczenie3;


        int wymiar1 = 3;
        int wymiar2 = 4;
        int wymiar3 = 2;
        int wymiar4 = 3;
        int wymiar5 = 2;
        int wymiar6 = 2;


        pomieszczenie1 = wymiar1 * wymiar2;
        pomieszczenie2 = wymiar1 * wymiar2;
        pomieszczenie3 = wymiar3 * wymiar4;
        int pomieszczenie4 = wymiar5 * wymiar6;


        System.out.println(pomieszczenie1);
        System.out.println(pomieszczenie2);
        System.out.println(pomieszczenie3);
        System.out.println(pomieszczenie4);

        int powierzchniaCalkowita;
        powierzchniaCalkowita = pomieszczenie1 + pomieszczenie2 + pomieszczenie3 + pomieszczenie4;
        System.out.println(powierzchniaCalkowita);


        int powierzchniadla1osoby = powierzchniaCalkowita/ 4;
        System.out.println(powierzchniadla1osoby);




    }
}

