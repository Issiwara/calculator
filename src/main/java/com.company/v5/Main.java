package com.company.v5;

import com.company.v5.Operations.OperationFactory;
import com.company.v5.input.CommandLineInputs;
import com.company.v5.input.Inputs;
import com.company.v5.repository.FileNumberRepository;
import com.company.v5.repository.NumberRepository;
import com.company.v5.repository.SqlNumberRepository;
import com.company.v5.ui.CmdLineUi;
import com.company.v5.ui.UI;

//Main class is the coordinator now...
public class Main {

    public static void main(String[] args)  {

        Inputs inputs = new CommandLineInputs(args);
        NumberRepository numberRepository = new FileNumberRepository();
        OperationFactory operationFactory = new OperationFactory();
        UI ui = new CmdLineUi();
        CalculatorApp app = new CalculatorApp(inputs,numberRepository,operationFactory,ui);
        app.execute();

    }

}