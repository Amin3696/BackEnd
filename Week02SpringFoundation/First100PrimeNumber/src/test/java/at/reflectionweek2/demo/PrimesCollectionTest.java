package at.reflectionweek2.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PrimesCollectionTest {
@Autowired
PrimesCollection primesCollection;

    @Test
    public void producePrimeNumbers() {

        List<Integer> actual=primesCollection.producePrimeNumbers(3);
        List<Integer> expected= Arrays.asList(2,3,5);

        assertEquals(expected,actual);
    }

    @Test
    public void isPrime() {
        Boolean actual=primesCollection.isPrime(1);
        assertEquals(false,actual);

    }
}