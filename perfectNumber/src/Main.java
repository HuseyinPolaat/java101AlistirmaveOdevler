import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numb, sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        numb = input.nextInt();

        for (int i = 1; i <= numb / 2; i++){
            if (numb % i == 0){
                sum += i;
            }
        }

        if (sum == numb){
            System.out.println(numb + " sayısı mükemmel bir sayıdır.");
        } else{
            System.out.println(numb + " sayısı mükemmel sayı değildir.");
        }
    }
}
