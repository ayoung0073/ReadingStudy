package modernJava.code.ch05;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;

@Getter
@ToString
@AllArgsConstructor
public class Dish {
    private String name;
    private boolean check;
    private int calories;

    public static final List<Dish> menu = Arrays.asList(
            new Dish("seasonal fruit", true, 120),
            new Dish("prawns", false, 300),
            new Dish("chicken", false, 400),
            new Dish("french fries", false, 530),
            new Dish("rice", true, 280)
    );

    public String getCaloricLevel() {
        if (this.getCalories() <= 400) return "DIET";
        else if (this.getCalories() <= 700) return "NORMAL";
        else return "FAT";
    }

}