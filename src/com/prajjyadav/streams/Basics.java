package com.prajjyadav.streams;

import com.prajjyadav.lambdas.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Basics {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("jack","jones", 23),
                new Person("conny","cones", 12),
                new Person("casey","ces", 32),
                new Person("jake","joe", 44),
                new Person("jimmy","joe", 44),
                new Person("james","joe", 44)
        );

        // common streams methods
        // filter, sort, allMatch, anyMatch, noneMatch, max, min, group

        // stream always have terminating condition without which it will not start processing
        // forEach and count acts as terminating condition
        people.stream()
                .filter(p->p.getAge()>20)
                .forEach(p -> System.out.println(p.getFirstName()));

        long count = people.parallelStream()
                .filter(p->p.getLastName().startsWith("j"))
                .count();

        System.out.println(count);

        List<Person> old = people.stream()
                .filter(p -> p.getAge()>30)
                .collect(Collectors.toList());

        old.forEach(System.out::println);

        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getFirstName).reversed())
                .collect(Collectors.toList());

        people.stream().max(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);

        // can also use Collectors.toMap(p->p.getFirstName(), p->p)
        Map<String, List<Person>> groupByLastName = people.stream().collect(Collectors.groupingBy(Person::getLastName));

        groupByLastName.forEach((lastName, peoples) -> {
            System.out.print(lastName+": ");
            peoples.forEach(p -> System.out.print(p.getFirstName()+", "));
            System.out.println();
        });
    }
}
