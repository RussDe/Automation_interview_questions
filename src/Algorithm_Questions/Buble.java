package Algorithm_Questions;

// buble class
public class Buble {

    public static int[] sortBuble(int[] array) {
        int counter = 0;
        int last = array.length - 1;
        for (int i = 1; i < last; i++) {
            boolean flag = false;
            for (int j = 0; j < last + 1 - i; j++) {

                if (array[j] > array[j + 1]) {
                    Sorting.swap(array, j, j + 1);
                    flag = true;
                }
            }
            //to avoid extra calculations
            if (!flag)
                break;
        }
        return array;
    }
}
