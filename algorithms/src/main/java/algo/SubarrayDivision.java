package algo;

import java.util.List;
import java.util.stream.IntStream;

final class SubarrayDivision {
    private SubarrayDivision() {}

    static int birthday(final List<Integer> s, final int d, final int m) {
        return s == null || s.isEmpty() || d < 0 || m <= 0
            ? 0
            : (int) IntStream
            .rangeClosed(0, s.size() - m)
            .filter(i -> s.subList(i, i + m).stream().mapToInt(value -> value).sum() == d)
            .count();
    }
}
