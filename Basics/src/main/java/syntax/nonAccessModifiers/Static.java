package syntax.nonAccessModifiers;

public class Static {
    /*KEYWORD STATIC
    1. Static attributes and methods belong to a class rather to an object
    2. Static attributes and methods can be accessed without creating an object first.
    3. Static attributes and methods are Cross-Object and can only exist once per class
    4. All methods from the class can access them. (No in function scope)
    5. Static attributes and methods are like global functions inside a class
     */

    /*ADDITIONAL INFORMATION
    1. Constants are often written as static, cuz the value never changes,
    so it makes sense to add the static keyword
    2. Classes like Math, String, Arrays have only static methods
     */

    //----------Static attribute----------//
    private static int countOfObjFromStaticBlock;
    private static int countOfObjFromConstructor;
    public static int MAXOBJ=10;

    //----------Static block----------//
    static{
        countOfObjFromStaticBlock++;
    }

    //----------Constructor----------//
    Static(){
        countOfObjFromConstructor++;
    }

    //----------Static method----------//
    public static void printSomething(){
        System.out.println("hi im a static method");
    }
    public static int getCountOfObjFromStaticBlock(){
        return countOfObjFromStaticBlock;
    }

    public static int getCountOfObjFromConstructor() {
        return countOfObjFromConstructor;
    }

    //----------Non static method----------//
    public void printSomething2(){
        System.out.println("hi im a non static method");
    }

    //----------Main method----------//
    public static void main(String[] args) {
        /*NON STATIC METHOD
        1. Must be called from an object, therefore you have to create an object first an then call the method.
        */
        Static st = new Static();
        Static st2 = new Static();
        Static st3 = new Static();
        System.out.println(Static.MAXOBJ);


        st.printSomething2();


        System.out.println("Count of obj with a static block: "+Static.getCountOfObjFromStaticBlock());

        System.out.println("Count of obj with a Constructor: "+Static.getCountOfObjFromConstructor());


        /*STATIC METHOD
        1. Static methods can be called without creating an Object
        */
        //printSomething();
    }
}


