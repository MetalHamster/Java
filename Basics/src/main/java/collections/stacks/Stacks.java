package collections.stacks;

import java.util.Stack;

public class Stacks {
    /*
    Ordered by insertion
     */

    /*
    empty()             It returns true if nothing is on the top of the stack. Else, returns false.
    peek()              Returns the element on the top of the stack, but does not remove it.
    pop()               Removes and returns the top element of the stack.
    push(element)       Pushes an element on the top of the stack.
    search(element)     It determines whether an object exists in the stack.
     */
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();

        numbers.push(2);
        numbers.push(4);
        numbers.push(3);
        numbers.push(5);

        System.out.println(numbers);
    }
}
