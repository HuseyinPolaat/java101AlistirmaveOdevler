import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numb, result = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        numb = input.nextInt();

        System.out.print("Girdiğiniz sayıdan küçük olan 4'ün tüm kuvvetleri: ");
        for (int i = 1; i < numb; i++){
            result *= 4;
            if(result < numb){
                System.out.print(result + ", ");
            }
            else{
                break;
            }
        }

        System.out.println();
        result = 1;

        System.out.print("Girdiğiniz sayıdan küçük olan 5'in tüm kuvvetleri: ");
        for (int i = 1; i < numb; i++) {
            result *= 5;
            if (result < numb) {
                System.out.print(result + ", ");
            } else {
                break;
            }
        }

    }
}
