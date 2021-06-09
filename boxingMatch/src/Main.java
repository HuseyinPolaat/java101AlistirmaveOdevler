public class Main {
    public static void main(String[] args) {
        Fighter ali = new Fighter("Ali" , 10 , 100, 90, 0);
        Fighter tyson = new Fighter("Tyson" , 10 , 100, 100, 0);
        Ring r = new Ring(ali, tyson , 90 , 100);
        r.run();
    }
}
