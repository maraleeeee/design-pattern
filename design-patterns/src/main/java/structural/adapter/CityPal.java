package structural.adapter;

public class CityPal {
    public boolean doPay(long value) {
        if (value < 1000)
            return false;

        System.out.println("Pay " + value + " Rials with CityPal.");
        return true;
    }
}
