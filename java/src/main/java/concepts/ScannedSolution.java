package concepts;

import java.util.Scanner;

public class ScannedSolution extends Solution {
    protected final Scanner scanner;

    public ScannedSolution(final String lines) {
        scanner = new Scanner(lines);
    }

    @Override
    public final String getResult() {
        scanner.close();
        return super.getResult();
    }
}
