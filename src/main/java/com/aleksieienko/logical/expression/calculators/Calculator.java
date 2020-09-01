package com.aleksieienko.logical.expression.calculators;

public abstract class Calculator {
    private boolean value;

    public Calculator(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public abstract Calculator and(Calculator calculator);
    public abstract Calculator or(Calculator calculator);
    public abstract Calculator and(boolean b);
    public abstract Calculator or(boolean b);
    public abstract Calculator not();
}
