package structural.bridge;

public abstract class Shape {

    //Composition - implementor
    protected Color color;
    protected Style style;

    //constructor with implementor as input argument
    public Shape(Color c, Style s) {
        this.color = c;
        this.style = s;
    }

    abstract public void draw();
}