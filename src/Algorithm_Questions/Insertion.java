package Algorithm_Questions;

//Insertion
public class Insertion {
    static int[] sortInsertion(int[] array) {
        int last = array.length - 1;
        for (int i = 1; i < last + 1; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    Sorting.swap(array, j, j - 1);
                }
            }
        }
        return array;
    }
}
