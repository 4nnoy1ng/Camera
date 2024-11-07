import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class SDCardTest {
    @Test
    public void testGetCapacity() {
        Pictures p1 = new Pictures("Daniel", new Date(), 100);

        Assert.assertEquals(p1.getSize(), 100, 0.001);
    }

    @Test
    public void testTakePicture() {

    }
}
