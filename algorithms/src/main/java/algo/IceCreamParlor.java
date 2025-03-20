package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class IceCreamParlor {
    private IceCreamParlor() {}

    static List<Integer> icecreamParlor(final int m, final List<Integer> arr) {
        if (arr == null || m < 0) {
            return Collections.emptyList();
        }

        final Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            final int num = arr.get(i);
            if (indices.containsKey(num)) {
                return Arrays.asList(indices.get(num) + 1, i + 1);
            }
            indices.put(m - num, i);
        }
        return Collections.emptyList();
    }
}
