package modernJava.code.ch05;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MappingQuiz {
    public static void main(String[] args) {

        // Quiz 1. 각 숫자의 제곱근으로 이루어진 리스트를 반환하라.
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numPowerList = numList.stream()
                .map(num -> num * num)
                .collect(toList());

        numPowerList.forEach(System.out::println);

        // Quiz 2. 2개의 숫자 리스트가 있을 때 모든 숫자 쌍의 리스트를 반환하라.
        List<Integer> number1 = Arrays.asList(1, 2, 3);
        List<Integer> number2 = Arrays.asList(3, 4);

        List<Integer[]> pairs1 = number1.stream()
                                        .flatMap(i -> number2.stream()
                                                              .map(j -> new Integer[]{i, j})
                                        )
                .collect(toList());

        pairs1.forEach(p -> System.out.println(p[0] + ", " + p[1]));

        // Quiz3.
        List<Integer[]> pairs2 = number1.stream()
                .flatMap(i -> number2.stream()
                                        .filter(j -> (i + j) % 3 == 0)
                                        .map(j -> new Integer[]{i, j})
                )
                .collect(toList());

        pairs2.forEach(p -> System.out.println(p[0] + ", " + p[1]));
        /*
            2, 4
            3, 3
         */
    }

}
