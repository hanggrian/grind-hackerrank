package ds;

import java.util.List;

final class ArrayManipulation {
    private ArrayManipulation() {}

    static long arrayManipulation(final int n, final List<List<Integer>> queries) {
        if (queries == null) {
            return 0;
        }

        final long[] arr = new long[n + 2];
        for (final List<Integer> query : queries) {
            final int a = query.get(0);
            final int b = query.get(1);
            final int k = query.get(2);
            arr[a] += k;
            arr[b + 1] -= k;
        }

        long maxValue = 0;
        long currentSum = 0;
        for (int i = 1; i <= n; i++) {
            currentSum += arr[i];
            maxValue = Math.max(maxValue, currentSum);
        }
        return maxValue;
    }
}
