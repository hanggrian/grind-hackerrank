package algo;

import java.util.List;

final class AVeryBigSum {
    private AVeryBigSum() {}

    static long aVeryBigSum(final List<Long> ar) {
        return ar == null
            ? 0
            : ar.stream().mapToLong(Long::longValue).sum();
    }
}
