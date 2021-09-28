package com.company.v5.Operations;



public class DivOperation implements Operations {


    public Double execute(Double[] numbers) throws InvalidCalcOperationException {

        if (numbers[1]==0)
        {
            throw new InvalidCalcOperationException("Do not divide by Zero");
        }

        return numbers[0]/numbers[1];
    }

}
