package com.prajjyadav.lambdas;

public class RunnableLambda {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable");
            }
        });

        myThread.start();

        Thread myLamdbaThread = new Thread(() -> System.out.println("labda thread"));
        myLamdbaThread.run();
    }

}
