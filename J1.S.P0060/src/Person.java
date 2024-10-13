public class Person {
    private Wallet wallet;

    public Person(int walletAmount) {
        this.wallet = new Wallet(walletAmount);
    }

    public boolean payBills(Bill bill) {
        int totalBill = bill.calcTotal();
        if (wallet.isEnough(totalBill)) {
            wallet.deductAmount(totalBill);
            System.out.println("You can buy it.");
            return true;
        } else {
            System.out.println("You can’t buy it.");
            return false;
        }
    }

    public int getWalletAmount() {
        return wallet.getAmount();
    }
}
