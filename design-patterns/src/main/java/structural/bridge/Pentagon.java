package structural.bridge;

public class Pentagon extends Shape {
    public Pentagon(Color c, Style s) {
        super(c, s);
    }

    @Override
    public void draw() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();
        style.applyStyle();
        System.out.println();
    }
}