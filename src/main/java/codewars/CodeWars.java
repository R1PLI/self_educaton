package codewars;

import java.util.stream.IntStream;

public class CodeWars {
    public static void HighAndLow() {
        IntStream.range(1,4)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        HighAndLow();
    }
}
