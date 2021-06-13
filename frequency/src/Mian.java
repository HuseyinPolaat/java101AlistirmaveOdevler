public class Mian {
    static void sort(int [] arr){
        int tmp;
        for (int i= 0; i < arr.length; i++){
            for(int k = i + 1; k < arr.length; k++){
                if(arr[k] < arr[i]){
                    tmp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] list = {1, 5, 98, 78, 2, 1, 2, 3, 1, 5, 3, 6, 87, 51, 15, 4, 1, 2, 5};

        int count = 0;
        sort(list);
        for(int i = 0; i < list.length; i++){

            for(int k = 0; k < list.length; k++){
                if(list[i] == list[k]){
                    count++;
                }
            }

            if(i == 0 && list[i + 1] == list[i]){
                System.out.println(list[i] + " sayısı " + count + " kere tekrar  edildi.");
            }
            if(i == 0 && list[i + 1] != list[i]){
                System.out.println(list[i] + " sayısı " + count + " kere tekrar  edildi.");
            }
            if(i != 0 && list[i - 1] != list[i]){
                System.out.println(list[i] + " sayısı " + count + " kere tekrar  edildi.");
            }
            count = 0;
        }

    }
}
