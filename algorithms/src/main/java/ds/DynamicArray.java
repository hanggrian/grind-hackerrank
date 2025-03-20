package ds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class DynamicArray {
    private DynamicArray() {}

    static Collection<Integer> dynamicArray(final int n, final List<List<Integer>> queries) {
        if (n < 0 || queries == null || queries.isEmpty()) {
            return Collections.emptyList();
        }

        final List<List<Integer>> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        final List<Integer> result = new ArrayList<>();
        int lastAnswer = 0;
        for (final List<Integer> query : queries) {
            final int x = query.get(1);
            final int y = query.get(2);
            final int idx = (x ^ lastAnswer) % n;
            if (query.get(0) == 1) {
                arr.get(idx).add(y);
                continue;
            }
            lastAnswer = arr.get(idx).get(y % arr.get(idx).size());
            result.add(lastAnswer);
        }
        return result;
    }
}
