import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Partie1 {
    private String hand;

    public Partie1(String hand) {
        this.hand = hand;
    }

    public Result compareWith(Partie1 otherHand) {
        int[] thisHandValues = getHandValues(this.hand);
        int[] otherHandValues = getHandValues(otherHand.hand);

        Arrays.sort(thisHandValues);
        Arrays.sort(otherHandValues);

        Result result = compareHands(thisHandValues, otherHandValues);
        return result;
    }

    private int[] getHandValues(String hand) {
        String[] cards = hand.split(" ");
        int[] values = new int[cards.length];

        for (int i = 0; i < cards.length; i++) {
            char valueChar = cards[i].charAt(0);
            values[i] = getValueNumeric(valueChar);
        }

        return values;
    }

    private int getValueNumeric(char valueChar) {
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

    private Result compareHands(int[] thisHandValues, int[] otherHandValues) {
        for (int i = thisHandValues.length - 1; i >= 0; i--) {
            if (thisHandValues[i] > otherHandValues[i]) {
                return Result.WIN;
            } else if (thisHandValues[i] < otherHandValues[i]) {
                return Result.LOSE;
            }
        }

        return Result.TIE;
    }


}
