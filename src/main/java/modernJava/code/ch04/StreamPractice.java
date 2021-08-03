package modernJava.code.ch04;

import java.util.stream.IntStream;

public class StreamPractice {
    public static void main(String[] args) {

        // 재사용 스트림 문제
        IntStream stream = IntStream.of(1, 2);
        stream.forEach(System.out::println);

        // stream.forEach(System.out::println); // 재사용 불가
        /*
            Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
            at java.base/java.util.stream.AbstractPipeline.sourceStageSpliterator(AbstractPipeline.java:279)
            at java.base/java.util.stream.IntPipeline$Head.forEach(IntPipeline.java:593)
            at modernJava.code.ch04.StreamPractice.main(StreamPractice.java:11)
         */

        // "무한" 스트림 생성 문제
        IntStream.iterate(0, i -> i + 1)
                .limit(10)
                .forEach(System.out::println); // 0 ~ 9 출력

        // 의도치 않게 생성된 무한 스트림
        IntStream.iterate(0, i -> ( i + 1 ) % 2)
                .distinct()
                .limit(10)
                .forEach(System.out::println);
        System.out.println("complete"); // 출력 안 됨, 무한 스트림이 생성된다.



    }
}
