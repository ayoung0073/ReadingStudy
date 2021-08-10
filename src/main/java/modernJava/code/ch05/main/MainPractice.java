package modernJava.code.ch05.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class MainPractice {

    static Trader raoul = new Trader("Raoul", "Cambridge");
    static Trader mario = new Trader("Mario", "Milan");
    static Trader alan = new Trader("Alan", "Cambridge");
    static Trader brian = new Trader("Brian", "Cambridge");

    static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 720),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    public static void main(String[] args) {

        System.out.println("1. 2011년에 일어난 모든 트랜잭션을 찾아 값을 오름차순 정렬하시오.");
        List<Transaction> orderedTransactions = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());

        orderedTransactions.forEach(System.out::println);

        System.out.println();

        System.out.println("2. 거래자가 근무하는 모든 도시를 중복 없이 나열하시오.");
        List<String> cities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList());
        cities.forEach(System.out::println);

        System.out.println();

        System.out.println("3. 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오.");
        List<Trader> traders = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(toList());
        traders.forEach(System.out::println);

        System.out.println();

        System.out.println("4. 모든 거래자의 이름을 알파벳순으로 정렬해서 반환하시오.");
        String traderStr = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .sorted()
                .reduce("", (n1, n2) -> n1 + n2);
        System.out.println(traderStr);

        System.out.println();

        System.out.println("5. 밀라노에 거주지가 있는가?");
        System.out.println(
                transactions.stream().anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"))
        );
        // anyMatch : 프레디케이를 전달해서 밀라노에 거래자가 있는지 확인

        System.out.println();

        System.out.println("6. 케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오.");
        List<Transaction> cambridgeTransactions = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .collect(toList());
        cambridgeTransactions.forEach(System.out::println);

        System.out.println();

        System.out.println("7. 전체 트랜잭션 중 최댓값은 얼마인가?");
        Optional<Integer> optionalMax = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        optionalMax.ifPresent(System.out::println);

        System.out.println();

        System.out.println("8. 전체 트랜잭션 중 최솟값은 얼마인가?");
        Optional<Integer> optionalMin = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);
        optionalMin.ifPresent(System.out::println);

    }
}
