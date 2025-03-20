package algo;

import java.util.List;

final class BetweenTwoSets {
    private BetweenTwoSets() {}

    static int getTotalX(final List<Integer> a, final List<Integer> b) {
        if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
            return 0;
        }

        final int max = a.stream().mapToInt(value -> value).max().getAsInt();
        final int min = b.stream().mapToInt(value -> value).min().getAsInt();
        int count = 0;

        for (int i = max; i <= min; i++) {
            final int factor = i;
            if (!a.stream().allMatch(j -> factor % j == 0)) {
                continue;
            }
            if (!b.stream().allMatch(j -> j % factor == 0)) {
                continue;
            }
            count++;
        }
        return count;
    }
}
