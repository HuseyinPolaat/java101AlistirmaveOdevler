package chapter6;

public class BillDetails {
    public static void main(String[] args) {
        PhoneBill bill1 = new PhoneBill(25, 1000, 1234, 130);

        System.out.print(
                "Bill Id: " + bill1.getId() +
                        "\nMinutes: "  + bill1.getMinutes() +
                        "\nUsed Minutes: " + bill1.getUsedMinutes() +
                        "\nNormal Price: " + bill1.getNormalBillPrice() +
                        "\nTotal Bill Price: " + bill1.calculateBill()
                );
    }
}
