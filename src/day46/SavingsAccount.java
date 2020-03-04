package day46;

public class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountHolder, long accountNum, double balance, double interestRate){
        super(accountHolder, accountNum, balance);
        this.interestRate = interestRate;
    }

//and idea to have main here, just doing it for this example
    public static void main(String[] args) {

        SavingsAccount s1 = new SavingsAccount("Ablatt", 123456, 50000, 4.2);
        System.out.println("s1 = "+s1);
        s1.withdraw(10000);
        System.out.println("s1 = "+s1);
        s1.deposit(100);
        System.out.println("s1 = "+s1);
    }
    @Override // this is called annotation
    //it ensures that this is a valid overridden method
    //if any rule does not match, it will not compile
    public void deposit(int amount) {
        balance += amount+(amount*interestRate);
        //calculating interest rate and casting to int variable because deposit
        //method accepts int data type
        int actual = (int) (amount+(amount*interestRate));
        super.deposit(actual);
    }
    @Override
    public void withdraw(int amount){
//        //bank charges $30 fee for every withdrawal
//        balance=balance-amount-30;
//        balance-=(amount+30);
       // super.withdraw(amount+30); Or 2 ways below will work as well.
        super.withdraw(amount);
        super.withdraw(30);

    }


    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
