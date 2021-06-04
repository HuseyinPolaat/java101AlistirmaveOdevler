import java.util.Scanner;

public class Main {
    static int exp(int x, int y){
        if(y == 1){
            return x;
        }
        return x * exp(x, y - 1);
    }

    public static void main(String[] args) {

        int x, y;
        Scanner input = new Scanner(System.in);

        System.out.println("Taban değerini giriniz: ");
        x = input.nextInt();
        System.out.println("Üs değerini giriniz: ");
        y = input.nextInt();

       System.out.println("Sonuç: " + exp(x, y));
    }
}
