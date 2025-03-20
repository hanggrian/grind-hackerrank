package algo;

import java.util.List;
import java.util.stream.IntStream;

final class DivisibleSumPairs {
    private DivisibleSumPairs() {}

    static int divisibleSumPairs(final int n, final int k, final List<Integer> ar) {
        return ar == null || ar.isEmpty() || n < 0 || k < 0
            ? 0
            : IntStream
            .range(0, n - 1)
            .map(i ->
                (int) IntStream
                    .range(i + 1, n)
                    .filter(j -> (ar.get(i) + ar.get(j)) % k == 0)
                    .count()
            ).sum();
    }
}
