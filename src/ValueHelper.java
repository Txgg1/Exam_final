import java.util.HashMap;
import java.util.Map;

public class ValueHelper {
    public static int getValueNumeric(char valueChar) {
        Map<Character, Integer> valueMap = new HashMap<>();
        valueMap.put('2', 2);
        valueMap.put('3', 3);
        valueMap.put('4', 4);
        valueMap.put('5', 5);
        valueMap.put('6', 6);
        valueMap.put('7', 7);
        valueMap.put('8', 8);
        valueMap.put('9', 9);
        valueMap.put('T', 10);
        valueMap.put('J', 11);
        valueMap.put('Q', 12);
        valueMap.put('K', 13);
        valueMap.put('A', 14);

        return valueMap.get(valueChar);
    }
}
