public class CreditPaymentService {
    public int calculate(double pvOfAnnuity, double iR, int numberOfPeriods) {
        double interestRate = iR / 100 / 12;
        return (int) (pvOfAnnuity * (interestRate / (1 - Math.pow(1 + interestRate, -numberOfPeriods))));
    }
}
