package ds;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

final class SparseArrays {
    private SparseArrays() {}

    static Collection<Integer> matchingStrings(
        final List<String> stringList,
        final List<String> queries
    ) {
        if (stringList == null || queries == null) {
            return Collections.emptyList();
        }

        final Map<String, Integer> counts = new HashMap<>();
        stringList.forEach(s -> {
            counts.putIfAbsent(s, 0);
            counts.put(s, counts.get(s) + 1);
        });
        return queries
            .stream()
            .map(s -> counts.getOrDefault(s, 0))
            .collect(Collectors.toList());
    }
}
