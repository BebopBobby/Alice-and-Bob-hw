package bank;

public class Loan {
    public double lumpSum;
    public int termYears;
    public int interestRate;

    public Loan(double lumpSum, int termYears, int interestRate){
        this.lumpSum = lumpSum;
        this.termYears = termYears;
        this.interestRate = interestRate;
    }

    public double annualPayment(){
        return lumpSum / termYears;
    }
}
