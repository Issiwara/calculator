package com.company.v5.Operations;



public class SubOperation implements Operations {

    public Double execute(Double[] numbers){
        return numbers[0]-numbers[1];
    }
    
}
