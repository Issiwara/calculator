package com.company.v4.Operations;

public class DivOperation implements Operations {

    public Double execute(Double[] numbers){
        return numbers[0]/numbers[1];
    }

}