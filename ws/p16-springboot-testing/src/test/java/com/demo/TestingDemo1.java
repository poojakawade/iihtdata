package com.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class Calculator{
    public int add(int a, int b){
        return a+b;
    }
}

@SpringBootTest
public class TestingDemo1 {

    @Test
    public void testDemo() {
        Calculator cal = new Calculator();
        int expectedResult = 9;
        int actualResult = cal.add(4, 5);
        
        Assertions.assertSame(expectedResult, actualResult);
    }
    
    @Test
    public void shouldAddNegativeNums() {
        Calculator cal = new Calculator();
        int expectedResult = -9;
        int actualResult = cal.add(-4, -5);
        
        Assertions.assertSame(expectedResult, actualResult);
    }
    
}
