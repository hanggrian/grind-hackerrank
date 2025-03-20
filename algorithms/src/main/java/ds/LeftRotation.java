package ds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class LeftRotation {
    private LeftRotation() {}

    static Collection<Integer> rotateLeft(final int d, final List<Integer> arr) {
        if (arr == null || d > arr.size()) {
            return Collections.emptyList();
        }
        final List<Integer> result = new ArrayList<>(arr);
        for (int i = 0; i < d; i++) {
            result.add(arr.get(i));
            result.remove(0);
        }
        return result;
    }
}
