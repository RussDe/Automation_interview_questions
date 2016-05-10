package Mock;

public class SelectionSort {
    public static int[] sort(int[] array) {
        int length = array.length;
        int min;
        for (int i = 0; i < length; i++) {
            min = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                Sorting.swap(array, i, min);
            }
        }
        return array;
    }
}
