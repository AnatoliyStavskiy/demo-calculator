package by.itacademy.stavskiy;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void TestSumPositive(){
        int a = calculator.sum(2,3);
        Assertions.assertEquals(5, a);
    }

    @Test
    public void TestSumNegative2(){
        int a = calculator.sum(-350,-150);
        Assertions.assertEquals(-500, a);
    }

    @Test
    public void TestSumZero3(){
        int a = calculator.sum(0,0);
        Assertions.assertEquals(0, a);
    }

    @Test
    public void TestSubtractPositive(){
        int a = calculator.subtract(10, 5);
        Assertions.assertEquals(5, a);
    }

    @Test
    public void TestSubtractNegative2(){
        int a = calculator.subtract(-1000, 500);
        Assertions.assertEquals(-1500, a);
    }

    @Test
    public void TestSubtractZeroPositive3(){
        int a = calculator.subtract(0, 500);
        Assertions.assertEquals(-500, a);
    }

    @Test
    public void TestSubtractZeroNegative4(){
        int a = calculator.subtract(0, -500);
        Assertions.assertEquals(500, a);
    }

    @Test
    public void TestDividePositive(){
        int a = calculator.divide(100, 4);
        Assertions.assertEquals(25, a);
    }

    @Test
    public void TestDivideNegative2(){
        int a = calculator.divide(-10, -2);
        Assertions.assertEquals(5, a);
    }

    @Test
    public void TestDivideZero3(){
        int a = calculator.divide(0, 2);
        Assertions.assertEquals(0, a);
    }

    @Test
    public void TestDivideZero4(){
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(2, 0);
        });
    }

    @Test
    public void TestDivideDoubleZero5(){
        Assertions.assertThrows(ArithmeticException.class, () -> {
        calculator.divide(0, 0);
        });
    }

    @Test
    public void TestMultiplyPositive(){
        int a = calculator.multiply(5,2);
        Assertions.assertEquals(10, a);
    }

    @Test
    public void TestMultiplyNegative(){
        int a = calculator.multiply(-100,-2);
        Assertions.assertEquals(200, a);
    }

    @Test
    public void TestMultiplyPositiveNegative(){
        int a = calculator.multiply(50,-2);
        Assertions.assertEquals(-100, a);
    }

    @Test
    public void TestMultiplyZero(){
        int a = calculator.multiply(1,0);
        Assertions.assertEquals(0, a);
    }
}
