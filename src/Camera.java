public class Camera {
    private int pixel;
    private int weight;
    private String color;

    public enum Resolution {
        low, medium, high
    };

    public Camera(int pixel, int weight, String color) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
    }

    public int getPixel() {
        return pixel;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
