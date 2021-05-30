import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double numb, result = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı girin: ");
        numb = input.nextDouble();

        for (double i = 1;i <= numb; i++){
            result += (1 / i);
        }
        System.out.println("Girdiğiniz sayının harmonik ortalaması = " + result);
    }
}
