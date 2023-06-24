package structural.adapter;

public class PayPalAdapter implements PayAdapter {
    private PayPal2 payPal = new PayPal2();

    @Override
    public void pay(double amount) {
        payPal.sendPay2(amount);
    }
}
