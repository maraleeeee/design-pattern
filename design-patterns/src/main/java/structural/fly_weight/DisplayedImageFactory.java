package structural.fly_weight;

import java.util.HashMap;

public class DisplayedImageFactory {
    private DisplayedImageFactory(){}

    static HashMap<String, Image> repo = new HashMap<>();

    public static DisplayedImage makeImage(String url, int top, int left) {
        Image image = repo.get(url);
        if(image == null){
            image = downloadImage(url);
            repo.put(url, image);
        }
        return new DisplayedImage(image, top, left);
    }

    private static Image downloadImage(String url) {
        return new Image(url);
    }
}
