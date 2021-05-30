import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count, tmp, min = 0, max = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        count = input.nextInt();

        if(count <= 0){
            System.out.println("Hmm. Belli ki giriş yapmayacaksın. Güle güle");
        } else{
            for (int i = 1; i <= count; i++){
                System.out.print(i + ". Sayıyı giriniz: ");
                tmp = input.nextInt();
                if(i == 1){
                    max = tmp;
                    min = tmp;
                } else {
                    if(tmp > max){
                        max = tmp;
                    } else if(tmp < min){
                        min = tmp;
                    }
                }
            }
            System.out.println("En Büyük Sayı: " + max);
            System.out.println("En Küçük Sayı: " + min);
        }

    }
}
