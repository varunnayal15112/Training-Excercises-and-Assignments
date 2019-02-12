package com.mavenproject.first;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathsOperationsTest {

    MathsOperations mathsOperations;

    @Before
    public void init() {
         mathsOperations = new MathsOperations();
    }

    @Test
    public void additionTest() {
        int sumResult = mathsOperations.addition(5,10);
        Assert.assertEquals(15,sumResult);
    }

    @Test
    public void subtractionTest() {
        int subResult = mathsOperations.subtraction(10,5);
        Assert.assertEquals(5,subResult);
    }

    @Test
    public void multiplicationTest() {
        int multiResult = mathsOperations.multiplication(5,10);
        Assert.assertEquals(50,multiResult);
    }

    @Test
    public void divisionTest() {
        int divResult = mathsOperations.division(10,2);
        Assert.assertEquals(5,divResult);
    }



}
