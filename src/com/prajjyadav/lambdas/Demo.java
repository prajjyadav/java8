package com.prajjyadav.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("ack","jones", 23),
                new Person("cockey","cones", 12),
                new Person("cacky","ces", 32),
                new Person("jake","joe", 44)
        );

        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // print all
        System.out.println("all peoples");
        printConditionally(people,p -> true);

        // print people with age between 20 and 30
        System.out.println("people between 20 and 30");
        printConditionally(people,p -> p.getAge() >20 && p.getAge()<40);

        // print names of people starting with c
        System.out.println("people starting with c");
        printConditionally(people, p -> p.getFirstName().startsWith("c"));
        System.out.println("people starting with c using util function predicate");
        printConditionallyUsingUtilFunction(people, p -> p.getFirstName().startsWith("c"));
        System.out.println("same above with consumer function interface from util func Consumer");
        performConditionally(people, p -> p.getFirstName().startsWith("c"), p-> System.out.println(p.getFirstName()));

    }

    public static void printConditionally(List<Person> people, Condition condition) {
        for(Person p : people){
            if(condition.test(p))
                System.out.println(p);
        }
    }

    public static void printConditionallyUsingUtilFunction(List<Person> people, Predicate<Person> condition) {
        for(Person p : people){
            if(condition.test(p))
                System.out.println(p);
        }
    }

    public static void performConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> consumer) {
        for(Person p : people){
            if(condition.test(p))
                consumer.accept(p);
        }
    }
}

interface Condition {
    boolean test(Person p1);
}
