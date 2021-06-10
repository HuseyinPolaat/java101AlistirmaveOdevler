public class Main {
    public static void main(String[] args) {
        double [] arr =  new double[10];
        double sum = 0;
        double harmonic = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100);
            sum += 1 / arr[i];
            System.out.print(arr[i] + " ");
        }
        harmonic = arr.length / sum;

        System.out.println("\nBu dizinin harmonik ortalaması: " + harmonic);
    }
}
