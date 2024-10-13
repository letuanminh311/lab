public class Bill {
    private int[] bills;

    public Bill(int[] bills) {
        this.bills = bills;
    }

    public int calcTotal() {
        int total = 0;
        for (int bill : bills) {
            total += bill;
        }
        return total;
    }
}
