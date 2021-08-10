package modernJava.code.ch05;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SlicingPractice {

    public static void main(String[] args) {

        List<Dish> specialMenu = Dish.menu;

        System.out.println("filter");
        List<Dish> filterMenu
                = specialMenu.stream()
                .filter(dish -> dish.getCalories() < 320)
                .collect(toList());
        filterMenu.forEach(System.out::println);
        /*
            Dish(name=seasonal fruit, check=true, calories=120)
            Dish(name=prawns, check=false, calories=300)
            Dish(name=rice, check=true, calories=280)
         */

        System.out.println("takeWhile");
        List<Dish> slicedMenu1
                = specialMenu.stream()
                .takeWhile(dish -> dish.getCalories() < 320)
                .collect(toList());
        slicedMenu1.forEach(System.out::println);
        /*
            Dish(name=seasonal fruit, check=true, calories=120)
            Dish(name=prawns, check=false, calories=300)
         */

        System.out.println("dropWhile");
        List<Dish> slicedMenu2
                = specialMenu.stream()
                .dropWhile(dish -> dish.getCalories() < 320)
                .collect(toList());
        slicedMenu2.forEach(System.out::println);
        /*

            Dish(name=chicken, check=false, calories=400)
            Dish(name=french fries, check=false, calories=530)
            Dish(name=rice, check=true, calories=280)
         */
    }
}
