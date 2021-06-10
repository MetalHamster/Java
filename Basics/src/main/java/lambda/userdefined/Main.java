package lambda.userdefined;

/**
 * @author Matthias.Flueckiger
 */
public class Main {
    public static void main(String[] args) {
        String name = "Satan";

        //For one expression
        UserDefinedLambda userDefinedLambda = (x) -> System.out.println("Hello "+x);

        //For multiple expressions
        UserDefinedLambda userDefinedLambda2 = (x) -> {
            System.out.print("Hello ");
            System.out.println(x);
        };

        //Call function
        userDefinedLambda.message(name);
        userDefinedLambda2.message(name);
    }
}
