

public class Main {
    public static void main(String[] args) {
        MyListClass<Integer> list = new MyListClass<>();
        list.add(12);
        list.add(2);
        list.add(1);
        list.add(12);
        list.add(6);
        list.add(93);
        list.add(344);

        MyListClass<Integer> sub = list.subList(3, 7);

        System.out.println(sub.contains(7));

    }
}