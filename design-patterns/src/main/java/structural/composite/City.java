package structural.composite;

public class City implements Zone {
    private String name;

    public City(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("---------------");
        System.out.println("-----City------");
        System.out.println("=" + getName());
        System.out.println("---------------");
    }
}
