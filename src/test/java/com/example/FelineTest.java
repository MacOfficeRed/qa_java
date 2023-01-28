package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class FelineTest {

    @Test
    public void eatMeatShouldReturnNonEmptyList() throws Exception {
        Feline feline = new Feline();
        List<String> actualList = feline.eatMeat();
        System.out.println(actualList);
        assertFalse("List has been empty", actualList.isEmpty());
    }

    @Test
    public void getFamilyShouldReturnStringWithFeline() {
        Feline feline = new Feline();
        String expectedString = "Кошачьи";
        String actualString = feline.getFamily();
        assertEquals("Method should return 'Кошачьи'", expectedString, actualString);
    }

    @Test
    public void getKittensWithoutParamsShouldReturnOne() {
        Feline feline = new Feline();
        int actualNumber = feline.getKittens();
        int expectedNumber = 1;
        assertEquals("getKittens without params should return 1", expectedNumber, actualNumber);
    }
}
