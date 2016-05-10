package Mock;

public class BubbleSort {
    public static int[] sort(int[] array) {
        int length = array.length - 1;
        int count = 0;
        boolean flag=true;
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < length + 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    count++;
                    flag = false;
                }
            }
            if(flag)
                break;
        }
        System.out.println("Total iterations: " + count);
        return array;
    }
}
