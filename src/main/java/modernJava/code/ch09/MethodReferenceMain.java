package modernJava.code.ch09;

import modernJava.code.ch05.Dish;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MethodReferenceMain {
    List<Dish> menu =  Dish.menu;
//    Map<String, List<Dish>> dishesByCaloricLevel =
//            menu.stream()
//            .collect(
//                    Collectors.groupingBy(dish -> {
//                        if (dish.getCalories() <= 400) return "DIET";
//                        else if (dish.getCalories() <= 700) return "NORMAL";
//                        else return "FAT";
//                    })
//            )
    Map<String, List<Dish>> dishesByCaloricLevel =
            menu.stream().collect(Collectors.groupingBy(Dish::getCaloricLevel));


}
