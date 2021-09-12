
package com.company.v5;

import jdk.internal.util.xml.impl.Input;

import java.io.IOException;

public class CalculatorApp{

    private final Inputs inputs;
    private final NumberRepository numberRepository;
    private final OperationFactory operationFactory;
    private final UI ui;


    public CalculatorApp(Inputs input,NumberRepository numberRepository,OperationFactory  operationFactory,UI ui);

    {

        this.inputs = inputs;
        this.numberRepository=numberRepository;
        this.operationFactory=operationFactory;
        this.ui=ui;
    }


    public void execute()
    { 
         String operator = inputs.getOperator();

         Double[] numbers = numberRepository.getNumbers(); 
    
        Operation operation = operationFactory.getInstance(operator);
        Double result = operation.execute(numbers);

        ui.showmessage("The result is " + result);
        
    }
}