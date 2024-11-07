package at.tue.projects.camera;

import java.util.Date;

public class Picture {

    private String name;
    private Date date;
    private int size;

    public Picture(String name, Date date, int size) {
        this.name = name;
        this.date = date;
        this.size = size;

    }

    public Date getDate() {
        return date;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}