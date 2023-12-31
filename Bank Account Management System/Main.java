import javax.naming.InsufficientResourcesException;

public class Main {
    public static void main(String[] args) throws NegativeBalanceException, InsufficientAmountException {
        BankAccount A=new BankAccount(1010,"Rayen Mbarki " ,-250);
        A.deposit(50);
        try {
        A.withdraw(550); }
        catch (NegativeBalanceException e ) {

        }
        catch ( InsufficientAmountException e) {}
        A.check_account();
    }
}