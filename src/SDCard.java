import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<Pictures> Pics;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.Pics = new ArrayList<>();
    }

    public List<Pictures> getPics() {
        return Pics;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void takePicture(Pictures Pictures) {
        this.Pics.add(Pictures);
    }

    public void getSpace() {

    }
}
