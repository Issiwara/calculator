package com.company.v5;

import com.company.v5.Operations.InvalidCalcOperationException;
import com.company.v5.Operations.OperationFactory;
import com.company.v5.Operations.Operations;
import com.company.v5.input.Inputs;
import com.company.v5.repository.NumberRepository;
import com.company.v5.ui.UI;
import jdk.dynalink.Operation;

import java.io.IOException;

public class CalculatorApp
{

    private final Inputs inputs;
    private final NumberRepository numberRepository;
    private final OperationFactory operationFactory;
    private final UI ui;

    public CalculatorApp(Inputs inputs, NumberRepository numberRepository, OperationFactory operationFactory, UI ui)
    {

        this.inputs = inputs;
        this.numberRepository = numberRepository;
        this.operationFactory = operationFactory;
        this.ui = ui;
    }

    public void execute() throws IOException
    {
        String operator = inputs.getOperator();
        Double[] numbers = numberRepository.getNumbers();
        Operations operation = operationFactory.getInstance(operator);
        Double result = null;
        try {
            result = operation.execute(numbers);
        } catch (InvalidCalcOperationException e) {
            ui.showMessage("Error Occured."+e.getMessage());
            return;
        }
        ui.showMessage("The result is " + result);

    }
}
