import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numb1, numb2;
        System.out.print("1. sayıyı giriniz: ");
        numb1 = input.nextDouble();
        System.out.print("2. sayıyı giriniz: ");
        numb2 = input.nextDouble();

        System.out.println("1- Toplama");
        System.out.println("2- Çıkarma");
        System.out.println("3- Çarpma");
        System.out.println("4- Bölme");

        System.out.print("İşlem seçiniz: ");
        byte operation = input.nextByte();

        switch (operation){
            case 1:
                System.out.println( "Toplama: "+ (numb1 + numb2));
                break;
            case 2 :
                System.out.println("Çıkarma: " + (numb1 - numb2));
                break;
            case 3 :
                System.out.println("Çarpma: " + (numb1 * numb2));
                break;
            case 4 :
                switch ((int)numb2){
                    case 0:
                        System.out.println("Bir sayı 0'a bölünemez!");
                        break;
                    default:
                        System.out.println("Bölme: " + (numb1 / numb2));
                        break;
                }
                break;
            default:
                System.out.println("1 ve 4 arasında bir seçim yapınız!");
        }


    }
}
