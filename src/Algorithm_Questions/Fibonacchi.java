package Algorithm_Questions;

public class Fibonacchi {
    // using recursion
    int fibRec(int number) {
        if (number == 1 || number == 0)
            return number;
        else
            return fibRec(number - 1) + fibRec(number - 2);
    }

    // using dynamic programming
    int fibDyn(int number) {
        int[] array = new int[number + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= number; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[number];
    }

    public static void main(String[] args) throws Exception {
        // Fibonacci with recursion
        Fibonacchi fib = new Fibonacchi();
        int fbR = fib.fibRec(7);
        int fbD = fib.fibDyn(7);
        System.out.println("Fibonacci with recursion = " + fbR);
        System.out.println("Fibonacci with dynamic programming = " + fbD);
    }
}