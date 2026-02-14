package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
      //  Map<String, Integer> map = new HashMap<>();  //no duplicate key , no order
       // Map<String, Integer> map = new LinkedHashMap<>(); //order insertion  maintain
        Map<String, Integer> map = new TreeMap<>();    //sorted order maintain
        map.put("H", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("K", 5);
        map.put("F", 6);
        System.out.println(map);

        map.putIfAbsent("D", 14);   //if absent value then override(update) otherwise ignore.
        System.out.println(map);
    }
}
