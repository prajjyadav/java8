package com.prajjyadav.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args){
//        LinkedHashSet<String> set = new LinkedHashSet<>();
        // treeset implements SortedSet interface
//        TreeSet<String> set = new TreeSet<>();

//        can allow insertion of null elements as well
        // for using custom objects it must implement comparable and define hashCode and equals
        HashSet<String> set = new HashSet<>();
//        HashSet<String> set1 = new HashSet<>(set);

        // for getting common elements in set ie intersection
//        set.retainAll(set1);
        // difference
//        set.removeAll(set1)

        set.add("john");
        set.add("jake");
        set.add("jack");
        set.add("john");
        set.add("jake");
//        set.add(null);  only allowed in hash set

        System.out.println("set is "+set);

        Iterator<String> itr = set.iterator();
        System.out.println(itr.next());

        for(String name: set){
            System.out.println(name);
        }

        set.remove("john");
        if(set.contains("jake"))
            System.out.println("jake is here");

        System.out.println("size "+ set.size());
//        only for SortedSet
//        System.out.println("first "+ set.first());
//        System.out.println("last "+ set.last());


        // here ana 2 and ana 4 are considered equal because we are just comparing names in compareTo func of Student
        // this problem will resolve if we use HashSet instead of TreeSet since TreeSet uses compareTo while hashSet uses hashCode and equals
        TreeSet<Student> studentsSet = new TreeSet<>();
        studentsSet.add(new Student("amy",1));
        studentsSet.add(new Student("ana",2));
        studentsSet.add(new Student("amanda",3));
        studentsSet.add(new Student("ana",4));
        studentsSet.add(new Student("any",5));
        studentsSet.add(new Student("ang",6));

        for(Student stu: studentsSet)
            System.out.println(stu);
    }
}
