package algo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class MiniMaxSum {
    private MiniMaxSum() {}

    static Collection<Long> miniMaxSum(final List<Integer> arr) {
        if (arr == null || arr.isEmpty()) {
            return Collections.emptyList();
        }

        long total = 0;
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        for (final int i : arr) {
            total += i;
            minimum = Math.min(minimum, i);
            maximum = Math.max(maximum, i);
        }
        return Arrays.asList(
            total - maximum,
            total - minimum
        );
    }
}
