package at.tue.projects.AlgoDat;

import java.util.Arrays;
import java.util.Random;

public class DataGenerator {

    public static int[] generateDataArray(int size) {
        Random rand = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt();
        }
        return data;
    }

    public static int[] generateDataMinMax(int size, int min, int max) {
        int[] data = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt(max - min + 1) + min;
        }
        return data;
    }

    public static void printArray(int[] data) {
        System.out.println(Arrays.toString(data));
    }
}
