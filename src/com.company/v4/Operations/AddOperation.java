package com.company.v4.Operations;

import jdk.dynalink.Operation;

public class AddOperation implements Operation {

    public Double eeecute(Double[] numbers){
        return numbers[0]+numbers[1];
    }
    
}
