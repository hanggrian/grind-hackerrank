import concepts.ScannedSolution;

final class JavaStdinStdout2 extends ScannedSolution {
    JavaStdinStdout2(final String lines) {
        super(lines);
        final int i = Integer.parseInt(scanner.nextLine());
        final double d = Double.parseDouble(scanner.nextLine());
        final String s = scanner.nextLine();
        println("String: %s", s);
        println("Double: %s", String.valueOf(d));
        println("Int: %d", i);
    }
}
