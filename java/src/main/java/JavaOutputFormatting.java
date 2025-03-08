import concepts.ScannedSolution;

class JavaOutputFormatting extends ScannedSolution {
    private static final String BORDERS = "================================";

    JavaOutputFormatting(final String lines) {
        super(lines);
        println(BORDERS);
        for (int i = 0; i < 3; i++) {
            String s = scanner.next();
            int x = scanner.nextInt();
            StringBuilder sb = new StringBuilder();
            sb.append(s);
            for (int j = s.length(); j < 15; j++) {
                sb.append(" ");
            }
            sb.append(String.format("%03d", x));
            println(sb);
        }
        println(BORDERS);
    }
}
