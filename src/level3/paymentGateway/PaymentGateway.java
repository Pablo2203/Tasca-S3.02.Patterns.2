package level3.paymentGateway;

import level3.callback.PaymentCallback;
import level3.paymentMethodInterface.PaymentMethod;

public class PaymentGateway {
    public void processPayment(PaymentMethod paymentMethod, double amount, PaymentCallback callback) {
        System.out.println("PaymentGateway: Attempting to process payment...");

        boolean success = paymentMethod.processPayment(amount);

        if (success) {
            callback.onPaymentResult(true, "Payment successful!");
        } else {
            callback.onPaymentResult(false, "Payment failed. Please try again.");
        }
    }
}
