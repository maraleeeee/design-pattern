package structural.fly_weight;

public class DisplayedImage {
    public DisplayedImage(Image image, int top, int left) {
        this.image = image;
        this.top = top;
        this.left = left;
    }

    private Image image;
    private int top;
    private int left;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }
}
