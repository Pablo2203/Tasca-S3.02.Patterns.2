package level3.paymentMethod;

import level3.paymentMethodInterface.PaymentMethod;

public class CreditCard implements PaymentMethod {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean processPayment(double amount) {

        System.out.println("Processing payment with Credit Card: " + cardNumber);

        return true;
    }
}
