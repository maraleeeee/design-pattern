package structural.decorator;

public class LineColorDecorator extends ShapeDecorator {
    protected Color color;

    public LineColorDecorator(Shape decoratedShape, Color color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Line Color: " + color);
    }

    @Override
    public String description() {
        return decoratedShape.description() + " drawn with " + color + " color.";
    }
}
