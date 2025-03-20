package algo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class MigratoryBirds {
    private MigratoryBirds() {}

    static int migratoryBirds(final List<Integer> arr) {
        if (arr == null || arr.isEmpty()) {
            return 0;
        }

        final Map<Integer, Integer> counts = new HashMap<>();
        arr.forEach(i -> {
            counts.putIfAbsent(i, 0);
            counts.put(i, counts.get(i) + 1);
        });
        final int max = counts.values().stream().mapToInt(value -> value).max().getAsInt();
        return counts
            .keySet()
            .stream()
            .filter(i -> counts.get(i) == max)
            .findFirst()
            .get()
            .intValue();
    }
}
