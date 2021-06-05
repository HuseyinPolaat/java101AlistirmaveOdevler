import java.util.Scanner;

public class Main {
    static  boolean isPrime(int x, int y){
        if(y == 1){
            return true;
        } else if(x % y == 0){
            return false;
        }
        return isPrime(x, y-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int x = input.nextInt();
        
        System.out.println(isPrime(x, x / 2 ));
    }

}
