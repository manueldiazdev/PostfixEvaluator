//Manuel Diaz
//CSC130
//Assignment 1
public class Evaluator {
    //fields
    private Queue operatorQueues;
    private final String[] operators = {"+", "-", "*", "/", "%", "^"};
    //constructor
    public Evaluator(){
        this.operatorQueues = new Queue();
    }
    /**
     * adds data to the Queue
     * @param item data
     */
    public void Add(String item){
        this.operatorQueues.enqueue(item);
        System.out.print(item + " ");
    }
    /**
     * The main logic that is used to calculate an equation
     * @return the answer of the equation
     */
    public double Evaluate(){
        double temp = 0.0;
        boolean filled = false;
        Stack operands = new Stack();

        if(operatorQueues.peak()){
            filled = true;
        }

        while(filled){

            String opp = operatorQueues.dequeue();

            if(operatorMatch(opp)){
                temp = operands.pop();
                operands.push(operatorMath(opp, temp, operands.pop()));
            }else{
                operands.push(Double.parseDouble(opp));
            }
            if(!operatorQueues.peak()){
                filled = false;
            }
        }
        return operands.pop();
    }
    /**
     * description about my class
     * @return description returns as a string
     */
    public String About(){
        return "\nHello everyone.\n\nThis is my postfix evaluator!\n\n- Manuel Diaz" ;
    }




//Functions below help with organization
    /**
     * Check if the input string matches one of the operators (in the array of the Evaluator class) 
     * @param opp operator value as a string
     * @return true if operator matches else false
     */
    private boolean operatorMatch(String opp){
        for (String operator : operators) {
            if (opp.equals(operator)) {
                return true;
            }
        }
        return false;
    }
    /**
     * Calculates the operation that are fed in to the arguments 
     * @param opp the operation that is going to exectued
     * @param number2 second number (denominator for '/' & '%' and '-' value) 
     * @param number1 first number (numerator for '/' & '%' and the positive value when using '-' operator )
     * @return
     */
    private double operatorMath(String opp, double number2, double number1){
        double output = 0.0;
        if (opp.equals(operators[0]))
            output = number1 + number2;
        else if (opp.equals(operators[1]))
            output = number1 - number2;
        else if (opp.equals(operators[2]))
            output = number1 * number2;
        else if (opp.equals(operators[3]))
            output = number1 / number2;
        else if (opp.equals(operators[4]))
            output = number1 % number2;
        else if (opp.equals(operators[5]))
            output = Math.pow(number1,number2);

        return output;
    }

}
