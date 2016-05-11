package Mock_test;

import java.util.Arrays;

public class Mock_test {

    public static void main(String[] args) {
        //initial array
        int[] array = {4, 2, 7, 8, 8, 2, 3, 1, 9, 0, 5};
        System.out.println(Arrays.toString(array) + " -> Initial Array");
        //quick sorted array
        //System.out.println(Arrays.toString(QuickSort.quickSort(array)));
        Node node = new Node();
        for (int i = 0; i < array.length; i++) {
            node.addToTail(array[i]);
        }
        System.out.println(node.toString() + " -> LinkedList Array");
        //deleting a head
        node.deleteHead();
        System.out.println(node.toString());
        //deleting a tail
        node.deleteTail();
        System.out.println(node.toString());
        //adding a node
        node.addNode(3, 4);
        System.out.println(node.toString());
        //deleting a node
        node.deleteNode(2);
        System.out.println(node.toString());

    }
}
