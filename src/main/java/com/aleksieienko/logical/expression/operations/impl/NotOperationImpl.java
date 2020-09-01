package com.aleksieienko.logical.expression.operations.impl;

import com.aleksieienko.logical.expression.operations.NotOperation;

public class NotOperationImpl implements NotOperation {
    @Override
    public boolean execute(boolean value) {
        return !value;
    }
}
