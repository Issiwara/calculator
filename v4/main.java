package com.company.v3;

import java.nio.file.Paths;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.nio.file.Files;

public class Main
 {


    //SOLID PRINCIPLES --> ALL THE SOLID PRINCIPLES ARE VIOLATED HERE!!!
    public static void main(String[] args) throws IOException {

        CommandLineInputs inputs= new CommandLineInputs(args);
        String operator = inputs.getOperator();


        FileReader fileReader = new fileReader();
        Double[] numbers = fileReader.getNumbers();

        Double number1 = numbers[0];
        Double number2 = numbers[1];
        double result = 0;

        switch (operator) {
            case "add":
                AddOperation addoperation = new AddOperation();
                result = addoperation.execute(numbers);
                break;
            case "sub":
            SubOperation suboperation = new SubOperation();
            result = suboperation.execute(numbers);
                break;
            case "mul":
            MulOperation muloperation = new MulOperation();
            result = muloperation.execute(numbers);
                break;
        }

        System.out.println("The result is " + result);

    }
}