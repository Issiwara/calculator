package com.company.v4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//this class name will be changed in future
public class FileReader {

    public Double[] getNumbers() throws IOException {
        //File reading
        List<String> numbersStrs = Files.readAllLines(
                Paths.get("E:\\Desktop\\2nd Year\\Software Construction\\calculator\\numbers.TXT")
        );

        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));

        return new Double[]{number1, number2};
    }
}