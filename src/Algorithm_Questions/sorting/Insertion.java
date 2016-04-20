package Algorithm_Questions.sorting;

//Insertion sort
public class Insertion {
    static int[] sortInsertion(int[] array) {
        int last = array.length;
        for (int i = 1; i < last; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    Sorting.swap(array, j, j - 1);
                }
            }
        }
        return array;
    }
}