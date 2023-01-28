package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineGetKittensParamsTest {
    private final int actualKittensCount;
    private final int expectedKittensCount;

    public FelineGetKittensParamsTest(int expectedKittensCount, int actualKittensCount) {
        this.expectedKittensCount = expectedKittensCount;
        this.actualKittensCount = actualKittensCount;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getKittensArray() {
        return Arrays.asList(new Object[][]{
                // {expected number of kittens, actual number of kittens}
                {-1, -1},
                {0, 0},
                {1, 1},
                {147, 147},
                {9999, 9999}
        });
    }

    @Test
    public void getKittensParamsTest() {
        Feline feline = new Feline();
        int actualNumber = feline.getKittens(actualKittensCount);
        System.out.println("expected " + expectedKittensCount + " actual " + actualNumber);
        assertEquals("Expected number is " + expectedKittensCount + " but found " + actualNumber, expectedKittensCount, actualNumber);
    }
}