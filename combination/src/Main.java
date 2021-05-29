import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int N, r, combination = 0, factorialN = 1, factorialR = 1, factorialJ = 1;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Küme eleman sayısını girin: ");
        N = input.nextInt();
        System.out.print("Gruplama ölçütünü giriniz: ");
        r = input.nextInt();

        for(int i = N; i>=1 ; i--){
            factorialN *= i;
        }

        for(int i = r; i>=1 ; i--){
            factorialR *= i;
        }

        for(int i = (N-r); i>=1 ; i--){
            factorialJ *= i;
        }
        //C(n,r) = n! / (r! * (n-r)!)
        combination = factorialN / (factorialR * factorialJ);

        System.out.print(N + " elemanlı bir kümeden elde edilebilecek " + r + " elamanlı farklı kümelerin sayısı: " + combination);

    }
}
