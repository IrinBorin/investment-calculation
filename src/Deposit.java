public class Deposit {

    double principle;
    double interest;
    double durationInYears;
    double profit;

    public Deposit(double amountOfMoney, double interest, double durationInYears) {
        this.principle = amountOfMoney;
        this.interest = interest / 100;
        this.durationInYears = durationInYears;
    }

    // make a method that sets the profit
    public void setProfit(Double profit){
        this.profit = profit;
    }

    public double getProfit(){
        return profit;
    }

    public double getDurationInYears() {
        return durationInYears;
    }

    public double getInterest() {
        return interest;
    }

    public double getPrinciple() {
        return principle;
    }
}
