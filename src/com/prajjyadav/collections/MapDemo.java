package com.prajjyadav.collections;

import java.util.*;

public class MapDemo {
    public static void main(String[] args){

        // we can even use customs objects in map and set but we need to implement equals and hascode methods
        // allows null value insertion as well
        HashMap<String,Integer> hm = new HashMap<>();
        LinkedHashMap<String,String> lhm = new LinkedHashMap<>();
        TreeMap<String, Integer> tm = new TreeMap<>();
        // containsKey, containsValue, isEmpty

        hm.put("one",1);
        hm.put("two",2);
        // can also have Iterator<?> itr = hm.entrySet().iterator() but then type cast whenever needed
        for(Iterator<Map.Entry<String,Integer>> itr = hm.entrySet().iterator(); itr.hasNext();){
            Map.Entry<String, Integer> m = itr.next();
            System.out.println("key "+ m.getKey()+" value "+ m.getValue());
        }

        for(Map.Entry<String,Integer> entry: hm.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

        for(String key: hm.keySet()){
            System.out.println(key+": "+hm.get(key));
        }

    }
}
