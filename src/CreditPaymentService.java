public class CreditPaymentService {
    public double calculate(long creditAmount, double percentageRate, int creditPeriod){
        double rate = percentageRate / creditPeriod / 100;
        double coefficient = rate * (Math.pow((1 + rate), creditPeriod)) / ((Math.pow((1 + rate), creditPeriod)) - 1);
        double monthPayment = coefficient * (creditAmount / 100);
        return monthPayment;
    }
}
