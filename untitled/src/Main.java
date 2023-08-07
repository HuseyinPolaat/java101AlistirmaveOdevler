import java.util.*;
import java.io.*;

class Main {

    public static String FirstReverse(String str) {
        // code goes here
        String reverse = "";
        int length = str.length();
        int tmp = 0;
        for (int i = length - 1; i >= 0; i--, tmp++) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static void main (String[] args) {

        // keep this function call here
        int x = 5;
        System.out.println(x++);
    }

}