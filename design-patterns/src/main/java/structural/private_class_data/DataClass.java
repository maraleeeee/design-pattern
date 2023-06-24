package structural.private_class_data;

public class DataClass {
    public DataClass(int attrib1, String attrib2) {
        this.attrib1 = attrib1;
        this.attrib2 = new InnerDataClass(attrib2);
    }

    public int getAttrib1() {
        return attrib1;
    }

    private final int attrib1;

    public InnerDataClass getAttrib2() {
        return attrib2;
    }

    private final InnerDataClass attrib2;
}
