import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        String horoscope = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Kaçıncı ayda doğdunuz? : ");
        month = input.nextInt();
        System.out.println("Ayın kaçında doğdunuz?: ");
        day = input.nextInt();

        if (month < 12 && month > 0){
            if (month == 1){
                if (day > 0 && day < 32){
                   horoscope = (day >= 1 && day <= 19)? "Oğlak": "Kova";
                }else{
                    isError = true;
                }
            }
            if (month == 2){
                if (day > 0 && day < 29){
                    horoscope = (day >= 1 && day <= 19)? "Kova": "Balık";
                }else{
                    isError = true;
                }
            }
            if (month == 3){
                if (day > 0 && day < 32){
                    horoscope = (day >= 1 && day <= 21)? "Balık": "Koç";
                }else{
                    isError = true;
                }
            }
            if (month == 4){
                if (day > 0 && day < 31){
                    horoscope = (day >= 1 && day <= 21)? "Koç": "Boğa";
                }else{
                    isError = true;
                }
            }
            if (month == 5){
                if (day > 0 && day < 32){
                    horoscope = (day >= 1 && day <= 21)? "Boğa": "İkizler";
                }else{
                    isError = true;
                }
            }
            if (month == 6){
                if (day > 0 && day < 32){
                    horoscope = (day >= 1 && day <= 22)? "İkizler": "Yengeç";
                }else{
                    isError = true;
                }
            }
            if (month == 7){
                if (day > 0 && day < 32){
                    horoscope = (day >= 1 && day <= 22)? "Yengeç": "Aslan";
                }else{
                    isError = true;
                }
            }
            if (month == 8){
                if (day > 0 && day < 32){
                    horoscope = (day >= 1 && day <= 22)? "Aslan": "Başak";
                }else{
                    isError = true;
                }
            }
            if (month == 9){
                if (day > 0 && day < 31){
                    horoscope = (day >= 1 && day <= 22)? "Başak": "Terazi";
                }else{
                    isError = true;
                }
            }
            if (month == 10){
                if (day > 0 && day < 32){
                    horoscope = (day >= 1 && day <= 22)? "Terazi": "Akrep";
                }else{
                    isError = true;
                }
            }
            if (month == 11){
                if (day > 0 && day < 31){
                    horoscope = (day >= 1 && day <= 22)? "Akrep": "Yay";
                }else{
                    isError = true;
                }
            }
            if (month == 12){
                if (day > 0 && day < 32){
                    horoscope = (day >= 1 && day <= 22)? "Yay": "Oğlak";
                }else{
                    isError = true;
                }
            }
        }else{
            isError = true;
        }
        if (isError) System.out.println("Hatalı gün ya da ay bilgisi girişi.");
        else System.out.println("burcunuz: " + horoscope);

    }
}
