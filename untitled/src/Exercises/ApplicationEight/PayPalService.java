package Exercises.ApplicationEight;

public class PayPalService implements OnlinePaymentService {
    @Override
    public double paymentFee(Double amount) {
        //Tax 2%
        return amount * 0.02;
    }

    @Override
    public double interest(Double amount, int months) {
        return amount * months * 0.01;
    }
}
