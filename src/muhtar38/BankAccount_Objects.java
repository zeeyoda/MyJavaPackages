package muhtar38;

public class BankAccount_Objects {
    public static void main(String[] args) {

        BankAccount  acc1 = new BankAccount();
        acc1.accountHolder = "Ziyoda";
        acc1.accountNumber = 1234567891234567L;
        acc1.balance = 1235.16;
        acc1.showBalance();
        acc1.deposit(345.01);
        acc1.showBalance();
        acc1.withdraw(1800.00);
        acc1.withdraw(20);

    }
}
