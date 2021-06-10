package collections.sets;

import java.util.HashSet;
import java.util.Set;

public class HashSets {
    /*
    No duplicate elements
    Ordered by hashcode, hence unpredictable
    HashSet is slower than HashMap.
    For operations like search, insert and delete.
    HashSet is faster than TreeSet.
     */

    /*
    add(element)	            This method is used to add a specific element to the set. The function adds the element only if the specified element is not already present in the set else the function returns False if the element is already present in the Set.
    addAll(collection)	        This method is used to append all of the elements from the mentioned collection to the existing set. The elements are added randomly without following any specific order.
    clear()	                    This method is used to remove all the elements from the set but not delete the set. The reference for the set still exists.
    contains(element)	        This method is used to check whether a specific element is present in the Set or not.
    containsAll(collection)	    This method is used to check whether the set contains all the elements present in the given collection or not. This method returns true if the set contains all the elements and returns false if any of the elements are missing.
    hashCode()	                This method is used to get the hashCode value for this instance of the Set. It returns an integer value which is the hashCode value for this instance of the Set.
    isEmpty()	                This method is used to check whether the set is empty or not.
    iterator()	                This method is used to return the iterator of the set. The elements from the set are returned in a random order.
    remove(element)	            This method is used to remove the given element from the set. This method returns True if the specified element is present in the Set otherwise it returns False.
    removeAll(collection)	    This method is used to remove all the elements from the collection which are present in the set. This method returns true if this set changed as a result of the call.
    retainAll(collection)	    This method is used to retain all the elements from the set which are mentioned in the given collection. This method returns true if this set changed as a result of the call.
    size()	                    This method is used to get the size of the set. This returns an integer value which signifies the number of elements.
    toArray()	                This method is used to form an array of the same elements as that of the Set.
     */
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("1");
        hashSet.add("3");
        hashSet.add("2");
        hashSet.add("4");

        System.out.println(hashSet);
    }
}
