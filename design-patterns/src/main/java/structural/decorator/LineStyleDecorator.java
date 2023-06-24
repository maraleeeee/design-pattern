package structural.decorator;

public class LineStyleDecorator extends ShapeDecorator {
    protected LineStyle style;

    public LineStyleDecorator(Shape decoratedShape, LineStyle style) {
        super(decoratedShape);
        this.style = style;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Line Style: " + style);
    }

    @Override
    public String description() {
        return decoratedShape.description() + " drawn with " + style + " lines.";
    }
}
