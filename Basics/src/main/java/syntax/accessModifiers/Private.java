package syntax.accessModifiers;

public class Private {
    /*ACCESSIBILITY
    The code is only accessible within the declared class.
    The modifier private is mostly used in instantiable classes.
    You want to give as few authorization as necessary.
    You can access private variables with getter and setter methods
     */

    private int count=5;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}
