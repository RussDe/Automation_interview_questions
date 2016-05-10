package Mock;

public class Sorting {
    int[] array;

    Sorting() {
        array = new int[]{9, 2, 7, 4, 5, 6, 8, 1, 7, 3};
    }

    public void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println("\n");
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static void main(String[] args) {
        //Sorting sort = new Sorting();
        //sort.printArray(sort.array);
        //int[] newArray = BubbleSort.sort(sort.array);
        //int[] newArray = InsertionSort.sort(sort.array);
        //int[] newArray = SelectionSort.sort(sort.array);
        //int[] newArray = MergeSort.sort(sort.array);
        //sort.printArray(newArray);
        Node myNode1 = new Node(5);
        Node myNode2 = new Node(15);
        Node myNode3 = new Node(5);

        System.out.println();

    }
}
