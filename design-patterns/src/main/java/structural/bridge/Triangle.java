package structural.bridge;

public class Triangle extends Shape {
    public Triangle(Color c, Style s) {
        super(c, s);
    }

    @Override
    public void draw() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
        style.applyStyle();
        System.out.println();
    }
}