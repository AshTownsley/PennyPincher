import java.util.Scanner;

public class budget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //initialize variables
        double totalIncome = 0;
        double totalExpense = 0;
        double totalSavings = 0;
        double netBalance = 0;

        //Store user input
        double[] incomeSources;
        double[] expenseCategories;

        //Get input for income sources
        System.out.print("Enter the number of income sources: ");
        int incomeSourcesCount = scanner.nextInt();
        incomeSources = new double[incomeSourcesCount];

        //loop to input incomes
        for (int i = 0; i < incomeSourcesCount; i++) {
            System.out.print("Enter income source " + (i + 1) + " amount: ");
            incomeSources[i] = scanner.nextDouble();
            totalIncome += incomeSources[i]; //add income to total
        }
        //print totalIncome
        System.out.print("Total Income: " + totalIncome);

        //get input for expense categories
        System.out.print("\nEnter the number of expense categories: ");
        int expenseCategoriesCount = scanner.nextInt();
        expenseCategories = new double[expenseCategoriesCount];

        //loop for expenses
        for (int i = 0; i < expenseCategoriesCount; i++) {
            System.out.print("Enter expense category: " + (i + 1) + " amount: ");
            expenseCategories[i] = scanner.nextDouble();
            totalExpense += expenseCategories[i];
        }
        System.out.print("Total Expense: " + totalExpense);

        System.out.print("\nEnter your total savings: ");
        totalSavings = scanner.nextDouble();
        System.out.print("Total Savings: " + totalSavings);

        //calculate net balance
        netBalance = totalIncome - totalExpense - totalSavings;

        //Display the totals summary
        System.out.println("\n--- Summary ---");
        System.out.println("Total income: $" + totalIncome);
        System.out.println("Total expense: $" + totalExpense);
        System.out.println("Total savings: $" + totalSavings);
        System.out.println("Net balance: $" + netBalance);

        //check for negative balance
        if (netBalance < 0) {
            System.out.println("Net balance is negative, review your income and expenses!");
        } else {
            System.out.println("Net balance is positive, good work!");
        }
    }
}
