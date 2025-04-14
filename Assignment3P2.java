import java.util.Scanner;

public class Assignment3P2 {
    static double balance = 3000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter PIN: ");
            int pin = scanner.nextInt();
            if (pin != 1234) {
                throw new IllegalArgumentException("Invalid PIN");
            }
            System.out.print("Withdraw Amount: ");
            double amount = scanner.nextDouble();
            if (amount > balance) {
                throw new IllegalArgumentException("Insufficient balance");
            }
            balance -= amount;
            System.out.println("Withdrawal Successful. Current Balance: " + balance);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage() + ". Current Balance: " + balance);
        } finally {
            scanner.close();
        }
    }
}
