import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void beforeEachTest() {
        calculator = new Calculator();
    }

    @Test
    void emptyString() {
        assertEquals(calculator.add(""), 0);
    }

    @Test
    void singleNumber() {
        assertEquals(calculator.add("1"), 1);
    }

    @Test
    void twoNumbers() {
        assertEquals(calculator.add("1,2"), 3);
    }

    @Test
    void multipleNumbers() {
        assertEquals(calculator.add("1, 2, 3"), 6);
    }

    @Test
    void multipleNumbersWithNewLine() {
        assertEquals(calculator.add("1\n2,3"), 6);
    }

}