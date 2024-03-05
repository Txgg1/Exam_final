public class AsciiArt {
    public static String getCardAsciiArt(String card) {
        char valueChar = card.charAt(0);
        char suitChar = card.charAt(1);

        String valueAsciiArt = getValueAsciiArt(valueChar);
        String suitAsciiArt = getSuitAsciiArt(suitChar);

        return valueAsciiArt + suitAsciiArt;
    }

    private static String getValueAsciiArt(char valueChar) {
        switch (valueChar) {
            case '2':
                return " _______\n|2      |\n|       |\n|   O   |\n|       |\n|_______|";
            case '3':
                return " _______\n|3      |\n|   O   |\n|       |\n|   O   |\n|_______|";
            case '4':
                return " _______\n|4      |\n| O   O |\n|       |\n| O   O |\n|_______|";
            case '5':
                return " _______\n|5      |\n| O   O |\n|   O   |\n| O   O |\n|_______|";
            case '6':
                return " _______\n|6      |\n| O   O |\n| O   O |\n| O   O |\n|_______|";
            case '7':
                return " _______\n|7      |\n| O O O |\n|   O   |\n| O O O |\n|_______|";
            case '8':
                return " _______\n|8      |\n| O O O |\n| O   O |\n| O O O |\n|_______|";
            case '9':
                return " _______\n|9      |\n| O O O |\n| O O O |\n| O O O |\n|_______|";
            case 'T':
                return " _______\n|10     |\n|   O   |\n| O   O |\n|   O   |\n|_______|";
            case 'J':
                return " _______\n|J      |\n|   O   |\n| O O O |\n|   O   |\n|_______|";
            case 'Q':
                return " _______\n|Q      |\n| O O O |\n| O   O |\n| O O O |\n|_______|";
            case 'K':
                return " _______\n|K      |\n| O   O |\n| O O   |\n| O   O |\n|_______|";
            case 'A':
                return " _______\n|A      |\n| O   O |\n| O O O |\n| O   O |\n|_______|";
            default:
                return "";
        }    }

    private static String getSuitAsciiArt(char suitChar) {
        switch (suitChar) {
            case 'S':
                return "  / \\  \n |. .|\n  \\_/  ";
            case 'H':
                return " /_\\/\n | | |\n | | |";
            case 'D':
                return "  / \\  \n | V |\n  \\_/  ";
            case 'C':
                return " /_\\/\n  / \\ \n |___|";
            default:
                return "";
        }    }
}
