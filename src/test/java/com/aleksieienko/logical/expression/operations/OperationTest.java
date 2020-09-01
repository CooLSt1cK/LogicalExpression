package com.aleksieienko.logical.expression.operations;

import com.aleksieienko.logical.expression.operations.impl.LogicalAndOperationCommand;
import com.aleksieienko.logical.expression.operations.impl.LogicalOrOperationCommand;
import com.aleksieienko.logical.expression.operations.impl.NotOperationImpl;
import org.junit.Assert;
import org.junit.Test;

public class OperationTest {
    OperationCommand operationCommand;

    @Test
    public void operationAnd(){
        operationCommand = new LogicalAndOperationCommand();
        boolean actual = operationCommand.execute(true,true);
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void operationOr(){
        operationCommand = new LogicalOrOperationCommand();
        boolean actual = operationCommand.execute(true, false);
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void operationNot(){
        boolean actual = new NotOperationImpl().execute(true);
        boolean expected = false;
        Assert.assertEquals(expected, expected);
    }
}
