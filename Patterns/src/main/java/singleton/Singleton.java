package singleton;

public class Singleton {
    private static Singleton instance;

    //make the constructor private so that this class cannot be instantiated
    private Singleton() {
    }

    //Get the only object available
    public static Singleton getInstance()
    {
        if(instance==null)
        {
            instance=new Singleton();
        }
        return instance;
    }

    /*All other stuff below here ~~ */

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
