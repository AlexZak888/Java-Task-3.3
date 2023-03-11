public class CreditPaymentService {

    public double calculate(int amountOfCredit, int creditTerm, double interestRate) {

        double monthlyInterest = (interestRate / 12) / 100;
        double annuityRatio = monthlyInterest + (monthlyInterest / (Math.pow((1 + monthlyInterest), creditTerm) - 1));
        double Payment = annuityRatio * amountOfCredit;
        return Payment;
    }
}
