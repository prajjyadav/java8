package com.prajjyadav.lambdas;

import javax.sound.midi.Soundbank;
import java.util.function.BiConsumer;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,0};
        int key=10;

        process(nums, key, wrapper((k,n)-> System.out.println(k/n)));

    }

    public static void process(int[] nums, int key, BiConsumer<Integer, Integer> consumer) {
        for(int num: nums){
            System.out.println("inside process");
            consumer.accept(key, num);
        }
    }

    public static BiConsumer<Integer, Integer> wrapper(BiConsumer<Integer,Integer> consumer) {
        return (k,n)->{
            try{
                System.out.println("inside wrapper");
                consumer.accept(k,n);
            }
            catch (ArithmeticException e){
                System.out.println("some error occurred");
            }
        };
    }
}
