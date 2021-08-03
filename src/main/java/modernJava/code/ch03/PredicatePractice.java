package modernJava.code.ch03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePractice {
    public static void main(String[] args) {
        List<String> list = List.of("MOON", "", "AYOUNG");
        Predicate<String> nonEmptyStringPractice = (String s) -> !s.isEmpty();
        List<String> results = filter(list, nonEmptyStringPractice);
        results.forEach(System.out::println);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T t : list) {
            if (p.test(t)) {
                results.add(t);
            }
        }
        return results;
    }
}
