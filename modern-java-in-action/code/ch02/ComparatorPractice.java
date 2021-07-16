package ch02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static ch02.Color.GREEN;
import static ch02.Color.RED;

// Comparator 로 정렬하기
public class ComparatorPractice {
    public static void main(String[] args) {

        List<Apple> inventory = Arrays.asList(new Apple(80, GREEN),
                                              new Apple(155, GREEN),
                                              new Apple(120, RED));
        System.out.println("Before Sort");
        inventory.forEach(System.out::println);

        //         inventory.sort(new Comparator<Apple>() {
        //            @Override
        //            public int compare(Apple a1, Apple a2) {
        //                return a1.getWeight().compareTo(a2.getWeight());
        //            }
        //         });

        // 람다 표현식
        //        inventory.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
        inventory.sort(Comparator.comparing(Apple::getWeight));

        System.out.println("\nAfter Sort");
        inventory.forEach(System.out::println);

    }
}

/*
Before Sort
Apple{weight=80, color=GREEN}
Apple{weight=155, color=GREEN}
Apple{weight=120, color=RED}

After Sort
Apple{weight=80, color=GREEN}
Apple{weight=120, color=RED}
Apple{weight=155, color=GREEN}
 */