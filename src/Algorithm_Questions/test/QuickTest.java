package Algorithm_Questions.test;

import Algorithm_Questions.sorting.Quick;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class QuickTest {
    int[] array;

    @Before
    // setup an array
    public void setup() throws Exception {
        Random rand = new Random();
        int size = rand.nextInt(20) + 1;
        array = new int[size];
        for (int i = 0; i < size - 1; i++) {
            array[i] = rand.nextInt(50);
        }
        System.out.println(Arrays.toString(array));
    }

    // print out array
    @After
    public void printArrayAfter() {
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void testArrayIsSorted() throws Exception {
        int[] sortedArray = array;
        Arrays.sort(sortedArray);
        Assert.assertArrayEquals("Expected equals", sortedArray, Quick.sortQuick(array));
    }
}