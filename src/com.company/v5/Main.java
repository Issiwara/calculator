package com.company.v5;

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

        inputs inputs= new CommandLineInputs(args);
     

        NumberRepository numberRepository = new FileNumberRepository();
   
        
        OperationFactory operationFactory=new OperationFactory();
       
        
        UI ui=new CmdLineUI();
        
        CalculatorApp app = new CalculatorApp(inputs,numberRepository,operationFactory,ui);
        app.execute();

    }

    