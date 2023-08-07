import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numb;
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin boyutunu girin: ");
        numb = input.nextInt();

        for (int i = numb; i >= 0; i-- ){
            for (int j = 0; j < (numb - i); j++){
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
