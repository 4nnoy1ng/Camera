package at.tue.projects.camera;

public class Manufacturer {
    private String country;
    private String name;

    public Manufacturer(String country, String name) {
        this.country = country;
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }
}
