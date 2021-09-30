package modernJava.code.ch09;

import modernJava.code.ch05.Dish;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamMain {
    public static void main(String[] args) {
        List<Dish> menu = Dish.menu;
        List<String> dishNames = new ArrayList<>();
        for (Dish dish: menu) {
            if (dish.getCalories() > 300) {
                dishNames.add(dish.getName());
            }
        }

        menu.parallelStream()
                .filter(d -> d.getCalories() > 300)
                .map(Dish::getName)
                .collect(toList());
    }
}
