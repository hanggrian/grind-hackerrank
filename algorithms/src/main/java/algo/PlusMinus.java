package algo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class PlusMinus {
    private PlusMinus() {}

    static Collection<String> plusMinus(final List<Integer> arr) {
        if (arr == null || arr.isEmpty()) {
            return Collections.emptyList();
        }

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (final int i : arr) {
            if (i > 0) {
                positiveCount++;
            } else if (i < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        final int n = arr.size();
        return Arrays.asList(
            String.format("%.6f", (double) positiveCount / n),
            String.format("%.6f", (double) negativeCount / n),
            String.format("%.6f", (double) zeroCount / n)
        );
    }
}
