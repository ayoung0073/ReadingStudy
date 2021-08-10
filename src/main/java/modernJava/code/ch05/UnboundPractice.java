package modernJava.code.ch05;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 무한 스트림(언바운드 스트림)
public class UnboundPractice {
    public static void main(String[] args) {

        System.out.println("iterate 메서드");

        IntStream.iterate(88, n -> n < 100, n -> n + 4)
                .forEach(System.out::println);

        System.out.println("======= filter");
        IntStream.iterate(88, n -> n + 4)
                .filter(n -> n < 100)
                .limit(10)
                .forEach(System.out::println);
        /*
            88
            92
            96
            -2147483648
            -2147483644
            -2147483640
            ...
        */
        System.out.println("======= takeWhile");
        IntStream.iterate(88, n -> n + 4) // IntStream.iterate(88, n -> n < 100, n -> n + 4) 와 같다.
                .takeWhile(n -> n < 100)
                .limit(10)
                .forEach(System.out::println);
        /*
            88
            92
            96
         */
        System.out.println();

        System.out.println("generate 메서드");
        Stream.generate(() -> 5).limit(10).forEach(System.out::println);
        Stream.generate(Math::random).limit(10).forEach(System.out::println);

        System.out.println();

        System.out.println("generate 피보나치수열");
        IntSupplier fib = new IntSupplier() {
            private int previous = 0;
            private int current = 1;
            public int getAsInt() {
                int oldPrevious = this.previous;
                int nextValue = this.previous + this.current;
                this.previous = this.current;
                this.current = nextValue;
                return oldPrevious;
            }
        };

        IntStream.generate(fib).limit(10).forEach(System.out::println);

    }
}
