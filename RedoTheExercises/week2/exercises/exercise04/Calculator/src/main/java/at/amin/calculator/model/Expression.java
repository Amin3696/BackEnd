package at.amin.calculator.model;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Expression {
    private double number1;
    private double number2;
    private String symbol;

}
