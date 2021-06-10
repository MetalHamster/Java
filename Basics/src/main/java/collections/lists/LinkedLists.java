package collections.lists;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    /* INFO
    1. Use when add, remove or change elements are more frequent tha accessing them
    2. Store reference Datatypes: String, Integer, Boolean...
    3. Resizes itself
    4. Sorted by insertion
    */

    /* METHODS
    .add("element")             //add element at end of the list
    .add(index, "element")      //add element to specific index
    .addFirst("element")        //insert element at the beginning of the list
    .addLast("element")         //insert(append) element at the end of the list

    .clear()                    //deletes all items
    .contains("element")        //Check if a element is stored

    .get(index)                 //return element from specific position
    .getFirst()                 //return first element
    .getLast()                  //return last element

    .isEmpty()                  //Check if array is empty or not, returns true or false
    .indexOf("element")         //return index of specific element

    .remove(index)              //remove element by index
    .remove("element")          //remove element by value (The first index with such value will be removed)
    .removeFirst()              //remove and return first element
    .removeLast()               //remove and return last element

    .set(index, "element")      //change element
    .size()                     //length

    .toArray()                  //return as an array
    .toString()                 //return as a String




     */

    public void linkedList(){
        List<String> food = new LinkedList<String>();

        //add
        food.add("pizza");
        food.add("banana");
        food.add("berry");
        food.add(1,"hotdog"); //Insert on second position

        System.out.println(food);
        System.out.println(food.contains("pizza"));


    }

    public static void main(String[] args) {
        LinkedLists example = new LinkedLists();
        example.linkedList();
    }
}
