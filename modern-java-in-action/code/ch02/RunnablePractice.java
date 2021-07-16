package ch02;

// Runnable로 코드 블록 실행하기
public class RunnablePractice {
    public static void main(String[] args) {

        //        Thread t = new Thread(new Runnable() {
        //            @Override
        //            public void run() {
        //                System.out.println("Hello world");
        //            }
        //        });

        // 람다 표현식
        Thread t = new Thread(() -> System.out.println("Hello world"));
        t.start();

    }
}
