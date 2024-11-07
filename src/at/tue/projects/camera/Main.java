package at.tue.projects.camera;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Picture p1 = new Picture("Daniel", new Date(), 100);
        Picture p2 = new Picture("Ronny", new Date(), 100);
        Picture p3 = new Picture("Tim", new Date(), 100);
        SDCard sdc1 = new SDCard(1000);

        System.out.println(p1.getDate());
        System.out.println();
    }
}
