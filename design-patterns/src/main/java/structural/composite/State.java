package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class State implements Zone {
    private String name;

    private List<Zone> zones = new ArrayList<>();

    public State(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void add(Zone zone) {
        zones.add(zone);
    }

    public void remove(Zone zone) {
        zones.remove(zone);
    }

    public Zone getChild(int i) {
        return zones.get(i);
    }

    public List<Zone> getChildren() {
        return zones;
    }

    public void print() {
        System.out.println("---------------");
        System.out.println("-----State-----");
        System.out.println("=" + getName());
        System.out.println("---------------");

        for (Zone zone : zones) {
            zone.print();
        }
    }
}
