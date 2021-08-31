package modernJava.code.ch06;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator1 = Integer::sum;
        // BinaryOperator<Integer> binaryOperator = (n1, n2) -> n1 + n2;
        Integer sum = binaryOperator1.apply(10, 100);
        System.out.println(sum); // 110


        BinaryOperator<Integer> binaryOperator2 = BinaryOperator.maxBy(Integer::compareTo);
        BinaryOperator<Integer> binaryOperator3 = BinaryOperator.minBy(Integer::compareTo);

        Integer integer1 = 10;
        Integer integer2 = 20;

        Integer max = binaryOperator2.apply(integer1, integer2);
        Integer min = binaryOperator3.apply(integer1, integer2);

        System.out.println(max);
        System.out.println(min);

        BinaryOperator<Item> binaryOperator4 = BinaryOperator.maxBy(Comparator.comparingInt(Item::getId));
//        BinaryOperator<Item> binaryOperator4 = BinaryOperator.maxBy(
//                (Item i1, Item i2) -> i1.getId() - i2.getId());

        Item item1 = new Item(10, "first");
        Item item2 = new Item(20, "second");

        Item maxItem = binaryOperator4.apply(item1, item2);

        System.out.println(maxItem);
    }

}
