package com.company.v2;

import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;
import java.nio.file.Files;

public class Main
 {


    //SOLID PRINCIPLES --> ALL THE SOLID PRINCIPLES ARE VIOLATED HERE!!!
    public static void main(String[] args) throws IOException {

        //Make sure to validate the arguments before using...
        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument");
            return;
        }

        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))) {
            System.out.println("Please provide add,sub or mul as the operator argument");
            return;
        }

        //read the numbers text file
        List<String> numbersStrs = Files.readAllLines(
                Paths.get("E:/Desktop/2nd Year/Software Construction/calculator/numbers.txt")
        );

        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));

        double result = 0;

        switch (operator) {
            case "add":
                result = number1 + number2;
                break;
            case "sub":
                result = number1 - number2;
                break;
            case "mul":
                result = number1 * number2;
                break;
        }

        System.out.println("The result is " + result);

    }
}