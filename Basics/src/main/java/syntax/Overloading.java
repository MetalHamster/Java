package syntax;

public class Overloading {
    int sec;
    int min;
    int hour;
    boolean summerTime;

    Overloading(int sec){

    }

    Overloading(int sec, int min){

    }

    Overloading(int sec, int min, int hour){

    }

    Overloading(boolean summerTime){

    }

    public void setTime(int sec){

    }

    public void setTime(int sec, int min){

    }

    public void setTime(int sec, int min, int hour){

    }

    public void setTime(boolean summerTime){

    }

    /*
    Polymorphism applies to constructors as such as to methods.
    Rule 1: Different amount of parameters if data typ is the same
    Rule 2: The order of the parameters will not make it unique


     */
}
