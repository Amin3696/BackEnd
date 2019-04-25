package at.amin.calculator.controller.operation;

import at.amin.calculator.model.Expression;

public interface Operation {
    boolean matches(Expression expression);

    double apply(Expression expression);

}
