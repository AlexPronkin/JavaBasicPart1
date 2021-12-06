import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MathOperations {

    public int getSumOfTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public int getResultOfOperations(String operation) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        return (int) engine.eval(operation);
    }

    public String printSumOfTwoNumbers(int num1, int num2) {
        return String.format("%d + %d = %d", num1, num2, num1 + num2);
    }

    public String printSubtractionOfTwoNumbers(int num1, int num2) {
        return String.format("%d - %d = %d", num1, num2, num1 - num2);
    }

    public String printMultiplicationOfTwoNumbers(int num1, int num2) {
        return String.format("%d x %d = %d", num1, num2, num1 * num2);
    }

    public String printDivisionOfTwoNumbers(int num1, int num2) {
        return String.format("%d / %d = %d", num1, num2, num1 / num2);
    }

    public String printRemainderOfTwoNumbers(int num1, int num2) {
        return String.format("%d mod %d = %d", num1, num2, num1 % num2);
    }

    public int getSumValuesOfAnArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public int getSumValuesOfAnArrayWithStream(int[] intArray) {
        IntStream intStream = Arrays.stream(intArray);
        return intStream.sum();
    }

    public int[] getDuplicatesFromArrayOfIntegers(int[] intArray) {
        ArrayList<Integer> duplicatesArray = new ArrayList<>();
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] == (intArray[j])) {
                    duplicatesArray.add(intArray[i]);
                }
            }
        }
        return duplicatesArray.stream().mapToInt(i -> i).toArray();
    }
}
