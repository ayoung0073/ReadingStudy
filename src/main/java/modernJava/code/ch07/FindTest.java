package modernJava.code.ch07;

import java.util.ArrayList;
import java.util.List;

public class FindTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println("sequential");
        list.forEach(System.out::println);

        System.out.println("parallel");
        list.parallelStream().forEach(System.out::println);

        System.out.println("findAny - sequential");
        System.out.println(list.stream()        // 6
                .filter(i -> i > 5)
                .findAny()
                .orElseThrow(RuntimeException::new));

        System.out.println("findAny - parallel");
        System.out.println(list.parallelStream() // 6 이상의 값
                .filter(i -> i > 5)
                .findAny()
                .orElseThrow(RuntimeException::new));

        System.out.println("findFirst - sequential");
        System.out.println(list.stream()        // 6
                .filter(i -> i > 5)
                .findFirst()
                .orElseThrow(RuntimeException::new));

        System.out.println("findFirst - parallel");
        System.out.println(list.parallelStream() // 6
                .filter(i -> i > 5)
                .findFirst()
                .orElseThrow(RuntimeException::new));

    }

}
