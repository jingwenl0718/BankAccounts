public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();

        bankAccount1.depositMoney("checking", 100);
        System.out.println(bankAccount1.getCheckingBalance());
        bankAccount1.depositMoney("saving", 150);
        System.out.println(bankAccount1.getSavingsBalance());
        System.out.println(bankAccount1.getTotalMoney());

        bankAccount2.depositMoney("checking", 10);
        System.out.println(bankAccount2.getCheckingBalance());
        bankAccount2.withdrawMoney("checking", 20);
        System.out.println(bankAccount2.getCheckingBalance());
        bankAccount2.depositMoney("saving", 20);
        System.out.println(bankAccount2.getSavingsBalance());
        bankAccount2.withdrawMoney("saving", 15);
        System.out.println(bankAccount2.getSavingsBalance());
        System.out.println(BankAccount.getTotalMoney());

        System.out.println(BankAccount.getAccountNumber());
    }
}