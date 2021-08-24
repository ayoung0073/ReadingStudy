package modernJava.code.ch06;

import modernJava.code.ch05.Dish;

import java.util.List;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.reducing;

public class JoiningQuiz {

    /**
     * reducing 컬렉터로 올바르게 바꾼 코드를 모두 선택하라.
     */
    public static void main(String[] args) {
        List<Dish> menu = Dish.menu;

        // 주어진 shortMenu
        String shortMenu = menu.stream().map(Dish::getName).collect(joining(", "));
        System.out.println(shortMenu);
        // seasonal fruitprawnschickenfrench friesrice
        // seasonal fruit, prawns, chicken, french fries, rice

        /*
          1.
          원래의 joining 컬렉터처럼 각 요리를 요리명으로 변환한 다음에 문자열을 누적자로 사용해서
          문자열 스트림을 리듀스하면서 요리명을 하나씩 연결한다.
         */
        String menu1 = menu.stream().map(Dish::getName)
                .collect(reducing((s1, s2) -> s1 + ", " + s2)).get();
        // String menu1 = menu.stream().map(Dish::getName).reduce((s1, s2) -> s1 + s2).get();
        System.out.println("1. " + menu1);
        // 1. seasonal fruit, prawns, chicken, french fries, rice
        /*
          2. 컴파일 되지 않음.
          reducing은 BinaryOperator,T>, 즉 BiFunction<T, T, T>를 인수로 받는다. 즉, reducing은 두 인수를 받아 같은 형식을 반환하는 함수를 인수로 받는다.
          하지만 2번 람다 표현식은 2개의 요리를 인수로 받아 문자열을 반환한다.
         */
        // String menu2 = menu.stream().collect(reducing((d1, d2) -> d1.getName() + d2.getName())).get();

        /*
          3.
          빈 문자열을 포함하는 누적자를 이용해서 리듀싱 과정을 시작하며, 스트림의 요리를 방문하면서 각 요리를 요리명으로 변환한 다음에 누적자로 추가한다.
          세 개의 인수를 갖는 reducing은 누적자 초깃값을 설정할 수 있으므로 Optional을 반환할 필요가 없다.
         */
        String menu3 = menu.stream()
                .collect(reducing("", Dish::getName, (s1, s2) -> s1 + ", "+ s2));
        System.out.println("3. " + menu3);
        // String menu3 = menu.stream().map(Dish::getName).reduce("", (s1, s2) -> s1 + s2);
        // 3. , seasonal fruit, prawns, chicken, french fries, rice

        /*
         범용 reducing으로 joining을 구현할 수 있음을 보여주는 예제일 뿐이다.
         실무에서는 joining을 사용하는 것이 가독성과 성능에 좋다.
         */
    }

}
