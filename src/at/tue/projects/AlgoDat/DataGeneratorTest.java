package at.tue.projects.AlgoDat;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataGeneratorTest {
    @Test
    public void testGenerateDataArray() {
        int[] randomNumbers = DataGenerator.generateDataArray(5);
        System.out.println(Arrays.toString(randomNumbers));
        Assertions.assertEquals(randomNumbers.length, 5);

    }

    @Test
    void testGenerateDataMinMaxValuesInRange() {
        int size = 5;
        int min = 1;
        int max = 10;
        int[] result = DataGenerator.generateDataMinMax(size, min, max);
        for (int num : result) {
            assertTrue(num >= min && num <= max, "Value " + num + " is out of range");
        }
        System.out.println(Arrays.toString(result));
    }

}
