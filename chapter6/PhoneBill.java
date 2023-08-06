package chapter6;

public class PhoneBill {
    private int id;
    private int minutes;
    private int usedMinutes;
    private int normalBillPrice;

    public PhoneBill(int id){
        this.id = id;
        this.minutes = 1000;
        this.usedMinutes = 870;
        this.normalBillPrice = 200;
    }

    public PhoneBill(int id, int minutes, int usedMinutes, int normalBillPrice){
        this.id = id;
        this.minutes = minutes;
        this.usedMinutes = usedMinutes;
        this.normalBillPrice = normalBillPrice;
    }
    public PhoneBill(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getUsedMinutes() {
        return usedMinutes;
    }

    public void setUsedMinutes(int usedMinutes) {
        this.usedMinutes = usedMinutes;
    }

    public int getNormalBillPrice() {
        return normalBillPrice;
    }

    public void setNormalBillPrice(int normalBillPrice) {
        this.normalBillPrice = normalBillPrice;
    }

    public double calculteExtraUsage(){
        if(this.usedMinutes <= this.minutes) {
            return 0;
        }

        return 0.20 * (this.usedMinutes - this.minutes);
    }

    public double calculateBill( ){
        double totalBill  = this.normalBillPrice + this.calculteExtraUsage();
        return totalBill;
    }
}
