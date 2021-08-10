package modernJava.code.ch05.main;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Trader {

    private final String name;

    private final String city;

}
