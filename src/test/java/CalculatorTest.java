import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.cjbdevlabs.Calculator;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testSum() {
        var expected = 3;
        var actual = calculator.sum(1, 2);
        assertEquals(expected, actual);
    }

    @Test
    void testSubtract() {
        var expected = 1;
        var actual = calculator.substract(2, 1);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMultiply() {
        var expected = 6;
        var actual = calculator.multiply(2, 3);
        assertEquals(expected, actual);
    }

    @Test   
    void testDivide() {
        var expected = 2;
        var actual = calculator.divide(4, 2);
        assertEquals(expected, actual);
    }

    @Test
    void testIsEven() {
        var actual = calculator.isEven(2);
        assertTrue(actual);
    }

    @Test
    void testIsOdd() {
        var actual = calculator.isEven(1);
        assertFalse(actual);
    }

    @Test
    void testIncrementArray() {
        var expected = new int[] {2, 3, 4};
        var actual = calculator.incrementArray(new int[] {1, 2, 3});
        assertArrayEquals(expected, actual);
    }

    @Test
    void testDivideByZero() {
        var exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
        var expected = "Ints cannot be divided by zero";
        var actual = exception.getMessage();
        assertEquals(expected, actual);
    }
}
