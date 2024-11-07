package at.tue.projects.camera;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<Picture> pictures = new ArrayList<>();

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.pictures = new ArrayList<>();
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void savePicture(Picture Pictures) {
        this.pictures.add(Pictures);
    }

    public void getSpace() {

    }
}
