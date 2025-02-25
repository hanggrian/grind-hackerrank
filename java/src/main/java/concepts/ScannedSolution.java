package concepts;

import java.util.Scanner;

public class ScannedSolution extends Solution {
    public final Scanner scanner;

    public ScannedSolution(String lines) {
        scanner = new Scanner(lines);
    }
}
