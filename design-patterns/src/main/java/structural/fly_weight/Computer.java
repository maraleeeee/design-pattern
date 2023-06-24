package structural.fly_weight;

public class Computer {
    private Os os;

    public Os getOs() {
        return os;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    private int ram;

    public int getRam() {
        return ram;
    }

    public Computer(Os os) {
        this.os = os;
    }

    public Computer(Os os, int ram) {
        this.os = os;
        this.ram = ram;
    }
}
