package ch02;

import java.util.concurrent.*;

// Callable 을 결과로 반환하기
public class CallablePractice {
    /*
    Callable 인터페이스를 이용해 결과를 반환하는 태스크를 만든다. (Runnable 의 업그레이드 버전이라고 생각할 수 있다.)
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newCachedThreadPool();
        //        Future<String> threadName = service.submit(new Callable<String>() {
        //            @Override
        //            public String call() throws Exception {
        //                return Thread.currentThread().getName();
        //            }
        //        });

        // 람다 표현식
        Future<String> threadName = service.submit(
                () -> Thread.currentThread().getName());

        System.out.println(threadName.get());
        service.shutdown();

    }
}
