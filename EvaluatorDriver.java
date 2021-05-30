//Manuel Diaz
//CSC130
//Assignment 1

public class EvaluatorDriver {

    public static void main(String[] args) {

        Evaluator test = new Evaluator();
        
        System.out.println(test.About());
        test.Add("20");
        test.Add("6");
        test.Add("4");
        test.Add("+");
        test.Add("/");
        test.Add("4");
        test.Add("3");
        test.Add("*");
        test.Add("+");        
        System.out.println(" = " +test.Evaluate());



        System.out.println(test.About());
        test.Add("4");
        test.Add("5");
        test.Add("7");
        test.Add("2");
        test.Add("+");
        test.Add("-");
        test.Add("*");
        System.out.println(" = " +test.Evaluate());


        System.out.println(test.About());
        test.Add("3");
        test.Add("4");
        test.Add("+");
        test.Add("2");
        test.Add("*");
        test.Add("7");
        test.Add("/");
        System.out.println(" = " +test.Evaluate());


        System.out.println(test.About());
        test.Add("2");
        test.Add("2");
        test.Add("2");
        test.Add("^");
        test.Add("%");
        System.out.println(" = " +test.Evaluate());
    }
}
