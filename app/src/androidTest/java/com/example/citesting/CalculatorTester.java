package com.example.citesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTester {
    @Test
    public void addTwoOPass(){
        Calculator calc = new Calculator();
        int sum = calc.addTwo(3,4);
        assertEquals(sum, 7);
    }


}
