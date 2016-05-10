package Mock;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static int[] sort(int[] array) {
        if (array.length > 1) {
            int[] leftArray = divideLeft(array);
            int[] rightArray = divideRight(array);

            sort(leftArray);
            sort(rightArray);

            mergeSort(array, leftArray, rightArray);

        }
        return array;
    }

    //for left array
    static int[] divideLeft(int[] array) {
        int size = array.length / 2;
        int[] leftArray = new int[size];
        leftArray = Arrays.copyOfRange(array, 0, size);
        return leftArray;
    }

    //for right array
    static int[] divideRight(int[] array) {
        int size = array.length - array.length / 2;
        int[] rightArray = new int[size];
        rightArray = Arrays.copyOfRange(array, array.length / 2, array.length);
        return rightArray;
    }

    //merge&sort arrays
    static int[] mergeSort(int[] array, int[] leftArray, int[] rightArray) {
        int length = array.length;
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int leftCounter = 0;
        int rightCounter = 0;

        for (int i = 0; i < length; i++) {
            if ((rightCounter >= rightSize) || ((leftCounter < leftSize) && leftArray[leftCounter] <= rightArray[rightCounter])) {
                array[i] = leftArray[leftCounter];
                leftCounter++;
            } else {
                array[i] = rightArray[rightCounter];
                rightCounter++;
            }

        }
        return array;
    }
}