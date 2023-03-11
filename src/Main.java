public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPayment1 = (int) (service.calculate(1_000_000, 12, 9.99));
        int monthlyPayment2 = (int) (service.calculate(1_000_000, 24, 9.99));
        int monthlyPayment3 = (int) (service.calculate(1_000_000, 36, 9.99));

        System.out.println("Ежемесячный платеж: " + monthlyPayment1 + " руб.");
        System.out.println("Ежемесячный платеж: " + monthlyPayment2 + " руб.");
        System.out.println("Ежемесячный платеж: " + monthlyPayment3 + " руб.");
    }
}