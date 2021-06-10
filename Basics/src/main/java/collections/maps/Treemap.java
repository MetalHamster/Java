package collections.maps;

import java.util.TreeMap;

public class Treemap {
    /* INFO
    1. Stores data in (Key/Value) pairs
    2. Only unique keys
    3. Identical values allowed
    4. Sorted by keys (ascending)
     */

    /*
    .clear()	            The method removes all mappings from this TreeMap and clears the map.

    .containsKey("key")	    Returns true if this map contains a mapping for the specified key.
    .containsValue("value")	Returns true if this map maps one or more keys to the specified value.

    .entrySet()	            Returns a set view of the mappings contained in this map.
    .firstKey()	            Returns the first (lowest) key currently in this sorted map.
    .lastKey()	            Returns the last (highest) key currently in this sorted map.
    .get("key")	            Returns the value to which this map maps the specified key.
    .keySet()	            The method returns a Set view of the keys contained in the treemap.

    .put("key", "value")	The method is used to insert a mapping into a map.
    .remove("key")	        Removes the mapping for this key from this TreeMap if present.
    .size()	                Returns the number of key-value mappings in this map.
    .values()	            Returns a collection view of the values contained in this map.
     */

    public static void main(String[] args) {
        TreeMap<String, String> food = new TreeMap<>();

        food.put("lunch","eggs");
        food.put("breakfast","bacon");

        //Sorted by keys (ascending)
        System.out.println(food.entrySet());

    }
}
