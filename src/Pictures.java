import java.util.ArrayList;
import java.util.List;

public class Pictures {

    private String Name;
    private String Date;
    private int Size;
    private List<Pictures> Pic;

    public Pictures(String Name, String Datum, int Größe, List Pic) {
        this.Name = Name;
        this.Date = Date;
        this.Size = Size;
        this.Pic = new ArrayList<>();
    }

    public String getDate() {
        return Date;
    }

    public int getSize() {
        return Size;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void makePicture(Pictures Pictures) {
        this.Pic.add(Pictures);
    }

    public List<Pictures> getPic() {
        return Pic;
    }
}