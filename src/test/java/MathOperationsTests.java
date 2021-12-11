import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import javax.script.ScriptException;
import java.util.Arrays;
import java.util.stream.Stream;

public class MathOperationsTests {
    private static final int FIRST_NUM_TASK_3 = 125;
    private static final int SECOND_NUM_TASK_3 = 24;
    private static final int[] INT_ARRAY = {5, 6, 7, 12, -5, 32, 43};
    private static final int EXPECTED_SUM_OF_ARRAY = 100;
    private static final int[] INT_ARRAY_WITH_DUPLICATES = {5, 6, 7, 12, -5, 32, 43, 6, 12};
    private static final int[] EXPECTED_DUPLICATES = {6, 12};

    private static Stream<Arguments> provideOperationsForTask2() {
        return Stream.of(
                Arguments.of("-5 + 8 * 6", 43),
                Arguments.of("(55+9) % 9", 1),
                Arguments.of("20 + -3*5 / 8", 19),
                Arguments.of("5 + 15 / 3 * 2 - 8 % 3", 13)
        );
    }

    @Test
    public void task1() {
        int result = new MathOperations().getSumOfTwoNumbers(74, 36);
        Assertions.assertEquals(110, result);
        System.out.println(result);
    }

    @ParameterizedTest
    @MethodSource("provideOperationsForTask2")
    public void task2(String operation, int expected) throws ScriptException {
        int result = new MathOperations().getResultOfOperations(operation);
        Assertions.assertEquals(expected, result);
        System.out.println(result);
    }

    @Test
    public void task3Sum() {
        String result = new MathOperations().printSumOfTwoNumbers(FIRST_NUM_TASK_3, SECOND_NUM_TASK_3);
        String expectedStr = String.format("%d + %d = %d", FIRST_NUM_TASK_3, SECOND_NUM_TASK_3, FIRST_NUM_TASK_3 + SECOND_NUM_TASK_3);
        Assertions.assertEquals(expectedStr, result);
        System.out.println(result);
    }

    @Test
    public void task3Subtraction() {
        String result = new MathOperations().printSubtractionOfTwoNumbers(FIRST_NUM_TASK_3, SECOND_NUM_TASK_3);
        String expectedStr = String.format("%d - %d = %d", FIRST_NUM_TASK_3, SECOND_NUM_TASK_3, FIRST_NUM_TASK_3 - SECOND_NUM_TASK_3);
        Assertions.assertEquals(expectedStr, result);
        System.out.println(result);
    }

    @Test
    public void task3Multiply() {
        String result = new MathOperations().printMultiplicationOfTwoNumbers(FIRST_NUM_TASK_3, SECOND_NUM_TASK_3);
        String expectedStr = String.format("%d x %d = %d", FIRST_NUM_TASK_3, SECOND_NUM_TASK_3, FIRST_NUM_TASK_3 * SECOND_NUM_TASK_3);
        Assertions.assertEquals(expectedStr, result);
        System.out.println(result);
    }

    @Test
    public void task3Divide() {
        String result = new MathOperations().printDivisionOfTwoNumbers(FIRST_NUM_TASK_3, SECOND_NUM_TASK_3);
        String expectedStr = String.format("%d / %d = %d", FIRST_NUM_TASK_3, SECOND_NUM_TASK_3, FIRST_NUM_TASK_3 / SECOND_NUM_TASK_3);
        Assertions.assertEquals(expectedStr, result);
        System.out.println(result);
    }

    @Test
    public void task3Remainder() {
        String result = new MathOperations().printRemainderOfTwoNumbers(FIRST_NUM_TASK_3, SECOND_NUM_TASK_3);
        String expectedStr = String.format("%d mod %d = %d", FIRST_NUM_TASK_3, SECOND_NUM_TASK_3, FIRST_NUM_TASK_3 % SECOND_NUM_TASK_3);
        Assertions.assertEquals(expectedStr, result);
        System.out.println(result);
    }

    @Test
    public void task4SumValuesOfAnArray() {
        int result = new MathOperations().getSumValuesOfAnArray(INT_ARRAY);
        Assertions.assertEquals(EXPECTED_SUM_OF_ARRAY, result);
        System.out.println(result);
    }

    @Test
    public void task4SumValuesOfAnArrayWithStream() {
        int result = new MathOperations().getSumValuesOfAnArrayWithStream(INT_ARRAY);
        Assertions.assertEquals(EXPECTED_SUM_OF_ARRAY, result);
        System.out.println(result);
    }

    @Test
    public void task5DuplicatesOfAnArray() {
        int[] duplicatesArray = new MathOperations().getDuplicatesFromArrayOfIntegers(INT_ARRAY_WITH_DUPLICATES);
        Assertions.assertArrayEquals(EXPECTED_DUPLICATES, duplicatesArray);
        System.out.println(Arrays.toString(duplicatesArray));
    }
}
