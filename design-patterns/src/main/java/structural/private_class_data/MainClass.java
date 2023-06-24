package structural.private_class_data;

public class MainClass {

    public DataClass getData() {
        return data;
    }

    private final DataClass data;

    public MainClass(int att1, String att2) {
        data = new DataClass(att1, att2);
    }

    public void doIt() {
        System.out.println(data.getAttrib1() + data.getAttrib2().getAttrib());
    }
}
