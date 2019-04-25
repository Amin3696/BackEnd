package at.amin.calculator.controller;

import at.amin.calculator.controller.operation.Operation;
import at.amin.calculator.model.Expression;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Supplier;

@Component
@RequiredArgsConstructor
public class Calculator {

    private final List<Operation> operations;

    public double calculate(Expression expression) {
        return operations.stream()
                .filter(operation -> operation.matches(expression))
                .map(operation -> operation.apply(expression))
                .findFirst().orElseThrow(wrongOperation(expression));

    }

    private Supplier<IllegalArgumentException> wrongOperation(Expression expression) {
        return () -> new IllegalArgumentException("not supported operation: " + expression.getSymbol());
    }

}
