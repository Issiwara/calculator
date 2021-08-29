package com.company.v3;

import java.io.IOException;

public class FileReader {

    public Double[] getNumbers() throws IOException
    {
        //read the numbers text file
        List<String> numbersStrs = Files.readAllLines(
                Paths.get("E:/Desktop/2nd Year/Software Construction/calculator/numbers.TXT")
        );

        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));

        return new Double[]{ number1,number2 };


    }
    
}
