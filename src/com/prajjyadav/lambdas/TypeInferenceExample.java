package com.prajjyadav.lambdas;

public class TypeInferenceExample {
    public static void main(String[] args) {
        StringLengthLambda myLambda = s -> s.length();
        System.out.println(myLambda.getLength("Hello World!!"));
        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLambda l ) {
        System.out.println(l.getLength("Hello World!!"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}
