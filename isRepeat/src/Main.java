public class Main {
    public static void main(String[] args) {
        int[] arr = {2,6,7,1,5,45,78,45,12,3,6,5,54,12,6};

        System.out.println("dizimizin tekrar eden elemanları ve kaç defa tekrar ettikleri aşağıda yazılmıştır. ");
        for(int i = 0; i < arr.length; i++){
            int value = arr[i];
            boolean isRepeat = false;
            for (int k = 0; k < arr.length; k++){
                if ((i != k) && value == arr[k]){
                    isRepeat = true;
                }
            }
            if(isRepeat){
                System.out.print(value + " ");
            }
        }
    }
}

