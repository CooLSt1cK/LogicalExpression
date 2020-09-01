package com.aleksieienko.logical.expression;

import com.aleksieienko.logical.expression.calculators.Calculator;
import com.aleksieienko.logical.expression.calculators.impl.CommandCalculator;

public class Demo {
    public static void main(String[] args) {
        Calculator calculator = new CommandCalculator(true).and(new CommandCalculator(false).and(new CommandCalculator(false)).not()).or(new CommandCalculator(true).not());
        System.out.println(calculator.getValue());
    }
}
