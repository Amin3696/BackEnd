package at.reflectionweek2.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeAccumulatorTest {
    @Autowired
    PrimesCollection primesCollection;

    @Autowired
    PrimeAccumulator primeAccumulator;

    @Test
    public void accumulatePrimes() {
        List<Integer> inputCollection = primesCollection.producePrimeNumbers(100);
        Integer actual = primeAccumulator.accumulatePrimes(inputCollection);
        Integer expected = 24133;

        assertEquals(expected, actual);

    }
}