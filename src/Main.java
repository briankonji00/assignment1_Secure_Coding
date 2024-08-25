public class Bank {
    // Fields for account type and account balance
    private String accountType;
    private double accountBalance;

    // Method to deposit money
    public double deposit(double amount) {
        accountBalance += amount;
        return accountBalance;
    }
}
