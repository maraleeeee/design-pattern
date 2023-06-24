package structural.bridge;

public class MainBridge {
    public static void main(String[] args) {
        System.out.println("Bridge");


        Shape tri = new Triangle(new RedColor(), new DashStyle());
        tri.draw();

        Shape pent = new Pentagon(new GreenColor(), new SolidStyle());
        pent.draw();
    }
}
