public class Main {
    public static void main(String[] args) {
        int[][] list = {{1,2,5}, {6,32,15}};

        int[][] list1 = new int[list[0].length][list.length];

        for(int i= 0; i < list[0].length; i++){
            for(int k = 0; k < list.length ; k++){
                list1[i][k] = list[k][i];
            }
        }

        System.out.println("Matrix :");
        for(int i= 0; i < list.length; i++){
            for(int k = 0; k < list[i].length; k++){
                System.out.print(list[i][k] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Transpose :");
        for(int i= 0; i < list1.length; i++){
            for(int k = 0; k < list1[0].length; k++){
                System.out.print(list1[i][k] + " ");
            }
            System.out.println();
        }

    }
}
