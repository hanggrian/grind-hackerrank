import concepts.ScannedSolution;

final class JavaLoops1 extends ScannedSolution {
    JavaLoops1(final String lines) {
        super(lines);
        final int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            println("%d x %d = %d", n, i, n * i);
        }
    }
}
