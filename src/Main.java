import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // PARTIE 1 --------------------------------------
        Partie1 hand1 = new Partie1("KS 2H 5C JD TD");
        Partie1 hand2 = new Partie1("QS 2H 5C JD TD");

        Result result = hand1.compareWith(hand2);
        System.out.println(result);

        // PARTIE 2 --------------------------------------
        ArrayList<Partie2> handsTri = new ArrayList<>();
        handsTri.add(new Partie2("KS 2H 5C JD TD"));
        handsTri.add(new Partie2("2C 3C AC 4C 5C"));
        Collections.sort(handsTri);

        for (Partie2 handTri : handsTri) {
            System.out.println(handTri);
        }

        // PARTIE 3 --------------------------------------
        ArrayList<Partie3> handsAscii = new ArrayList<>();
        handsAscii.add(new Partie3("KS 2H 5C JD TD"));
        handsAscii.add(new Partie3("2C 3C AC 4C 5C"));
        Collections.sort(handsAscii);

        for (Partie3 handAscii : handsAscii) {
            System.out.println(handAscii);
        }

        // PARTIE 4 --------------------------------------
        FileHandler fileHandler = new FileHandler();
        ArrayList<Partie4> hands = fileHandler.readHandsFromFile("src/txt/input.txt");
        Collections.sort(hands);
        fileHandler.writeHandsToFile(hands, "src/txt/output.txt");
    }

}
