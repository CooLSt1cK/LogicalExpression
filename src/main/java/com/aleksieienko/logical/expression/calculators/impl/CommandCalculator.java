package com.aleksieienko.logical.expression.calculators.impl;

import com.aleksieienko.logical.expression.calculators.Calculator;
import com.aleksieienko.logical.expression.operations.impl.LogicalAndOperationCommand;
import com.aleksieienko.logical.expression.operations.impl.LogicalOrOperationCommand;
import com.aleksieienko.logical.expression.operations.impl.NotOperationImpl;

public class CommandCalculator extends Calculator {

    public CommandCalculator(boolean value) {
        super(value);
    }

    @Override
    public Calculator and(Calculator calculator) {
        setValue(new LogicalAndOperationCommand().execute(this.getValue(), calculator.getValue()));
        return this;
    }

    @Override
    public Calculator or(Calculator calculator) {
        setValue(new LogicalOrOperationCommand().execute(this.getValue(), calculator.getValue()));
        return this;
    }

    @Override
    public Calculator and(boolean b) {
        setValue(new LogicalAndOperationCommand().execute(this.getValue(), b));
        return this;
    }

    @Override
    public Calculator or(boolean b) {
        setValue(new LogicalOrOperationCommand().execute(this.getValue(), b));
        return this;
    }

    @Override
    public Calculator not() {
        setValue(new NotOperationImpl().execute(this.getValue()));
        return this;
    }
}
