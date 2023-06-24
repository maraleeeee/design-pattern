package structural.decorator;

public class FillColorDecorator extends ShapeDecorator {
    protected Color color;

    public FillColorDecorator(Shape decoratedShape, Color color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Fill Color: " + color);
    }

    @Override
    public String description() {
        return decoratedShape.description() + " filled with " + color + " color.";
    }
}
