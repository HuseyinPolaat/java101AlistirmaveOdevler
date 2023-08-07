
public class Main {
    public static void main(String[] args) {

        for(int i = 2; i < 100 ; i++){
            boolean isPrime = true;
            for (int k = 2; k <= i / 2 ; k++){
                if(i % k == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + ", ");
            }
        }

    }
}
