package Algorithm_Questions.sorting;

//Selection algorithm
public class Selection {
    static int[] sortSelection(int[] array) {
        //to count iterations
        int counter = 0;
        int minIndex;
        int last = array.length - 1;
        for (int i = 0; i < last; i++) {
            counter++;
            minIndex = i;
            for (int j = i + 1; j < last + 1; j++) {
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        System.out.println("\ntotal iterations = " + counter);
        return array;
    }
}