package syntax.nonAccessModifiers;

public final class Final {
    /*CLASS
    1. final classes cannot be inherited by other classes
     */

    /*ATTRIBUTES/METHODS
    1. You have to assign a Value when creating a final variable
    2. Final Attributes can not be overridden.
    3. The names of the final variables must be written in CAPS
     */

    final int MAX = 7;

    //-----This will cause an error-----//
    //MAX =5;
}
