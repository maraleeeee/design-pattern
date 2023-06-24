package structural.decorator;

public class LineThicknessDecorator extends ShapeDecorator {
    protected double thickness;

    public LineThicknessDecorator(Shape decoratedShape, double thickness) {
        super(decoratedShape);
        this.thickness = thickness;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Line thickness: " + thickness);
    }

    @Override
    public String description() {
        return decoratedShape.description() + " drawn with line thickness " + thickness + ".";
    }
}
