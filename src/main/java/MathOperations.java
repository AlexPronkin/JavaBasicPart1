import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.Arrays;

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
        return Arrays.stream(intArray).sum();
    }

    public int[] getDuplicatesFromArrayOfIntegers(int[] intArray) {
        ArrayList<Integer> duplicatesArrayList = new ArrayList<>();
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] == (intArray[j])) {
                    duplicatesArrayList.add(intArray[i]);
                }
            }
        }
        int[] duplicatesArray = new int[duplicatesArrayList.size()];
        for (int i = 0; i < duplicatesArrayList.size(); i++)
        {
            duplicatesArray[i] = duplicatesArrayList.get(i);
        }
        return duplicatesArray;
    }
}