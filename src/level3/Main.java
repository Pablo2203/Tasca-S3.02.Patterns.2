package level3;

import level3.paymentMethod.BankTransferPayment;
import level3.paymentMethod.CreditCard;
import level3.paymentMethodInterface.PaymentMethod;
import level3.store.ShoeStore;

public class Main {
    public static void main(String[] args) {
        ShoeStore store = new ShoeStore();

        PaymentMethod creditCard = new CreditCard("1234-5678-9876-5432");
        store.sellShoes(50.00, creditCard);

        System.out.println("---------------------------------------");


        PaymentMethod bankTransfer = new BankTransferPayment("11112222223333A");
        store.sellShoes(50.00, bankTransfer);
    }
}
