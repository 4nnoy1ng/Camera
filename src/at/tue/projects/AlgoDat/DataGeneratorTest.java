package at.tue.projects.AlgoDat;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataGeneratorTest {
    @Test
    void testGenerateDataArray() {
        int[] randomNumbers = DataGenerator.generateDataArray(5);
        System.out.println(Arrays.toString(randomNumbers));
        Assertions.assertEquals(randomNumbers.length, 5);
    }
}
