package com.prajjyadav.collections;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args){

        // special value vs exception
        // offer vs add
        // peek vs examine
        // poll vs remove

        // Dequeue implements queue
        // implements Deque interface
        ArrayDeque<Integer> q = new ArrayDeque<>();
        // dequeue supports pollFirst pollLast peekFirst peekLast

        // linked list implements Dequeue interface
        Deque<Integer> list = new LinkedList<>();


        // sort the data for us, lowest priority first
        // implements queue
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i=10;i>0;i--){
            queue.add(i);
        }

        // sorts itself and becomes 1 2 3 4 5 6 7 8 9 10
        // peeking: obtaining head
        // polling: removing head

        System.out.println("queue size "+queue.size());
        System.out.println(queue.peek());
        queue.poll();
        System.out.println("queue size "+queue.size());
        System.out.println(queue.peek());


    }
}
