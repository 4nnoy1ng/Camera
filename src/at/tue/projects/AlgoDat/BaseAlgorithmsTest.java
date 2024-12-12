package at.tue.projects.AlgoDat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class BaseAlgorithmsTest {

    @Test
    void testRevert() {
        BaseAlgorithms algo = new BaseAlgorithms();
        int[] data = { 1, 1, 2, 3, 4, 7 };
        int[] expected = { 7, 4, 3, 2, 1, 1 };
        assertArrayEquals(expected, algo.revert(data));
        System.out.println(Arrays.toString(algo.revert(data)));
    }

}