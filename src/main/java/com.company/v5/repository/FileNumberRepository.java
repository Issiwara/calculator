package com.company.v5.repository;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class FileNumberRepository implements NumberRepository{

    public Double[] getNumbers() throws NumberRepositoryException {
        //File reading
        List<String> numbersStrs = null;
        try {
            numbersStrs = Files.readAllLines(
                    Paths.get("E:\\Desktop\\2nd Year\\Software Construction\\calculator\\numbers.TXT")
            );
        } catch (IOException e) {
            e.printStackTrace();
            throw new NumberRepositoryException(e,"Couldn't Read The File");
        }

        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));

        return new Double[]{number1, number2};
    }
}