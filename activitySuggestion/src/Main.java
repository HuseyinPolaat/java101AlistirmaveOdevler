import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temperature;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık değerini giriniz: ");
        temperature = input.nextInt();

        if (temperature < 5){
            System.out.println("Kayak yapabilirsin");
        } else if (temperature >= 5 && temperature <= 15){
            if (temperature < 10){
                System.out.println("Sinemaya gidebilirsin.");
            } else{
                System.out.println("Bu hava hem sinema hem de piknik için uygun. Tercih senin!");
            }
        } else if (temperature >= 15 && temperature <= 25){
            System.out.println("harika bir piknik havası!");
        } else {
            System.out.println("Yüzmeyi öneriyorum! Harika bir spor!");
        }
    }
}
