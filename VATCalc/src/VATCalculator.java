import java.util.Scanner;

public class VATCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Para degerini giriniz: ");
        float price = input.nextFloat();
        price = (price > 0 && price <= 1000) ? price + price * 18 / 100:
                (price > 1000) ? price + price * 8/100: 0;
        System.out.println("Tutar: " + price);
    }
}
