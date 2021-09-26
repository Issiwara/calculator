package com.company.v4.Operations;


public class OperationFactory {

    public Operation getInstance(String operator)
{
    
    Operation operation = null;

        if(operator.equals("add"))
                {
                    operation = new AddOperation();
                }
                
                else if(operator.equals("sub"))
            
           {
                operation = new SubOperation();
            }
           
            else if(operator.equals("mul"))

            {
                operation = new MulOperation();
            }
            else if(operator.equals("dev"))

            {
                operation = new DevOperation();
            }

            return operation;
            
        
    }
    
}