package com.prajjyadav.functionalprogramming;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        // function.apply() -> take one and output one, biFunction -> take two and output one
        int num1 = incrementByOne.apply(1);
        System.out.println(num1);

        Function<Integer, Integer> newFunc = incrementByOne.andThen(multiplyBy10).andThen(incrementByOne);
        int num2 = newFunc.apply(4);
        System.out.println(num2);

        // consumer.accept() -> takes one and does not return anything

        // predicate.test() -> takes a condition and returns a boolean
        // can also combine two predicates using predicate.and(predicate) & predicate.or(predicate)

        // supplier.get() -> takes nothing but returns something
        

    }
    static Function<Integer, Integer> incrementByOne = num -> num+1;

    static Function<Integer, Integer> multiplyBy10 = num -> num*10;


}
