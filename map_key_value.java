package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class map_key_value {
    public static void main(String[] args) {


   // Map<String, Integer> mp = new HashMap<String, Integer>(); {
        Map<String, Integer> mp = new TreeMap<String, Integer>();{
        mp.put("one",1);
        mp.put("two",2);
        mp.put("three",3);
        mp.put("four",4);
        System.out.println(mp);
        if(!mp.containsKey("two")){
            mp.put("two",23);
            System.out.println(mp);
        }
       /* mp.putIfAbsent("two",23);
        System.out.println(mp);
*/
            //Iterator
for(Map.Entry<String, Integer> e: mp.entrySet()) {
    System.out.println(e);

    System.out.println(e.getKey());
    System.out.println(e.getValue());

for(String key: mp.keySet()){

    System.out.println(key);
}

for(Integer value:mp.values()){
    System.out.println(value);
}
    System.out.println(mp.containsKey("three"));
    System.out.println(mp.containsValue(2));
    System.out.println(mp.isEmpty());
    System.out.println(mp.hashCode());
   // System.out.println(mp.merge();
}
    }
}
}
