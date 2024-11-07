package at.tue.projects.camera;

import java.util.ArrayList;
import java.util.List;

public class Camera {
    private int pixel;
    private int weight;
    private String color;
    private List<Picture> pictures = new ArrayList<>();

    public enum Resolution {
        low, medium, high
    };

    public Camera(int pixel, int weight, String color) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.pictures = new ArrayList<>();
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

    public void getSpace() {

    }

    public void takePicture(Picture Pictures) {
        this.pictures.add(Pictures);
    }
}
