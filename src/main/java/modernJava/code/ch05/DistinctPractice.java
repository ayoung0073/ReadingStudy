package modernJava.code.ch05;

import java.util.Arrays;
import java.util.List;

public class DistinctPractice {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, 4, 2, 6, 2, 4, 5, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println); // 4 2 6

    }
}
