import java.util.Scanner;

class InvalidTransactionException extends Exception {
    public InvalidTransactionException(String message) {
        super(message);
    }
}

class CurrencyConversionException extends Exception {
    public CurrencyConversionException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdrawForeignCurrency(double amount, double exchangeRate, double transactionFee) 
            throws InvalidTransactionException, CurrencyConversionException {
        
        // Validate exchange rate
        if (exchangeRate <= 0) {
            throw new CurrencyConversionException("Exchange rate cannot be zero or negative.");
        }

        // Validate transaction fee
        if (transactionFee > 0.03 * amount) {
            throw new InvalidTransactionException("Transaction fee exceeds allowable limit.");
        }

        // Check balance
        double totalDeduction = amount + transactionFee;
        if (totalDeduction > balance) {
            System.out.println("Insufficient balance for the withdrawal");
            return;
        }

        // Process withdrawal
        balance -= totalDeduction;
        double foreignAmount = amount * exchangeRate;

        // Print results
        System.out.println(balance);
        System.out.println(foreignAmount);
    }
}

public class CurrencyExchangeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = scanner.nextDouble();
        
        BankAccount account = new BankAccount(balance);
        double amountInBaseCurrency = scanner.nextDouble();
        double exchangeRate = scanner.nextDouble();
        double transactionFee = scanner.nextDouble();

        try {
            account.withdrawForeignCurrency(amountInBaseCurrency, exchangeRate, transactionFee);
        } catch (InvalidTransactionException | CurrencyConversionException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
