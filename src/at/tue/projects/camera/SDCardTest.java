package at.tue.projects.camera;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SDCardTest {
    private SDCard SDCard;
    Picture p1;

    @Before
    public void setUp() {
        p1 = new Picture("Daniel", new Date(), 100);
    }

    @Test
    public void testGetCapacity() {
        Assert.assertEquals(p1.getSize(), 100, 0.001);
    }

    @Test
    public void testTakePicture() {

    }
}
