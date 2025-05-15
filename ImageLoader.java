public class ImageLoader {
    private static ImageLoader instance;
    private ImageLoader() {}
    public static ImageLoader getInstance() {
        if (instance == null) {
            instance = new ImageLoader();
        }
        return instance;
    }
    public String loadImage(String image) {
        return "Da tai hinh anh than cong";
    }
    public static void main(String[] args) {
        ImageLoader loader = ImageLoader.getInstance();
        System.out.println(loader.loadImage("image.png"));
    }
}