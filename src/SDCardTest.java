import java.util.Date;
import org.junit.Test;

public class SDCardTest {
    @Test
    public void testGetCapacity() {

    }

    @Test
    public void testTakePicture() {
        Pictures p1 = new Pictures("Daniel", new Date(), 100);

        Assert.assertE(p1.getSize() > 0);
    }
}
