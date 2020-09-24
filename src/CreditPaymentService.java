public class CreditPaymentService {
    public double calculate(long creditAmount, double percentageRate, int creditPeriod) {
        double rate = Math.pow(1 + (percentageRate / 100 / 12), creditPeriod);
        double coefficient = ((percentageRate / 100 / 12) * rate) / (rate - 1);
        double monthPayment = coefficient * (creditAmount / 100);
        return monthPayment;
    }
}