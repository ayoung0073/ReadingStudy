package modernJava.code.ch06;

import modernJava.code.ch05.Dish;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import static java.util.stream.Collector.Characteristics.CONCURRENT;
import static java.util.stream.Collector.Characteristics.IDENTITY_FINISH;
import static java.util.stream.Collectors.toList;

public class ToListCollector<T> implements Collector<T, List<T>, List<T>> {

    @Override
    public Supplier<List<T>> supplier() { // 빈 결과로 이루어진 Supplier 반환
        return ArrayList::new; // 수집 연산의 시발점
    }

    @Override
    public BiConsumer<List<T>, T> accumulator() { // 리듀싱 연산을 수행하는 함수를 반환
        return List::add; // (list, item) -> list.add(item); // 탐색한 항목을 누적하고 바로 누적자를 고친다.
    }

    @Override
    public Function<List<T>, List<T>> finisher() {
        return Function.identity(); // 항등 함수
    }

    @Override
    public BinaryOperator<List<T>> combiner() {
        return (list1, list2) -> {
            list1.addAll(list2); // 두번째 콘텐츠와 합쳐서 첫번째 누적자를 고친다.
            return list1;        // 변경된 첫 번째 누적자를 반환한다.
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        // 콜렉터의 플래그를 IDENTITY_FINISH, CONCURRENT 로 설정한다.
        return Collections.unmodifiableSet(EnumSet.of(IDENTITY_FINISH, CONCURRENT));
    }

    public static void main(String[] args) {
        List<Dish> menu = Dish.menu;

        System.out.println("ToListCollector");
        List<Dish> dishes = menu.stream().collect(new ToListCollector<>());
        dishes.forEach(System.out::println);

        System.out.println("toList");
        List<Dish> dishes2 = menu.stream().collect(toList());
        dishes2.forEach(System.out::println);
    }
}