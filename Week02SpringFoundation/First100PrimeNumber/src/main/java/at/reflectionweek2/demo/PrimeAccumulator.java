package at.reflectionweek2.demo;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PrimeAccumulator {
    public Integer accumulatePrimes(List<Integer> primes) {
        return primes.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
