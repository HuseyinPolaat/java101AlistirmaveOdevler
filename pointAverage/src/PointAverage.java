import java.util.Scanner;

public class PointAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        int mathPoint = input.nextShort();

        System.out.println("Fizik notunuzu giriniz: ");
        int phisicsPoint = input.nextShort();

        System.out.println("Kimya notunuzu giriniz: ");
        int chemistryPoint = input.nextShort();

        System.out.println("Tarih notunuzu giriniz: ");
        int historyPoint = input.nextShort();

        System.out.println("Türkçe notunuzu giriniz: ");
        int turkishPoint = input.nextShort();

        System.out.println("Müzik notunuzu giriniz: ");
        int musicPoint = input.nextShort();

        int average = (mathPoint + phisicsPoint +
                chemistryPoint + historyPoint + turkishPoint + musicPoint) / 6;

        System.out.println( average > 60 ? "Durum: Sınıfı Geçti" : "Durum: Sınıfta Kaldı");
    }
}
