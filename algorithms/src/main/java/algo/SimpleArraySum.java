package algo;

import java.util.List;

final class SimpleArraySum {
    private SimpleArraySum() {}

    static int simpleArraySum(final List<Integer> ar) {
        return ar == null
            ? 0
            : ar.stream().mapToInt(Integer::intValue).sum();
    }
}
