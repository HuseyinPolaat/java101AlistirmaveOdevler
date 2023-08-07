import java.util.Scanner;

public class Main {

    static int desenYap(int x){
        if(x <= 0){
            System.out.print(x + " ");
            desenYap(x  + 5);
        }
        System.out.print(x + " ");
        return desenYap(x - 5);
    }
    // girdi: desenYap(15);
    // çıktı: 15 10 5 0 5 10 15

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı girin: ");
        int numb = input.nextInt();

        desenYap(numb);

        /*
      int a = 48;
      int tmp = a;

      while (true){
          if (a <= 0){
              while (true){
                  System.out.print(a + " ");
                  if (a == tmp){
                      break;
                  }
                  a += 5;
              }
              break;
          } else{
              System.out.print(a + " ");
              a -= 5;
              if (a == tmp){
                  break;
              }
          }
      }
       */
    }
}
