package syntax.accessModifiers;

public class TestModifiers {
    public static void main(String[] args) {
        Private private1 = new Private();
        Public public1 = new Public();
        Protected pro = new Protected();

        //----------this attribute call will cause an error as it was set private----------//
        //private1.count;
        System.out.println("Value of count: "+private1.getCount());    //instead use a get or set method.

        //----------Testing accessibility of public attributes----------//
        System.out.println("Value of sum: "+public1.sum);    //as you see, this works just fine.

        pro.proctedInt=9;

        System.out.println(pro.proctedInt);
    }
}
