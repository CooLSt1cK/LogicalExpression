package com.aleksieienko.logical.expression.operations.impl;

import com.aleksieienko.logical.expression.operations.OperationCommand;

public class LogicalOrOperationCommand implements OperationCommand {


    @Override
    public boolean execute(boolean a, boolean b) {
        return a | b;
    }
}
