import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Pictures p1 = new Pictures("Daniel", new Date(), 100);
        Pictures p2 = new Pictures("Ronny", new Date(), 100);
        Pictures p3 = new Pictures("Tim", new Date(), 100);

        System.out.println(p1.getDate());
    }
}
