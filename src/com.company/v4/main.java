package com.company.v4;

import java.nio.file.Paths;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.company.v4.Operations.OperationFactory;

import java.nio.file.Files;

public class Main
 {


    //SOLID PRINCIPLES --> ALL THE SOLID PRINCIPLES ARE VIOLATED HERE!!!
    public static void main(String[] args) throws IOException {

        CommandLineInputs inputs= new CommandLineInputs(args);
        String operator = inputs.getOperator();


        FileReader fileReader = new fileReader();
        Double[] numbers = fileReader.getNumbers();

        
        OperationFactory operationFactory=new OperationFactory();
        Operation operation = operationFactory.getInstance(operator);
        Double result = operation.execute(numbers);

        UI ui=new UI();
        ui.showmessage("The result is " + result);
        
    }

    
}