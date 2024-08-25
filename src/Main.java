public class Bank {
    // Fields for account type and account balance
    private String accountType;
    private double accountBalance;

    // Method to deposit money
    public double deposit(double amount) {
        accountBalance += amount;
        return accountBalance;
    }

    // Method to withdraw money
    public double withdrawal(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
        return accountBalance;
    }
}
