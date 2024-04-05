import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int expected = 3;
        int actual = calculator.add(1, 2);

        assertEquals(expected, actual);
    }

    @Test
    void testDivide() {
        int expected = 5;
        int actual = calculator.divide(10, 2);

        assertEquals(expected, actual);

    }

    @Test
    void testDivideDecimal() {
        int expected = 3;
        int actual = calculator.divide(10, 3);

        assertEquals(expected, actual);

    }

    @Test
    void testMultiply() {
        int expected = 20;
        int actual = calculator.multiply(10, 2);

        assertEquals(expected, actual);
    }

    @Test
    void testSubtract() {
        int expected = 8;
        int actual = calculator.subtract(10, 2);

        assertEquals(expected, actual);
    }

}
