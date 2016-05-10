package Mock;

public class InsertionSort {
    public static int[] sort(int[] array) {
        int length = array.length - 1;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                   Sorting.swap(array, array[j-1], array[j]);
                }
            }
        }
        return array;
    }
}