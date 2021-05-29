import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numb, sum = 0, count=0, average = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı girin: ");
        numb = input.nextInt();

        /*
        for (int i = 1; i <= numb; i++){
            if(i % 12 == 0){
                sum += i;
                count++;
            }
        }
        */

        int i = 1;
        while(i++ <= numb){
            if(i % 12 == 0){
                sum += i;
                count++;
            }
        }
        average = sum / count;

        System.out.println("1" + " ve " + numb + " aralığında 3 ve 4e tam bölünen sayıların ortalaması: " + average);
    }
}
