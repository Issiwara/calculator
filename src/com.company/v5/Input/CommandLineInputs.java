package com.company.v5.Input;


    public class CommandLineInputs implements Inputs {

        private final String[] args;
    
        public CommandLineInputs(String[] arguments) {
            
            this.args = arguments;
        }
    
        public String getOperator()
        {
            if (args.length == 0)
            {


                throw new InvalidInputException("Provide the Operation");
            }
    
            String operator = args[0];
    
            if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul")||operator.equals("dev"))) {
                throw new InvalidInputException("Provide the Operation");

            }
    
            return operator;
        }
        
}
