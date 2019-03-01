package at.reflectionweek2.demo;


import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class PrimesCollection {

    public List<Integer> producePrimeNumbers(int primeAmount) {
        return IntStream.iterate(1, i -> i + 1)
                .filter(e -> isPrime(e))
                .limit(primeAmount)
                .boxed()
                .collect(Collectors.toList());
    }

    Boolean isPrime(Integer input) {
        return IntStream.rangeClosed(1, input)
                .filter(e -> input % e == 0)
                .count() == 2;
    }
}
