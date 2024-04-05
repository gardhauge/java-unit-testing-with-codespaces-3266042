import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int expected = 3;

        int actual = calculator.add(1, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int expected = 3;

        int actual = calculator.subtract(5, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 6;

        int actual = calculator.multiply(2, 3);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        int expected = 2;

        int actual = calculator.divide(6, 3);

        assertEquals(expected, actual);
    }

    @Test
    public void testIsEven() {
        assertTrue(calculator.isEven(2));
    }

    @Test
    public void testIsOdd() {
        assertFalse(calculator.isEven(3));
    }

    @Test
    public void testIncrementArray() {
        int[] expected = new int[] { 2, 3, 4 };
        int[] actual = calculator.testIncrementArray(new int[] { 1, 2, 3 });
        assertArrayEquals(expected, actual);
    }

}
