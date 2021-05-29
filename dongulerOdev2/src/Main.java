import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numb, sum = 0;
        boolean isOdd = true;
        Scanner input = new Scanner(System.in);

        while (isOdd){
            System.out.print("bir sayı giriniz: ");
            numb = input.nextInt();
            if(numb % 2 == 0){
                if(numb % 4 == 0){
                    sum += numb;
                }
            }
            else{
                isOdd = false;
            }
        }

        System.out.println("girilen değerlerden çift ve 4ün katlarının toplamı: " + sum);
    }
}
