import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String userName = "enriCo";
        String inputName, password;
        Scanner input = new Scanner(System.in);

        System.out.print("kullanıcı adı: ");
        inputName = input.nextLine();
        System.out.print("şifre: ");
        password = input.nextLine();

        if(userName.equals(inputName)){
            System.out.println("giriş başarılı");
        }else{
            System.out.print("kulanıcı adınız yanlış. Şifrenizi sıfırlamak ister misin? (e/h) : ");
            String answer = input.nextLine();
            if (answer.equals("e")){
                System.out.print("yeni şifreyi giriniz: ");
                String newPassword;
                newPassword = input.nextLine();
                if (password.equals(newPassword)) {
                    System.out.println("Şifre oluşturulamadı. lütfen başka şifer gir.");

                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }else {
                System.out.println("yine bekleriz. güle güle.");
            }
        }

    }
}
