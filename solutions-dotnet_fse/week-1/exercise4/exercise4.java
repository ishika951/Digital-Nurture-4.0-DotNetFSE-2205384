import java.util.*;

public class FinancialForecast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input historical monthly income
        System.out.print("Enter the number of past months: ");
        int n = sc.nextInt();

        double[] income = new double[n];
        System.out.println("Enter income for each month:");
        for (int i = 0; i < n; i++) {
            System.out.print("Month " + (i + 1) + ": ₹");
            income[i] = sc.nextDouble();
        }

        // Step 2: Calculate average growth rate
        double totalGrowth = 0;
        for (int i = 1; i < n; i++) {
            totalGrowth += (income[i] - income[i - 1]) / income[i - 1];
        }

        double avgGrowthRate = totalGrowth / (n - 1);

        // Step 3: Forecast next month
        double forecast = income[n - 1] * (1 + avgGrowthRate);

        // Step 4: Output
        System.out.printf("\n Average Monthly Growth Rate: %.2f%%\n", avgGrowthRate * 100);
        System.out.printf("3 Forecasted Income for Next Month: ₹%.2f\n", forecast);

        sc.close();
    }
}

