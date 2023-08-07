import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numb, temp = 0,  temp2 = 1, res = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("kaç tane fibonacci sayısı istiyorsun?:" );
        numb = input.nextInt();
        
        for (int i = 0; i <= numb; i++){
            System.out.println(res);
            res = temp + temp2;
            temp = temp2;
            temp2 = res;
        }
    }
}
