package modernJava.code.ch04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class OneConsumePractice {
    public static void main(String[] args) {
        List<String> title = Arrays.asList("Modern", "Java8", "In", "Action");
        Stream<String> s = title.stream();
        s.forEach(System.out::println);
        // s.forEach(System.out::println); // Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
    }
}
