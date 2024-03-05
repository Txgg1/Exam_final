import java.util.Arrays;


public class Partie4 implements Comparable<Partie4> {
    private String hand;

    public Partie4(String hand) {
        this.hand = hand;
    }

    public Result compareWith(Partie4 otherHand) {
        int[] thisHandValues = getHandValues(this.hand);
        int[] otherHandValues = getHandValues(otherHand.hand);

        Arrays.sort(thisHandValues);
        Arrays.sort(otherHandValues);

        return compareHands(thisHandValues, otherHandValues);
    }

    private int[] getHandValues(String hand) {
        String[] cards = hand.split(" ");
        int[] values = new int[cards.length];

        for (int i = 0; i < cards.length; i++) {
            char valueChar = cards[i].charAt(0);
            values[i] = ValueHelper.getValueNumeric(valueChar);
        }

        return values;
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

    @Override
    public int compareTo(Partie4 otherHand) {
        return -compareWith(otherHand).ordinal();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        String[] cards = hand.split(" ");

        for (String card : cards) {
            result.append(AsciiArt.getCardAsciiArt(card)).append(" ");
        }

        return result.toString().trim();
    }

}
