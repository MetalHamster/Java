package algorythms.patterns.creational.singleton;

public class Main {
    /*
    Singleton pattern is one of the simplest design patterns in Java.

    This pattern involves a single class which is responsible to create an object
    while making sure that only single object gets created.

    This class provides a way to access its only object
    which can be accessed directly without need to instantiate the object of the class.
    */
    public static void main(String[] args) {
        //Singleton not Thread safe
        //Singleton s = new Singleton();// -> Error
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        s1.showMessage();
        s2.showMessage();

        System.out.println("\n"+"----------------------------------"+"\n");

        //Singleton Thread safe
        SingletonThreadSafe stf1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe stf2 = SingletonThreadSafe.getInstance();
        System.out.println(stf1);
        System.out.println(stf2);
        stf1.showMessage();
        stf2.showMessage();
    }

}
