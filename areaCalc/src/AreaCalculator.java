import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double edgeA;
        double edgeB;
        double edgeC;
        double halfPerimeter;
        double area;

        System.out.print("İlk kenar uzunluğunu giriniz: ");
        edgeA = input.nextDouble();
        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        edgeB = input.nextDouble();
        System.out.print("Üçüncü kenar uzunluğunu giriniz: ");
        edgeC = input.nextDouble();

        halfPerimeter = (edgeA + edgeB + edgeC) / 2;
        area = halfPerimeter * (halfPerimeter - edgeA) *
                (halfPerimeter - edgeB) * (halfPerimeter - edgeC);

        System.out.print("Girilen ügenin alanı: " + area);
    }
}
