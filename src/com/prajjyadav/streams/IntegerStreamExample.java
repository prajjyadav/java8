package com.prajjyadav.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegerStreamExample {
    public static void main(String[] args) {
        int[] nums = { 2,4,5,213,3242,2,423};

        // min, max, average, count, sum
        int asInt = IntStream.of(nums).max().getAsInt();

        // min will throw exception if array is empty hence ifPresent is used
        IntStream.of(nums).min().ifPresent(System.out::println);

        IntStream.of(nums)                              // creating stream
                .distinct().sorted().limit(3).          // processing stream
                forEach(System.out::println);           // consuming stream

        // a is running sum, b is element, 0 is starting sum
        int sum = IntStream.of(nums).reduce(0, (a,b)->a+b);
        System.out.println("sum of array is "+ sum);
        // ------------------- Creating Stream ------------------- //
        // of(nums)                 from array
        // .range(1,101)            1..100
        // .rangeClosed(1,100)      1..100
        // .generate(supplier());

        // ------------------- Process Stream ------------------- //
        // distinct, sorted, limit, skip, anyMatch, findFirst, flatMap,
        // filter(num -> num%2==0)
        // map(num -> num*2)
        // boxed()   convert int to Integer

        // -------------------- Consume Stream ------------------ //
        // average, min, max, sum, count, summaryStatistics, reduce
        // forEach(lambda), toArray(), .boxed.collect(Collectors.toList())
        // anyMatch(predicate), allMatch(predicate)

        // Collectors.joining(",")
        // groupingBy(Person::getLastName(), Collectors.counting())

        // we can even have something like
        Stream<String> bands = null;
        try {
            bands = Files.lines(Paths.get("singers.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // print only singers that have a language
        bands.map(x->x.split(":")).filter(x->x.length==2).forEach(x-> System.out.println(x[0]+":"+x[1]));
    }

}
