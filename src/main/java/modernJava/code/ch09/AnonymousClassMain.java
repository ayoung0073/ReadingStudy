package modernJava.code.ch09;

public class AnonymousClassMain {
    public static void main(String[] args) {
        int a = 10;
        Runnable r1 = () -> {
            // a = 3; // 람다 표현식으로는 변수를 가릴 수 없다.
            System.out.println("hello");
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                int a = 2; // 잘 작동
                System.out.println("hello");
            }
        };

        doSomething(new Task() {
            @Override
            public void execute() {
                System.out.println("Danger danger!!");
            }
        });

        doSomething((Task)() -> System.out.println("Danger danger!!")); // 모호함 제거하기
    }

    public static void doSomething(Runnable r) { r.run(); }

    // Task라는 Runnable과 같은 시그니처를 갖는 함수형 인터페이스를 선언
    public static void doSomething(Task a) { a.execute(); }

}

interface Task {
    public void execute();
}