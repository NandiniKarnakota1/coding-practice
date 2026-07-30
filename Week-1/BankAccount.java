public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String ac, double bal){
        accountHolder = ac;
        balance = bal;
    }

    public void deposit(double amount){
        if(amount <= 0) throw new IllegalArgumentException("Deposit must be greater than zero.");
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount <=0) throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");

        if(amount > balance) throw new IllegalStateException("Insufficient funds.");

        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args){
        BankAccount acc = new BankAccount("Nrusimha Saraswati", 250000);

        acc.deposit(25000);
        acc.withdraw(5000);
        System.out.println("A/c Holder: " + acc.accountHolder + "Balance: " +acc.getBalance());

        BankAccount acc1 = new BankAccount("User1",25000);
        acc1.withdraw(4500);
        //acc1.deposit(-1);
        //acc.withdraw(-500);
        acc1.deposit(45000);
        acc1.withdraw(500);
        System.out.println("A/c Holder: " + acc1.accountHolder + "Balance: " +acc1.getBalance());

    }
}
