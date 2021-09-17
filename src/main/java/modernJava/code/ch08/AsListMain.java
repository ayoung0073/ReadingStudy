package modernJava.code.ch08;

import java.util.Arrays;
import java.util.List;

public class AsListMain {
    public static void main(String[] args) {
        List<String> friends
                = Arrays.asList("Ayoung", "Maum", "Maong");

        friends.set(0, "Jenny");
        // friends.add("Rosie"); // UnsupportedOperationException
    }
}
