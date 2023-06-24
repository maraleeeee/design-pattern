package structural.decorator;

public class MainDecorator {
    public static void main(String[] args) {
        System.out.println("Decorator");
        Shape circle1 = new FillColorDecorator(
                new LineColorDecorator(
                        new LineStyleDecorator(
                                new LineThicknessDecorator(
                                        new Circle(), 2.0d), LineStyle.DASH), Color.BLUE), Color.RED);
        circle1.draw();

        Shape rectangle1 = new FillColorDecorator(new LineColorDecorator(new Rectangle(), Color.RED), Color.YELLOW);
        rectangle1.draw();
    }
}
