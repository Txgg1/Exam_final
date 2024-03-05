import java.util.Arrays;
import java.util.Comparator;

public class Partie3 implements Comparable<Partie3> {
    private String handAscii;

    public Partie3(String handAscii) {
        this.handAscii = handAscii;
    }

    public Result compareWith(Partie3 otherHand) {
        int[] thisHandValues = getHandValues(this.handAscii);
        int[] otherHandValues = getHandValues(otherHand.handAscii);

        Arrays.sort(thisHandValues);
        Arrays.sort(otherHandValues);

        return compareHands(thisHandValues, otherHandValues);
    }

    private int[] getHandValues(String hand) {
        String[] cards = hand.split(" ");
        int[] values = new int[cards.length];

        for (int i = 0; i < cards.length; i++) {
            values[i] = ValueHelper.getValueNumeric(cards[i].charAt(0));
        }

        return values;
    }

    private Result compareHands(int[] thisHandValues, int[] otherHandValues) {
        for (int i = 0; i < thisHandValues.length; i++) {
            int thisValue = thisHandValues[i];
            int otherValue = otherHandValues[i];

            if (thisValue > otherValue) {
                return Result.WIN;
            } else if (thisValue < otherValue) {
                return Result.LOSE;
            }
        }

        return Result.TIE;
    }

    @Override
    public int compareTo(Partie3 otherHand) {
        return -compareWith(otherHand).ordinal();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        String[] cards = handAscii.split(" ");

        for (String card : cards) {
            result.append(AsciiArt.getCardAsciiArt(card)).append(" ");
        }

        return result.toString().trim();
    }

    public static Comparator<Partie3> handComparator = new Comparator<Partie3>() {
        @Override
        public int compare(Partie3 p1, Partie3 p2) {
            return p1.compareWith(p2).ordinal();
        }
    };
}