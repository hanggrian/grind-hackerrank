package algo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class AppleAndOrange {
    private AppleAndOrange() {}

    static Collection<Long> countApplesAndOranges(
        final int s,
        final int t,
        final int a,
        final int b,
        final List<Integer> apples,
        final List<Integer> oranges
    ) {
        return s < 0
            || t < 0
            || a < 0
            || b < 0
            || apples == null
            || apples.isEmpty()
            || oranges == null
            || oranges.isEmpty()
            ? Collections.emptyList()
            : Arrays.asList(
            apples
                .stream()
                .filter(apple -> {
                    final int drop = a + apple;
                    return s <= drop && drop <= t;
                }).count(),
            oranges
                .stream()
                .filter(orange -> {
                    final int drop = b + orange;
                    return s <= drop && drop <= t;
                }).count()
        );
    }
}
