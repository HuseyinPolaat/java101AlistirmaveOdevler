import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numb1, numb2, count, ebob =1, ekok;
        Scanner input= new Scanner(System.in);

        System.out.print("1. sayıyı giriniz. ");
        numb1 = input.nextInt();
        System.out.print("2. sayıyı giriniz. ");
        numb2 = input.nextInt();

        if (numb1 <= numb2){
            count = numb1;
        } else {
            count = numb2;
        }

        while(true){
            if (numb1 == 0 || numb2 == 0 ){
                System.out.println("0'dan farklı değerler girmelisiniz!");
                break;
            } else if (numb1 % count == 0 && numb2 % count == 0){
                ebob = count;
                System.out.println("ebob: " + ebob);
                break;
            }
            count--;
        }

        ekok = (numb1 * numb2) / ebob;
        System.out.println("ekok: " + ekok);

    }
}
