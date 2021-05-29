
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlıcan, tutar;
        Scanner input = new Scanner(System.in);

        System.out.println("Armut kaç kilo? : ");
        armut = input.nextDouble();
        System.out.println("elma kaç kilo? : ");
        elma = input.nextDouble();
        System.out.println("domates kaç kilo? : ");
        domates = input.nextDouble();
        System.out.println("muz kaç kilo? : ");
        muz = input.nextDouble();
        System.out.println("patlıcan kaç kilo? : ");
        patlıcan = input.nextDouble();

        tutar = armut * 2.14 + elma * 3.67 + domates * 1.11 + muz * 0.95 + patlıcan * 5.00;

        System.out.println(tutar + " lira versen yeter abla");


    }
}
