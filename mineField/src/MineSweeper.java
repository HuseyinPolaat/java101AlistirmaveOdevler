import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rows;
    int cols;
    int mines;
    String[][] map;
    String[][] mineField;

    MineSweeper(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.mines = (rows * cols) / 4;
        this.mineField = new String[rows][cols];
        this.map = new String[rows][cols];
    }

    void run(){
        olustur();
        yerlestir();
        System.out.println("###################################");
        oyna();
    }

    void olustur(){
        for (int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.cols; j++){
                map[i][j] = "- ";
                mineField[i][j] = "- ";
            }
        }
    }

    void yerlestir(){
        for(int i = 0; i < mines; i++){
            Random rnd = new Random();
            int a, b;
            a = rnd.nextInt(rows);
            b = rnd.nextInt(cols);
            if (map[a][b] != "- ") {
                a = rnd.nextInt(rows);
                b = rnd.nextInt(cols);
            }
            map[a][b] = "* ";
        }
    }

    void yazMineField(){
        for (int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.cols; j++){
                System.out.print(mineField[i][j]);
            }
            System.out.println();
        }
    }

    void yazMap(){
        for (int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.cols; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    void oyna(){
        Scanner input = new Scanner(System.in);
        yazMineField();

        while(true){
            boolean check = true;
            int a, b, sayac = 0;
            System.out.print("Satır giriniz: ");
            a = input.nextInt();
            System.out.print("Sütun giriniz: ");
            b = input.nextInt();

            // matris sınırlarının dışında değer girilmesi durumu
            if(a > rows - 1 || b > cols - 1 || a < 0 || b < 0){
                System.out.println("Girdiğiniz değerler hatalı! Tekrar giriş yapınız.");
                System.out.println("###################################");
                continue;
            }

            if(map[a][b] == "* "){
                System.out.println("Mayııın! Bomm! Game Over...");
                break;
            }

            // satır değerinin, matris uç değerlerinin(ilk ve son satır dahil değil) içinde girilmesi durumunda yapılacaklar
            if(a > 0 && a < cols - 1){

                // satır değerinden sonra girilen sütun değerine göre yapılacaklar
                // (sütun değerinin ilk, son ve ara sütun olma durumları)
                if(b == 0){
                    for (int i = a - 1; i <= a + 1; i++ ) {
                        for (int j = b; j < b + 2; j++) {
                            if (map[i][j] == map[a][b]) {
                                continue;
                            }
                            if (map[i][j] == "* ") {
                                sayac += 1;
                            }
                        }
                    }
                    mineField[a][b] = String.valueOf(sayac) + " ";
                    map[a][b] = String.valueOf(sayac) + " ";
                }
                else if(b == cols - 1){
                    for (int i = a - 1; i <= a + 1; i++ ) {
                        for (int j = b; j > b - 2; j--) {
                            if (map[i][j] == map[a][b]) {
                                continue;
                            }
                            if (map[i][j] == "* ") {
                                sayac += 1;
                            }
                        }
                    }
                    mineField[a][b] = String.valueOf(sayac) + " ";
                    map[a][b] = String.valueOf(sayac) + " ";
                }
                if(b > 0 && b < rows - 1){
                    for (int i = a - 1; i <= a + 1; i++ ) {
                        for (int j = b - 1; j <= b + 1; j++) {
                            if (map[i][j] == map[a][b]) {
                                continue;
                            }
                            if (map[i][j] == "* ") {
                                sayac += 1;
                            }
                        }
                    }
                    mineField[a][b] = String.valueOf(sayac) + " ";
                    map[a][b] = String.valueOf(sayac) + " ";
                }
            }

            // satır değerinin 0 girilmesi durumunda yapılacaklar
            else if(a == 0){
                if(b == 0){
                    for (int i = a; i < a + 2; i++ ) {
                        for (int j = b; j < b + 2; j++) {
                            if (map[i][j] == map[a][b]) {
                                continue;
                            }
                            if (map[i][j] == "* ") {
                                sayac += 1;
                            }
                        }
                    }
                    mineField[a][b] = String.valueOf(sayac) + " ";
                    map[a][b] = String.valueOf(sayac) + " ";
                }
                else if(b == cols - 1){
                    for (int i = a; i < a + 2; i++ ) {
                        for (int j = b; j > b - 2; j--) {
                            if (map[i][j] == map[a][b]) {
                                continue;
                            }
                            if (map[i][j] == "* ") {
                                sayac += 1;
                            }
                        }
                    }
                    mineField[a][b] = String.valueOf(sayac) + " ";
                    map[a][b] = String.valueOf(sayac) + " ";
                }
                else {
                    for (int i = a; i < a + 2; i++ ) {
                        for (int j = b - 1; j <= b + 1; j++) {
                            if (map[i][j] == map[a][b]) {
                                continue;
                            }
                            if (map[i][j] == "* ") {
                                sayac += 1;
                            }
                        }
                    }
                    mineField[a][b] = String.valueOf(sayac) + " ";
                    map[a][b] = String.valueOf(sayac) + " ";
                }

            }

            // girilen satır değerinin en alttaki satır olması durumunda yapılacaklar
            else if(a == rows - 1){

                if(b == 0){
                    for (int i = a; i > a - 2; i-- ) {
                        for (int j = b; j < b + 2; j++) {
                            if (map[i][j] == map[a][b]) {
                                continue;
                            }
                            if (map[i][j] == "* ") {
                                sayac += 1;
                            }
                        }
                    }
                    mineField[a][b] = String.valueOf(sayac) + " ";
                    map[a][b] = String.valueOf(sayac) + " ";
                } else if(b == cols - 1){
                    for (int i = a; i > a - 2; i-- ) {
                        for (int j = b; j > b - 2; j--) {
                            if (map[i][j] == map[a][b]) {
                                continue;
                            }
                            if (map[i][j] == "* ") {
                                sayac += 1;
                            }
                        }
                    }
                    mineField[a][b] = String.valueOf(sayac) + " ";
                    map[a][b] = String.valueOf(sayac) + " ";
                } else {

                    for (int i = a - 1; i < a + 1; i++ ) {
                        for (int j = b - 1; j <= b + 1; j++) {
                            if (map[i][j] == map[a][b]) {
                                continue;
                            }
                            if (map[i][j] == "* ") {
                                sayac += 1;
                            }
                        }
                    }
                    mineField[a][b] = String.valueOf(sayac) + " ";
                    map[a][b] = String.valueOf(sayac) + " ";
                }

            }

            //Kazanma durumunun kontrolü
            for (int i = 0; i < this.rows; i++){
                for(int j = 0; j < this.cols; j++){
                    if (map[i][j] == "- ") {
                        check = false;
                    }
                }
            }
            //Kazanma durumunun kontrolü
            if(check){
                System.out.println("Kazandınız!");
                yazMap();
                break;
            }
            yazMineField();
            System.out.println("###################################");
        }
    }
}
