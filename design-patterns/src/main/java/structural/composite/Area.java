package structural.composite;

public class Area implements Zone{
    private String name;

    public Area(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("---------------");
        System.out.println("-----Area------");
        System.out.println("=" + getName());
        System.out.println("---------------");
    }
}
