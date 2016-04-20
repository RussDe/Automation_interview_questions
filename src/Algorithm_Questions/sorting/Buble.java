package Algorithm_Questions.sorting;

//Buble sort
public class Buble {

    public static int[] sortBubble(int[] array) {
        int counter = 0;
        int last = array.length - 1;
        for (int i = 1; i < last; i++) {
            boolean flag = false;
            for (int j = 0; j < last + 1 - i; j++) {

                if (array[j] > array[j + 1]) {
                    Sorting.swap(array, j, j + 1);
                    counter++;
                    flag = true;
                }
            }
            //to avoid extra calculations
            if (!flag)
                break;
        }
        System.out.println("Total " + counter);
        return array;
    }
}