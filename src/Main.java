import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the number of deposits: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();
        ArrayList <Deposit> deposits = new ArrayList <Deposit>();


        for (int i = 0; i < numberOfLines; i++) {
            System.out.println("Please provide the data for a deposit:");
            double principle = scanner.nextDouble();
            double interest = scanner.nextDouble();
            double durationInYears = scanner.nextDouble();
            Deposit deposit = new Deposit(principle, interest, durationInYears);
            deposits.add(deposit);
        }
        ProfitCalculator profitCalculator = new ProfitCalculator();

        for (int i = 0; i < deposits.size(); i++) {
            System.out.println("Your profit is ");
            Deposit deposit= deposits.get(i);
            //profitCalculator.calculationOfProfit(deposit);
            System.out.println(profitCalculator.calculationOfProfit(deposit));
        }

        double maxProfit = 0;
        int maxIndex= -1;
        for (int i = 0; i < deposits.size(); i++) {
            if (deposits.get(i).profit > maxProfit){
                maxProfit = deposits.get(i).profit;
                maxIndex=i;
            }
        }
        System.out.println("The highest profit is: ");
        System.out.println(maxProfit);
        Deposit maxDeposit =deposits.get(maxIndex);
        System.out.println(maxDeposit);
    }
}
