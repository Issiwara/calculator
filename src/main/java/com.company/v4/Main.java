package com.company.v4;

import com.company.v4.Operations.*;
import com.company.v4.Operations.OperationFactory;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();


        OperationFactory operationFactory = new OperationFactory();
        Operations operation = operationFactory.getInstance(operator);
        Double result = operation.execute(numbers);


        UI ui = new UI();
        ui.showMessage("The result isss " + result);

    }

}