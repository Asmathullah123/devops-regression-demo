package com.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    @Tag("regression")
    public void testAdd() { assertEquals(15, calc.add(10, 5)); }

    @Test
    @Tag("smoke")
    public void testSubtract() { assertEquals(5, calc.subtract(10, 5)); }
}
