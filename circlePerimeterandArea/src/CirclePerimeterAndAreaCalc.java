import java.util.Scanner;

public class CirclePerimeterAndAreaCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double PI = 3.14;
        double radius;
        double circleArea;
        double pageArea;
        double circlePerimeter;
        double angle;
        
        System.out.print("Daire yarıçapını giriniz: ");
        radius = input.nextDouble();

        System.out.print("Alanını öğrenmek istediğiniz daire diliminin merkez açı ölçüsünü giriniz: ");
        angle = input.nextDouble();

        circleArea = PI * radius * radius;
        circlePerimeter = 2 * PI * radius;
        pageArea = (PI * (radius * radius) * angle) / 360;

        System.out.println("Yarıçapı girilen dairenin alanı : " + circleArea);
        System.out.println("Yarıçapı girilen dairenin çevresi: " + circlePerimeter);
        System.out.println("Merkez açısı girilen ve yarıçapı " + radius +
                " olan daire parçasının alanı: " + pageArea);


    }
}
