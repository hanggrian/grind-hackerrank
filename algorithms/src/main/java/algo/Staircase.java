package algo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class Staircase {
    private Staircase() {}

    static Collection<String> staircase(final int n) {
        if (n < 0) {
            return Collections.emptyList();
        }

        final List<String> staircase = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            final StringBuilder line = new StringBuilder();
            for (int j = 0; j < n - i; j++) {
                line.append(' ');
            }
            for (int k = 0; k < i; k++) {
                line.append('#');
            }
            staircase.add(line.toString());
        }
        return staircase;
    }
}
