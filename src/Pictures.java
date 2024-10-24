public class Pictures {

    private String Name;
    private String Date;
    private int Size;

    public Pictures(String Name, String Date, int Size) {
        this.Name = Name;
        this.Date = Date;
        this.Size = Size;

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
}