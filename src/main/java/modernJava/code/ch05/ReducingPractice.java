package modernJava.code.ch05;

import java.util.Arrays;
import java.util.List;

public class ReducingPractice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 5, 4, 9);

        System.out.println(numbers.stream().reduce(0, Integer::sum));
        System.out.println(numbers.stream().reduce(Integer::sum).get()); // Optional 반환

        // map-reduce
        List<Dish> menu = Dish.menu;
        int count = menu.stream()
                .map(a -> 1)
                .reduce(0, Integer::sum); // 5

        System.out.println(count);
    }
}
