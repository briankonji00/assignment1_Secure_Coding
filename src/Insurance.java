public class Insurance extends Bank {
    // Constructor for Insurance class
    public Insurance(String accountType, double accountBalance) {
        super(accountType, accountBalance); // Call the constructor of the superclass (Bank)

    }
    // Method to print coverage message
    public void cover() {
        System.out.println("You are covered.");
    }
}

