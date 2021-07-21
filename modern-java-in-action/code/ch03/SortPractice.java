package ch03;

import ch02.Apple;
import static ch02.Color.GREEN;
import static ch02.Color.RED;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class SortPractice {
    public static void main(String[] args) {

        List<Apple> inventory = Arrays.asList(new Apple(80, GREEN),
                new Apple(155, GREEN),
                new Apple(120, RED));
        // 1단계
        inventory.sort(new AppleComparator());

        // 2단계 익명 클래스
        inventory.sort(new Comparator<Apple>() {
            public int compare(Apple a1, Apple a2) {
                return a1.getWeight().compareTo(a2.getWeight());
            }
        });

        // 3단계 람다표현식
        inventory.sort((Apple a1, Apple a2) ->
                a1.getWeight().compareTo(a2.getWeight())
        );

        inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));
        // Comparator<Apple> c = Comparator.comparing((Apple a) -> a.getWeight());

        // 4단계 메서드 참조
        inventory.sort(comparing(Apple::getWeight));

        inventory.forEach(System.out::println);

    }
}
