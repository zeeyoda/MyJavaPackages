package muhtar38;

public class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;

    public void deposit(double amount) {
        System.out.println("-----------------------------------------------------------");
        String acc = "" + accountNumber;
        String accountNumber = "*********" + acc.substring(12);
        System.out.println("Depositing $" + amount + " to the account number " + accountNumber);
        balance += amount;
        if(balance<0){
            balance-=35;
        }
        System.out.println("New balance is $" + balance);
        System.out.println("------------------------------------------------------------");

    }

    public void withdraw(double amount) {
        if(balance<=0){
            System.out.println("There is no available balance");
            return;
        }
        balance -= amount;
        String acc = "" + accountNumber;
        String accountNumber = "*********" + acc.substring(12);
        System.out.println("You withdrew $" + amount + " from the account number ending in " + accountNumber + ". Your new balance is $" + balance);

    }

    public void showBalance() {
        System.out.println("------------------------------------------------");
        String acc = "" + accountNumber;
        String accountNumber = "*********" + acc.substring(12);
        System.out.println("Account Holder " + accountHolder);
        System.out.println("Account number " + accountNumber);
        System.out.println("Account balance: $" + balance);
        System.out.println("-------------------------------------------------");
    }
}
