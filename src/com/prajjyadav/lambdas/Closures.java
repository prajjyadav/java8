package com.prajjyadav.lambdas;

public class Closures {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        doProcess(a, new Process() {
            @Override
            public void process(int i) {
                // we can't change the value of b here because of the concept of closure
                // it considers b to be a final variable
                // this happens because we are not running this block here, instead running in doProcess
                // b = 20  ->  not allowed
                System.out.println(i+b);
            }
        });
    }

    public static void doProcess(int a, Process p) {
        p.process(a);
    }

}
interface Process{
    void process(int i);
}
