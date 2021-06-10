package syntax.interfaces;

public interface Interfaces {
    /*
    Definition:
    An interface is a completely "abstract class" that is used to group related methods with empty bodies

    When to use:
    When you have or want to inherit from multiple classes, or in this case, that would be interfaces
    "extends" can't be used, cause you can only extend from one super class.

    Things to Note:
    1. Interface attributes are by default public, static and final
    2. Interface methods are static and abstract
    3. Interfaces cannot be used to create objects
    4. Methods do not have a body and must be overridden on implementation
     */

    void myMethod();
}
