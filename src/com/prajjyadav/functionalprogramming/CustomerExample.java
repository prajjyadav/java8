package com.prajjyadav.functionalprogramming;

import java.time.LocalDate;

import static com.prajjyadav.functionalprogramming.CustomerValidator.*;

public class CustomerExample {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice", "alice@gmail.com", "+023548234",
                LocalDate.of(2000,1,1));

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);
        System.out.println(result);

        if(result!=ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
