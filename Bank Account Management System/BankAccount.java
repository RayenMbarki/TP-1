import javax.naming.InsufficientResourcesException;

public class BankAccount {
    private int accoutNumber;
    private int balance;
    private String accountHolderName;
    public BankAccount(int accountNumber,String accountHolderName,int balance) {
        this.accountHolderName=accountHolderName;
        this.accoutNumber=accountNumber;
        this.balance=balance;
    }
    public int getAccountNumber() {
        return accoutNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        this.balance+=amount;
    }



    public void withdraw(int amount) throws NegativeBalanceException, InsufficientAmountException {
        if  (this.getBalance() < 0  ) {throw new NegativeBalanceException();}
         if  (amount > this.getBalance()) {throw new InsufficientAmountException();}
        //if (this.getBalance() == 0 ) System.out.println("you have no money in your bank account");

         balance-=amount;


    }
    public void check_account() {
        System.out.println("bank account number " + this.getAccountNumber() + " of Mr " + this.accountHolderName + " have " + this.getBalance() + " dollars ");
    }



}
