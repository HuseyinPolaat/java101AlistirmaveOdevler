import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int numb = input.nextInt();

        int[] list = new int[10];

        for(int i = 0; i < list.length; i++){
            list[i] = (int) (Math.random() * 500);
            System.out.print(list[i] + " ");
        }
        System.out.println();

        int min = list[0];
        int max = list[0];

        for(int i: list){
            if(i < min){
                min = i;
            }
            if (i > max){
                max = i;
            }
        }

        for(int i: list){
            if (i < numb){
                if (numb - i < numb - min) {
                    min = i;
                }
            }
            if(i > numb){
                if( i - numb < max - numb){
                    max = i;
                }
            }
        }

        System.out.println("max: " + max);
        System.out.println("min: " + min);


    }
}
