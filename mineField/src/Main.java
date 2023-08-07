import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("###################################");
        System.out.println("Mayın tarlası oyununa hoş geldiniz!");

        int rows, cols;
        Scanner input = new Scanner(System.in);

        System.out.print("Oyun alanının enini giriniz: ");
        rows = input.nextInt();
        System.out.print("Oyun alanının boyunu giriniz: ");
        cols = input.nextInt();


        MineSweeper m = new MineSweeper(rows,cols);
        m.run();
    }
}
