package structural.adapter;

public class MainAdapter {
    public static void main(String[] args) {
        System.out.println("Adapter");
        PayAdapter adapter = new CityPalAdapter();
        adapter.pay(1000);

        adapter = new PayPalAdapter();
        adapter.pay(2.5);
    }
}
