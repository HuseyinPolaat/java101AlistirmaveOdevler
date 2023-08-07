public class Main { //kaya
    static boolean isPalindrome(String something){
        int j = 0;
        for(int i = something.length() - 1; i >= 0; i--){
            if(something.charAt(i) != something.charAt(j)){
                return false;
            }
            j++;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
    }
}
