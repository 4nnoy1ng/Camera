public class Pictures {

    private String name;
    private String date;
    private int size;

    public Pictures(String name, String date, int size) {
        this.name = name;
        this.date = date;
        this.size = size;

    }

    public String getDate() {
        return date;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}