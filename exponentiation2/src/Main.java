import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long base, exponent, result = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Kuvvetini almak istediğiniz sayıyı giriniz: ");
        base = input.nextInt();

        if (base < 0){
            System.out.println("tabanı pozitif bir değer veya sıfır girmelisiniz tekrar bir değer yazınız: ");
            base = input.nextInt();
        }

        System.out.println("Kuvvet değerini giriniz: ");
        exponent = input.nextInt();

        if (base < 0){
            System.out.println("kuvvet pozitif bir değer veya sıfır olmalıdır. Yeni değeri yazınız: ");
            base = input.nextInt();
        }

        for (int i = 1; i <= exponent ; i++){
            result *= base;
        }
        System.out.println(base + " ^ " + exponent + " = " + result);

    }
}
