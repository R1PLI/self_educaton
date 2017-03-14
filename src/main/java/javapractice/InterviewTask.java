package javapractice;

import java.util.ArrayList;
import java.util.List;

public class InterviewTask {
    public static void main(String[] args) {
        runFibonacci(12);
        runIsPrime(3);
        runStringReverse("apollo");
    }

    //First
    private static int fibonacciNumber(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        return fibonacciNumber(number - 1) + fibonacciNumber(number - 2);
    }

    public static void runFibonacci(int max) {
        List<Integer> fibonacciList = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            fibonacciList.add(fibonacciNumber(i));
        }
        System.out.println("Fibonacci sequence is: " + fibonacciList);
    }

    //Second
    private static boolean isPrime(long n) {
        boolean prime = true;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        return (n % 2 != 0 && prime && n > 2) || n == 2;
    }

    public static void runIsPrime(int index) {
        if(isPrime(index)) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }

    //Third, part one
    private static String stringReverseStringBuilder(String string) {
        StringBuilder sb = new StringBuilder(string);

        return sb.reverse().toString();
    }

    //Third, part two
    private static String stringReverseLoop(String input) {
        char[] in = input.toCharArray();
        int begin = 0;
        int end = in.length - 1;
        char temp;
        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

    public static void runStringReverse(String string) {
        System.out.println(stringReverseStringBuilder(string));
        System.out.println(stringReverseLoop(string));
    }
}
