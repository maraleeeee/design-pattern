package structural.private_class_data;

public class InnerDataClass {
    public InnerDataClass(String attrib) {
        this.attrib = attrib;
    }

    public String getAttrib() {
        return attrib;
    }

    private final String attrib;

}
