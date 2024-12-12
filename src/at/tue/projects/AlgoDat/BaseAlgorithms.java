package at.tue.projects.AlgoDat;

public class BaseAlgorithms {
    public int[] revert(int[] data) {
        int[] reversed = new int[data.length];
        int j = 0;
        for (int i = data.length - 1; i >= 0; i--) {
            reversed[j++] = data[i];
        }
        return reversed;
    }
}
