package modernJava.code.ch05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FlatMapPractice {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "World");

        List<String> uniqueCharacters = words.stream()  // Stream<String>
                .map(word -> word.split(""))     // 각 단어를 개별 문자를 포함하는 배열로 변환 (Stream<String[]>)
                .flatMap(Arrays::stream)               // 생성된 스트림을 하나의 스트림으로 평면화 (Stream<String>)
                .distinct()
                .collect(toList());                    // List<String>

        uniqueCharacters.forEach(System.out::println);
        /*
            H
            e
            l
            o
            W
            r
            d
         */

        // map, distinct
        List<String[]> example1 = words.stream()    // Stream<String>
                .map(word -> word.split("")) // Stream<String[]>
                .distinct()
                .collect(toList());

        example1.forEach(word -> Arrays.stream(word).forEach(System.out::println));
        /*
            H
            e
            l
            l
            o
            W
            o
            r
            l
            d
         */

        // 배열 스트림 대신 문자열 스트림
        // map, Arrays.stream 활용
        List<Stream<String>> example2 = words.stream()
                .map(word -> word.split(""))      // Stream<String>
                .map(Arrays::stream)                    // 각 배열을 별도의 스트림으로 생성 (Stream<Stream<String>>)
                .distinct()
                .collect(toList());

        example2.forEach(words2 -> words2.forEach(System.out::println));
        /*
            H
            e
            l
            l
            o
            W
            o
            r
            l
            d
         */
    }
}
