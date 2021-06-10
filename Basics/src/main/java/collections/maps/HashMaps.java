package collections.maps;

import java.util.HashMap;

public class HashMaps {
    /* INFO
    1. Stores data in (Key/Value) pairs
    2. Only unique keys
    3. Identical values allowed
    4. Maintains no order (no index)
    5. HashMap is faster than HashSet.
     */

    /* METHODS
    .clear()                    //removes all of the mappings from this map.
    .containsKey("key")         //returns true if this map contains a mapping for the specified key.
    .containsValue("value")     //returns true if this map maps one or more keys to the specified value.
    .entrySet()                 //returns a Set view of the mappings contained in this map.
    .get("key")                 //returns the value to which the specified key is mapped
    .put("key", "value")        //associates the specified value with the specified key in this map.
    .remove("key")              //removes the mapping for the specified key from this map if present.
    .size()                     //returns the number of key-value mappings in this map.
    .values()                   //returns a Collection view of the values contained in this map.
     */


    public static void main(String[] args) {
        HashMap<String, String> food = new HashMap<>();
        String essen ="essen";
        String drinken ="cola";

        food.put("lunch","egg");
        food.put("breakfast","egg");
        food.put(essen, drinken);

        System.out.println(food.get("lunch"));
        System.out.println(food.get("breakfast"));
        System.out.println(food.entrySet());

    }
}
