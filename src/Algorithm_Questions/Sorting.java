package Algorithm_Questions;

//all sorting algorithms
public class Sorting {
    public static void main(String[] args) {
        //creating simple array
        int[] array = {13, 3, 9, 6, 12, 7, 2, 0, 18, 4, 6, 5};
        //int[] array = {1,2,3,4,5};
        printArray(array);

    /*
        // 1.Selection
        printArray(Selection.sortSelection(array));

        //2. Buble
        printArray(Buble.sortBuble(array));


        //3. Insertion
        printArray(Insertion.sortInsertion(array));

        //4. Merge
        printArray(Merge.sortMerge(array));
    */

        //5. Quick sort
        printArray(Quick.sortQuick(array));

    }

    //print out array's items
    static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println("\n");
    }

    static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
