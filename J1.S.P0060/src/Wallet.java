public class Wallet {
    private int amount;

    public Wallet(int amount) {
        this.amount = amount;
    }

    public boolean isEnough(int totalBill) {
        return totalBill <= amount;
    }

    public int getAmount() {
        return amount;
    }

    public void deductAmount(int totalBill) {
        if (isEnough(totalBill)) {
            amount -= totalBill;
        }
    }
}
