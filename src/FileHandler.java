import java.io.*;
import java.util.ArrayList;


class FileHandler {
    public ArrayList<Partie4> readHandsFromFile(String filename) {
        ArrayList<Partie4> hands = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                hands.add(new Partie4(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return hands;
    }

    public void writeHandsToFile(ArrayList<Partie4> hands, String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Partie4 hand : hands) {
                bw.write(hand.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}