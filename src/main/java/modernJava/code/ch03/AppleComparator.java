package modernJava.code.ch03;

import modernJava.code.ch02.Apple;

import java.util.Comparator;

public class AppleComparator implements Comparator<Apple> {
    public int compare(Apple a1, Apple a2) {
        return a1.getWeight().compareTo(a2.getWeight());
    }
}