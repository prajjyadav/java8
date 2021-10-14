package com.prajjyadav.collections;

import java.util.*;

public class ListDemo {
    public static void main(String[] args){


        // we can compare linked list with Array using timing
//        System.currentTimeMillis();

        // collections interface provides:
        // add, isEmpty, clear, size
        // remove-> remove first occurrence,
        // stream -> returns sequential elements
        // toArray, hashCode, equals(Obj x), iterator, max, contains

        // just like Arraylist but thread safe ie synchronise
        Vector<Integer> v = new Vector<>();

        // allows null element insertion as well
        LinkedList<Integer> list = new LinkedList<>();
        // stack extends vector
        Stack<Integer> stack = new Stack<>();
        // default capacity 10 everytime doubles when extended
        ArrayList<String> list1 = new ArrayList<>(20);

        // can store any type of data
        ArrayList list2 = new ArrayList();

        list1.add("john");
        list1.add("joe");
        list1.add("jane");
        list1.add("jennie");

        Student s = new Student();
        s.name="Prajjwal";
        s.roll=1;

        list2.add("hello");
        list2.add(10);
        list2.add(s);

        System.out.println("list1 "+ list1);
        System.out.println("list2 "+ list2) ;

        String name= list1.get(2);
        System.out.println("name " + name);

        Object o = list2.get(2);
        System.out.println("object " + o);

        list1.set(2,"jack");
        System.out.println("new name"+ list1.get(2));

        list1.remove(2);
        System.out.println("new list1"+ list1);

//        list1.clear();

        if(list1.contains("john")){
            System.out.println("john is in list ");
        }

        System.out.println(list1.size());
        // we can't add or remove element while iterating like this
        for(String element: list1){
            System.out.println(element);

            // not allowed
            // list1.remove(2);
        }

        // similarly iterator can be created for list2
        Iterator it = list1.iterator();
        Object obj = it.next();
        System.out.println("generic iterator" + obj.toString());



        Iterator<String> itr1 = list1.iterator();
        System.out.println(itr1.next());
        System.out.println(itr1.next());
        Iterator<String> itr = list1.iterator();
        // though we can remove while iterating but we can't add, use ListIterator for that purpose
        while(itr.hasNext()){
            String element = itr.next();
            System.out.println(element);
            if(element.equals("john")){
                itr.remove();
            }
        }
        System.out.println("list after removing john "+list1);

        Class newClass =  new Class();
        for(String stu: newClass){
            System.out.println(stu);
        }

    }
}
