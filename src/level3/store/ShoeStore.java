package level3.store;
import level3.callback.PaymentCallback;
import level3.paymentGateway.PaymentGateway;
import level3.paymentMethodInterface.PaymentMethod;

public class ShoeStore implements PaymentCallback {
    private PaymentGateway paymentGateway;

    public ShoeStore() {
        this.paymentGateway = new PaymentGateway();
    }

    public void sellShoes (double price, PaymentMethod paymentMethod) {
        System.out.println("Welcome to the Shoes Store! Processing your purchase...");
        paymentGateway.processPayment(paymentMethod, price, this);
    }
    @Override
    public void onPaymentResult(boolean success, String message) {
        System.out.println("ShoesStore: " + message); // Recibe el resultado.
        if (success) {
            System.out.println("Enjoy your new shoes!");
        } else {
            System.out.println("We couldn't process your payment. Please try again.");
        }
    }





}
