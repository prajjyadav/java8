package com.prajjyadav.collections;

import java.util.*;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if(len1 > len2){
            return -1;
        }
        else
            return 1;

        // for alphabetical comparision
//        return s1.compareTo(s2);
    }
}

public class CollectionsApi {
    public static void main (String[] args){
        Integer[] arr = { 2, 23, 4, 21};
        List<Integer> list = Arrays.asList(arr);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num1.compareTo(num2);
            }
        });
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

        list.toArray(arr);
        System.out.println(Arrays.toString(arr));

        List<String> animals = new ArrayList<>();
        animals.add("monkey");
        animals.add("dear");
        animals.add("lion");
        animals.add("tiger");

        Collections.sort(animals, new StringLengthComparator());

        System.out.println(animals);


    }
}
