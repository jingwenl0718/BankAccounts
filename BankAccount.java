import java.util.Random;

class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts;
    private static double totalMoney;
    private static long accountNumber;

    // constructor
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        accountNumber = generateAccountNumber();
        numberOfAccounts++;
    }

    // getters
    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    public double getSavingsBalance() {
        return this.savingsBalance;
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    // methods
    private static long long generateAccountNumber() {
        Random rand = new Random();
        return rand.nextLongLong(1000000000, 9999999999);
    }

    public void depositMoney(String accountName, double money) {
        if (accountName == "checking") {
            this.checkingBalance += money;
            totalMoney += money;
        } else {
            this.savingsBalance += money;
            totalMoney += money;
        }
    }

    public void withdrawMoney(String accountName, double money) {
        if (accountName == "checking" && this.checkingBalance >= money) {
            this.checkingBalance -= money;
            totalMoney -= money;
        } else if (accountName == "saving" && this.savingsBalance >= money) {
            this.savingsBalance -= money;
            totalMoney -= money;
        }
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

}