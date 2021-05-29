import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double weight;
        double height;
        double BMI;

        Scanner input = new Scanner(System.in);
        System.out.print("Kilo değerinizi giriniz: ");
        weight = input.nextDouble();
        System.out.print("Boy değerinizi giriniz (örnek 1,70): ");
        height = input.nextDouble();

        BMI = weight / (height * height);
        System.out.println("Vücut kitle indeksiniz: " + BMI);


    }
}
