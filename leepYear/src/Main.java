import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        boolean isLeep = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Yıl giriniz: ");
        year = input.nextInt();



        if(year % 4 == 0){
            if (year % 100 == 0) {
                if (year % 400 == 0 ){
                    isLeep = true;
                } else {
                    isLeep = false;
                }
            } else {    // !!!
                isLeep = true; // !!!
            }
        } else {
            isLeep = false;
        }
        if (isLeep){
            System.out.println(year + " artık bir yıldır!");
        } else {
            System.out.println(year + " artık bir yıl değildir!");
        }
    }
}
