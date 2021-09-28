package com.company.v5.Operations;


public class OperationFactory {


    public Operations getInstance(String operator) {

        Operations operation = null;
        if (operator.equals("add"))
        {
            operation = new AddOperation();
        }
        else if (operator.equals("sub"))
        {
            operation = new SubOperation();
        }
        else if (operator.equals("mul"))
        {
            operation = new MulOperation();
        }
        else if (operator.equals("div"))
        {
            operation = new DivOperation();
        }//violation OCP

        return operation;
    }
}