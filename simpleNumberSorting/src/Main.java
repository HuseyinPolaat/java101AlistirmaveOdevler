import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numbA, numbB, numbC;
        Scanner input = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz: ");
        numbA = input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        numbB = input.nextInt();
        System.out.println("Üçüncü sayıyı giriniz: ");
        numbC = input.nextInt();

        if (numbA > numbB && numbA > numbC){
            if(numbB > numbC){
                System.out.println("Girdiğiniz sayıların küçükten büyüğe sıralaması: [" + numbC +
                        ", " + numbB + ", " + numbA + "]");
            } else{
                System.out.println("Girdiğiniz sayıların küçükten büyüğe sıralaması: [" + numbB +
                        ", " + numbC + ", " + numbA + "]");
            }
        } else if(numbB > numbA && numbB > numbC){
            if(numbA > numbC){
                System.out.println("Girdiğiniz sayıların küçükten büyüğe sıralaması: [" + numbC +
                        ", " + numbA + ", " + numbB + "]");
            } else{
                System.out.println("Girdiğiniz sayıların küçükten büyüğe sıralaması: [" + numbA +
                        ", " + numbC + ", " + numbB + "]");
            }
        } else if(numbC > numbA && numbC > numbB){
            if(numbA > numbB){
                System.out.println("Girdiğiniz sayıların küçükten büyüğe sıralaması: [" + numbB +
                        ", " + numbA + ", " + numbC + "]");
            } else{
                System.out.println("Girdiğiniz sayıların küçükten büyüğe sıralaması: [" + numbA +
                        ", " + numbB + ", " + numbC + "]");
            }
        } else{
            System.out.println("Sıralama yapılabilmesi için" +
                    "girdiğiniz sayıların birbirine eşit olmaması gerekiyor!");
        }


    }
}
