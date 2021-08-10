package modernJava.code.ch05;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class MakingStreamPractice {
    public static void main(String[] args) {

        System.out.println("값으로 스트림 만들기");
        Stream<String> stream = Stream.of("Modern", "Java", "In", "Action");
        // stream.map(String::toUpperCase).forEach(System.out::println);
        stream.map(String::toUpperCase).forEach(System.out::println);

        Stream<String> emptyStream = Stream.empty(); // empty 메서드를 이용해 스트림을 비울 수 있다.
        emptyStream.forEach(System.out::println);

        System.out.println();

        System.out.println("null 이 될 수 있는 객체로 스트림 만들기");
        Stream<String> homeValueStream1 = Stream.ofNullable(System.getProperty("home"));
        Stream<String> homeValueStream2 = Stream.of(System.getProperty("home"));
        System.out.println(homeValueStream1.count()); // 0
        System.out.println(homeValueStream2.count()); // 1
        // null 이 될 수 있는 객체를 포함하는 스트림값을 flatMap 과 함께 사용하는 상황에서는 이 패턴을 더 유용하게 사용할 수 있다.
        Stream<String> values =
                Stream.of("config", "home", "user")
                        .flatMap(key -> Stream.ofNullable(System.getProperty(key)));
        System.out.println(values.count()); // o

        // null 테스트
        Stream<String> nullStream = Stream.ofNullable(null);
        // Stream<String> nullStream = Stream.of(null); // NPE
        System.out.println(nullStream.count()); // 0
        System.out.println();

        System.out.println("배열로 스트림 만들기");
        int[] numbers = {2, 3, 5, 7, 11, 13};
        int sum = Arrays.stream(numbers).sum(); // 41
        System.out.println(sum);
    }
}
