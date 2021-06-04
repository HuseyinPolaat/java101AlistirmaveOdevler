import java.util.Scanner;

public class Main {

    static int fib(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        System.out.println("kaç tane fionacci sayısı görmek istersin?: ");
        int numb = input.nextInt();
        
        for(int i = 0; i < numb; i++){
            System.out.println(fib(i));
        }
    }
}
