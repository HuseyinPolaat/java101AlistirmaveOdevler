import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numb, sum =0, temp;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        numb = input.nextInt();


        while (numb != 0){
            temp = numb % 10;
            numb /= 10;
            sum += temp;
        }

        System.out.println("Girdiğiniz sayının basamak değerleri toplamı: " + sum);
    }
}
