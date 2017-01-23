package interview.hackerrank.cracking_the_code_interview.data_structure;

import java.util.Scanner;
import java.util.Stack;

/**
 * A queue is an abstract data type that maintains the order in which elements were added to it, allowing the oldest elements to be removed from the front and new elements to be added to the rear. This is called a First-In-First-Out (FIFO) data structure because the first element added to the queue (i.e., the one that has been waiting the longest) is always the first one to be removed.
 * <p>
 * A basic queue has the following operations:
 * <p>
 * Enqueue: add a new element to the end of the queue.
 * Dequeue: remove the element from the front of the queue and return it.
 * In this challenge, you must first implement a queue using two stacks. Then process  queries, where each query is one of the following  types:
 * <p>
 * 1 x: Enqueue element  into the end of the queue.
 * 2: Dequeue the element at the front of the queue.
 * 3: Print the element at the front of the queue.
 * Input Format
 * <p>
 * The first line contains a single integer, , denoting the number of queries.
 * Each line  of the  subsequent lines contains a single query in the form described in the problem statement above. All three queries start with an integer denoting the query , but only query  is followed by an additional space-separated value, , denoting the value to be enqueued.
 * <p>
 * Constraints
 * <p>
 * <p>
 * <p>
 * <p>
 * It is guaranteed that a valid answer always exists for each query of type .
 * Output Format
 * <p>
 * For each query of type , print the value of the element at the front of the queue on a new line.
 * <p>
 * Sample Input
 * <p>
 * 10
 * 1 42
 * 2
 * 1 14
 * 3
 * 1 28
 * 3
 * 1 60
 * 1 78
 * 2
 * 2
 * Sample Output
 * <p>
 * 14
 * 14
 * Explanation
 * <p>
 * We perform the following sequence of actions:
 * <p>
 * Enqueue ; .
 * Dequeue the value at the head of the queue, ; .
 * Enqueue ; .
 * Print the value at the head of the queue, ; .
 * Enqueue ; .
 * Print the value at the head of the queue, ; .
 * Enqueue ; .
 * Enqueue ; .
 * Dequeue the value at the head of the queue, ; .
 * Dequeue the value at the head of the queue, ; .
 */
public class ATaleOfTwoStacks {
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);
            int counter = 0;
            while (!stackOldestOnTop.isEmpty()) {
                stackNewestOnTop.push(stackOldestOnTop.pop());
                counter++;
            }
            stackOldestOnTop.push(value);
            for (int i = 1; i <= counter; i++) {
                stackOldestOnTop.push(stackNewestOnTop.pop());
            }
        }

        public T peek() {
            return stackOldestOnTop.peek();
        }

        public T dequeue() {
            return stackOldestOnTop.pop();
        }
    }


    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2 && !queue.stackOldestOnTop.isEmpty()) { // dequeue
                queue.dequeue();
            } else if (operation == 3 && !queue.stackOldestOnTop.isEmpty()) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}