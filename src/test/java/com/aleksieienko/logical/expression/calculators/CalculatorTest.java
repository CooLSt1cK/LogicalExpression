package com.aleksieienko.logical.expression.calculators;

import com.aleksieienko.logical.expression.calculators.impl.CommandCalculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void commandCalculatorTest(){
        Calculator calculator = new CommandCalculator(true).and(new CommandCalculator(false).and(true).or(new CommandCalculator(true).not()).not()).or(false);
        boolean expected = true;
        boolean actual = calculator.getValue();
        Assert.assertEquals(expected,actual);
    }
}
