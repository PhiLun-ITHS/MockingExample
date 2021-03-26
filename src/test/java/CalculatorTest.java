import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void beforeEachTest() {
        calculator = new Calculator();
    }

    @Test
    void shouldReturnZeroOnEmptyString() {
        assertEquals(calculator.add(""), 0);
    }

    @Test
    void shouldReturnSingleNumber() {
        assertEquals(calculator.add("1"), 1);
    }

    @Test
    void shouldReturnSumOfTwoNumbers() {
        assertEquals(calculator.add("1,2"), 3);
    }

    @Test
    void shouldReturnSumOfMultipleNumbers() {
        assertEquals(calculator.add("1, 2, 3"), 6);
    }

    @Test
    void shouldReturnSumOfMultipleNumbersWithNewLine() {
        assertEquals(calculator.add("1\n2,3"), 6);
    }

    @Test
    void shouldThrowRuntimeExceptionWhenNegativeNumberAdded() {
        assertThrows(RuntimeException.class,
                () -> {
                    calculator.add("2, -4, 2");
                });
    }

    @Test
    void shouldIgnoreNumbersAbove1000() {
        assertEquals(calculator.add("4, 5, 2000"), 9);
    }

    @Test
    void shouldReturnSumOfNumbersWithOtherDelimiters () {
        assertEquals(calculator.add("..;;1, ///...;;;2,**[]****3"), 6);
    }

    @Test
    void shouldReturnSumOfNumbersWithOtherDelimiters2 () {
        assertEquals(calculator.add("//[delim1][delim2]\\n"), 3);
    }
}