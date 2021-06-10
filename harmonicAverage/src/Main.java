public class Main {
    public static void main(String[] args) {
        double [] arr =  new double[10];
        double sum = 0, harmonical;

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 200);
            sum += 1 / arr[i];
            System.out.print(arr[i] + " ");
        }
        harmonical = arr.length / sum;
        System.out.println("\nbu dizinin harmonik ortalaması: " + harmonical);
    }
}
