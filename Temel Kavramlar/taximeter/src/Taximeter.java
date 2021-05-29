import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        double price = 10.0;
        double distance;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kat edilen yolu giriniz: ");
        distance = input.nextDouble();

        price += distance * 2.20;
        price = (price < 20.0) ? 20.0 : price;

        System.out.println("Ödenecek tutar : " + price + " Türk Lirası");


    }
}
