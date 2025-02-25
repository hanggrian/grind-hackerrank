import concepts.ScannedSolution;

class JavaIfElse extends ScannedSolution {
    JavaIfElse(String lines) {
        super(lines);
        int n = scanner.nextInt();
        if (n % 2 == 1) {
            println("Weird");
        } else if (n >= 2 && n <= 5) {
            println("Not Weird");
        } else if (n >= 6 && n <= 20) {
            println("Weird");
        } else if (n > 20) {
            println("Not Weird");
        } else {
            println("Weird");
        }
    }
}
