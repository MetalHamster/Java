package collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    /* INFO
    1. Use when searching or view data is more frequent than adding/removing them
    2. Store reference Datatypes: String, Integer, Boolean...
    3. Resizes itself
    */

    /* PROs
    1. Fast random access of elements
     */

    /* CONs
    1. Adding/Remove from the middle takes time, as it needs to shift the other entries
     */

    /* METHODS
    .add("value")           //add value at end of the list
    .add(index, "value")    //add value to specific index
    .set(index, "value")    //change value
    .size()                 //length
    .get(index)             //get value by index
    .remove(index)          //remove item by index
    .remove("value")        //remove item by value (The first index with such value will be removed)
    .clear()                //deletes all items
    .contains("value")      //Check if a value is stored
    .isEmpty()              //Check if array is empty or not, returns true or false
     */

    public void stringArrayList(){
        List<String> food = new ArrayList<String>();

        System.out.println("Is arraylist empty?: "+food.isEmpty());

        //add
        food.add("pizza");
        food.add("banana");
        food.add("hotdog");

        System.out.println("Is arraylist empty?: "+food.isEmpty()+"\n");

        //change
        food.set(0,"hamburger");

        //remove
        food.remove(2);

        //contains
        System.out.println("Does arraylist contain 'banana'?: "+food.contains("banana"));
        System.out.println("Does arraylist contain 'apple'?: "+food.contains("apple")+"\n");

        //prints whole list in one line
        System.out.println("Printing whole arraylist: "+food);

        //print with index
        System.out.println("Printing first index: "+food.get(0));

        //print with for loop
        System.out.print("Printing with for loop:\n");
        for (int i = 0; i < food.size(); i++) {
        System.out.println("ArrayList pos "+i+": "+food.get(i));
        }
    }

    public void integerArrayList(){
        ArrayList<Integer> numbers = new ArrayList<>();
    }

    public static void main(String[] args) {
        ArrayLists examples = new ArrayLists();

        examples.stringArrayList();
    }
}
