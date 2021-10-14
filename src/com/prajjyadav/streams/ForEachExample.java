package com.prajjyadav.streams;

import com.prajjyadav.lambdas.Person;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("jack","jones", 23),
                new Person("conny","cones", 12),
                new Person("casey","ces", 32),
                new Person("jake","joe", 44)
        );

        // ------------------- External Iterators ------------------- //
        // we control the iteration process

        // for loop
        for(int i=0; i<people.size();i++)
            System.out.println(people.get(i).getFirstName());

        // for in loop
        for(Person p: people)
            System.out.println(p.getLastName());

        // ------------------- Internal Iterator ----------------------- //
        // we left the iteration process to JVM
        people.forEach(System.out::println);
        people.forEach(p -> p.setLastName("jones"));
        people.forEach(System.out::println);
    }
}
