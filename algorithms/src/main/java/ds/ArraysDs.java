package ds;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class ArraysDs {
    private ArraysDs() {}

    static Collection<Integer> reverseArray(final List<Integer> a) {
        if (a == null || a.isEmpty()) {
            return Collections.emptyList();
        }
        Collections.reverse(a);
        return a;
    }
}
