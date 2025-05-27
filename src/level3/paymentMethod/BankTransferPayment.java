package level3.paymentMethod;

import level3.paymentMethodInterface.PaymentMethod;

public class BankTransferPayment implements PaymentMethod {
    private String accountNumber;

    public BankTransferPayment(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing payment with Bank Account Debit");
        return false;
    }
}
