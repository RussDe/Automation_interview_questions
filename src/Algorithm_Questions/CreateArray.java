package Algorithm_Questions;

import java.util.Arrays;
import java.util.Random;

// creating a random int array
public class CreateArray {
    public static int[] array(int size) {
        int[] array = new int[size];
        int range = 50;
        Random rand = new Random();
        for (int i=0; i<array.length; i++) {
            array[i] = rand.nextInt(range);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}