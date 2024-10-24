public class Pictures {

    private String Name;
    private String Datum;
    private int Größe;

    public Pictures(String Name, String Datum, int Größe) {
        this.Name = Name;
        this.Datum = Datum;
        this.Größe = Größe;
    }

    public String getDatum() {
        return Datum;
    }

    public int getGröße() {
        return Größe;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}