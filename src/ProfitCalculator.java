public class ProfitCalculator {
    public double calculationOfProfit(Deposit deposit) {
        double result;
        result = deposit.durationInYears * deposit.principle * deposit.interest;
        deposit.setProfit(result);
        return result;
    }
}

