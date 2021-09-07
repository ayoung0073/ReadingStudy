package modernJava.code.ch07;

import java.util.function.Function;

public class StreamTimeTest {
    public static void main(String[] args) {

        // for loop 로 실행한 결과(iterativeSum)
        System.out.println("Iterative sum done in: " +
                measureSumPerf(ParallelStreams::iterativeSum, 10_000_000) + " msecs");
        // Iterative sum done in: 3 msecs

        // 일반 스트림으로 수행한 결과(sequentialSum)
        System.out.println("Sequential sum done in: " +
                measureSumPerf(ParallelStreams::sequentialSum, 10_000_000) + " msecs");
        // Sequential sum done in: 85 msecs

        // 병렬 스트림으로 실행환 결과(parallelSum)
        System.out.println("Parallel sum done in: " +
                measureSumPerf(ParallelStreams::parallelSum, 10_000_000) + " msecs");
        // Parallel sum done in: 395 msecs

        // LongStream.rangeClosed
        System.out.println("Range sum done in: " +
                measureSumPerf(ParallelStreams::rangedSum, 10_000_000) + " msecs");
        // Ranged sum done in: 3 msecs

        // LongStream.rangeClosed 병렬 스트림 적용
        System.out.println("Parallel range sum done in: " +
                measureSumPerf(ParallelStreams::parallelRangedSum, 10_000_000) + " msecs");
        // Parallel range sum done in: 0 msecs

    }

    public static long measureSumPerf(Function<Long, Long> adder, long n) {
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            long sum = adder.apply(n);
            long duration = (System.nanoTime() - start) / 1_000_000;
            System.out.println("Result: " + sum);
            if (duration < fastest) fastest = duration;
        }
        return fastest;
    }

}
