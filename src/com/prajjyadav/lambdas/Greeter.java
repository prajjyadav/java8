package com.prajjyadav.lambdas;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting helloWorldGreeter = new HelloWorldGreeting();
        Greeting lambdaGreeting = () -> System.out.println("Hello World!!");
        Greeting innerGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World!!");
            }
        };


        greeter.greet(helloWorldGreeter);
        greeter.greet(lambdaGreeting);
        greeter.greet(innerGreeting);
        greeter.greet(() -> System.out.println("Hello World!!") );

    }
}
