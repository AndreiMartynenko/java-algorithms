import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = null;
        int wordCount = 0;

        while (!StdIn.isEmpty()) {
            String currentWord = StdIn.readString();
            wordCount++;

            // Knuth's method: Select the current word with probability 1/i
            if (StdRandom.bernoulli(1.0 / wordCount)) {
                champion = currentWord;
            }
        }

        // Print the surviving champion
        StdOut.println(champion);
    }
}
