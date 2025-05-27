package level3.paymentMethod;

import level3.paymentMethodInterface.PaymentMethod;

public class Paypal implements PaymentMethod {
    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing payment with Paypal");
        return true;
    }
}
