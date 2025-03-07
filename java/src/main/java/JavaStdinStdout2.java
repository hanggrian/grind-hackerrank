import concepts.ScannedSolution;

class JavaStdinStdout2 extends ScannedSolution {
    JavaStdinStdout2(String lines) {
        super(lines);
        int i = Integer.parseInt(scanner.nextLine());
        double d = Double.parseDouble(scanner.nextLine());
        String s = scanner.nextLine();
        println("String: %s", s);
        println("Double: %s", String.valueOf(d));
        println("Int: %d", i);
    }
}
