package structural.fly_weight;

public class Image {
    public String getUrl() {
        return url;
    }

    private String url;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private int width, height, size;
    private String content;

    public Image(String url) {
        this.url = url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
