package at.tue.projects.camera;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Array;
import java.util.Date;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SDCardTest {
    private SDCard SDCard;
    Picture p1;
    Picture p2;

    @Before
    public void setUp() {
        p1 = new Picture("Daniel", new Date(), 100);
        p2 = new Picture("Ronny", new Date(), 200);
    }

    @Test
    public void testGetCapacity() {
        Assert.assertEquals(p1.getSize(), 100, 0.001);
        Assert.assertEquals(p2.getSize(), 200, 0.001);
    }

    public class Camera {
        private Camera Camera;
        Picture p1;
        Picture p2;

        @Before
    public void setUp() {
        p1 = new Picture("Daniel", new Date(), 100);
        p2 = new Picture("Ronny", new Date(), 200);
    }

    @Test
    public void testTakePicture() {
        Assert.assertEquals(p1.takePicture(), 2);
        
    }

}
