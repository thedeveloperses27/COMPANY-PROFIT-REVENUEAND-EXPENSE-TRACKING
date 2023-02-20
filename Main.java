import java.util.Scanner;

public class CompanyFinanceTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user for revenue, expenses and tax rate
        System.out.print("Enter total revenue: ");
        double revenue = scanner.nextDouble();

        System.out.print("Enter total expenses: ");
        double expenses = scanner.nextDouble();

        System.out.print("Enter tax rate (in percentage): ");
        double taxRate = scanner.nextDouble();

        // Calculate profit
        double profit = revenue - expenses;

        // Calculate tax amount
        double taxAmount = profit * (taxRate / 100);

        // Calculate net profit
        double netProfit = profit - taxAmount;

        // Display results
        System.out.println("\n=== Company Finance Tracker ===");
        System.out.println("Revenue: $" + revenue);
        System.out.println("Expenses: $" + expenses);
        System.out.println("Profit: $" + profit);
        System.out.println("Tax Amount: $" + taxAmount);
        System.out.println("Net Profit: $" + netProfit);
    }
}
