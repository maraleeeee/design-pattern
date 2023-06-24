package structural.adapter;

public class CityPalAdapter implements PayAdapter {
    CityPal cityPal=new CityPal();
    @Override
    public void pay(double amount) {
         cityPal.doPay((long) amount);
    }
}
