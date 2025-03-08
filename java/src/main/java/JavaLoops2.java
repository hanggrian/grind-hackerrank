import concepts.ScannedSolution;
import java.util.Scanner;

class JavaLoops2 extends ScannedSolution {
    JavaLoops2(final String lines) {
        super(lines);
        while (scanner.hasNext()) {
            final Scanner lineScanner = new Scanner(scanner.nextLine());
            if (!lineScanner.hasNext()) {
                lineScanner.close();
                continue;
            }
            int a = lineScanner.nextInt();
            System.out.println(a);
            if (!lineScanner.hasNext()) {
                lineScanner.close();
                continue;
            }
            final int b = lineScanner.nextInt();
            System.out.println(b);
            if (!lineScanner.hasNext()) {
                lineScanner.close();
                continue;
            }
            final int n = lineScanner.nextInt();
            int left = 0;
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    left = a + (int) Math.pow(2, i) * b;
                } else {
                    left += (int) Math.pow(2, i) * b;
                }
                print(left);
                if (i < n - 1) {
                    print(' ');
                }
            }
            println();
            lineScanner.close();
        }
    }
}
