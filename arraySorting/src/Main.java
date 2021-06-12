import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[8];
        int tmp = 0;
        Scanner input = new Scanner(System.in);

        for (int i= 0; i < arr.length; i++){
            System.out.println("Dizinin " + (i + 1) + ". elemanını giriniz: ");
            arr[i] = input.nextInt();
        }

        System.out.println("Oluşturduğunuz dizi: ");
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();


       for (int i= 0; i < arr.length; i++){
           for(int k = i + 1; k < arr.length; k++){
               if(arr[k] < arr[i]){
                   tmp = arr[i];
                   arr[i] = arr[k];
                   arr[k] = tmp;
               }
           }
       }

       System.out.println("Dizinin sıralanmış hali: ");
       for(int i: arr){
           System.out.print(i + " ");
       }

    }
}
