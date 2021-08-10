package modernJava.code.ch05.main;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Transaction {

    private final Trader trader;

    private final int year;

    private final int value;

}
