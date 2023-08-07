import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {
        double distance, age, travelType, price, normalPrice;

        Scanner input = new Scanner(System.in);

        System.out.print("Yolculuk mesafesini girin: ");
        distance = input.nextDouble();
        System.out.print("Yolcunun yaşını girin: ");
        age = input.nextDouble();
        System.out.print("Yolculuk tipini girin: ");
        travelType = input.nextDouble();
        normalPrice = distance * 0.10;
        price = normalPrice;

        if ((distance > 0 && age > 0) && (travelType == 1 || travelType == 2) ){
            if (age < 12 ){
                if (travelType == 2){
                    normalPrice *= 2;
                    price *= 2;
                    price -= price * 0.20;
                }
                price -= price * 0.50;
            }
            else if (age >= 12 && age <= 24){
                if (travelType == 2){
                    normalPrice *= 2;
                    price *= 2;
                    price -= price * 0.20;
                }
                price -= price * 0.10;
            }
            else if (age > 64 ){

                if (travelType == 2){
                    normalPrice *= 2;
                    price *= 2;
                    price -= price * 0.20;
                }
                price -= price * 0.30;
            }
            System.out.println("Bilet Fiyatı: " + normalPrice);
            System.out.print("İndirimli Bilet Fiyatı: " + price);
        } else {
            System.out.println("Hatalı giriş yaptınız!");
        }

    }

}
