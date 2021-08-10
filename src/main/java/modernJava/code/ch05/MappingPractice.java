package modernJava.code.ch05;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MappingPractice {
    public static void main(String[] args) {

        List<Dish> menu = Dish.menu;
        List<Integer> dishNameLengths = menu.stream()
                .map(Dish::getName)
                .map(String::length) // 각 요리명 길이
                .collect(toList());

        dishNameLengths.forEach(System.out::println);
        /*
            14
            6
            7
            12
            4
         */

        List<String> words = Arrays.asList("Modern", "Java", "In", "Action");
        List<Integer> wordLength = words.stream()
                .map(String::length)
                .collect(toList());

        wordLength.forEach(System.out::println);

    }
}