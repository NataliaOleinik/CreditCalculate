public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long creditAmount = 1_000_000_00;
        double percentageRate = 9.99;
        int creditPeriod = 24;
        double monthPayment = service.calculate(creditAmount, percentageRate,creditPeriod);
        System.out.printf("Ежемесячный платеж %.0f", monthPayment);
    }
}
