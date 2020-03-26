package se.disabledsecurity.challenge.fizzbuzz;

import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {

        IntStream.rangeClosed(1, 100)
                .mapToObj(x -> x % 15 == 0 ? "FizzBuzz" : x % 5 == 0 ? "Buzz" : x % 3 == 0 ? "Fizz" : x)
                .forEach(System.out::println);


    }

}
