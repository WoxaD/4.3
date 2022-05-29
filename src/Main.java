public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double presentValue = 1_000_000;
        double interest = 9.99;
        int periods1 = 12;
        int periods2 = 24;
        int periods3 = 36;
        System.out.println(service.calculate(presentValue, interest, periods1));
        System.out.println(service.calculate(presentValue, interest, periods2));
        System.out.println(service.calculate(presentValue, interest, periods3));
    }
}
