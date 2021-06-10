package singleton;

public class SingletonThreadSafe {
    //create an object of SingleObject
    private static final SingletonThreadSafe instance = new SingletonThreadSafe();

    //make the constructor private so that this class cannot be instantiated
    private SingletonThreadSafe() {
    }

    //Get the only object available
    public static SingletonThreadSafe getInstance() {
        return instance;
    }

    /*All other stuff below here ~~ */

    public void showMessage(){
        System.out.println("Hello World!");
    }



}
