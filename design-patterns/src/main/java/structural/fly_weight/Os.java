package structural.fly_weight;

public class Os {
    public OsType getType() {
        return type;
    }

    private OsType type;

    public Bit getBit() {
        return bit;
    }

    private Bit bit;

    public Os(OsType type, Bit bit) {
        this.type = type;
    }
}
