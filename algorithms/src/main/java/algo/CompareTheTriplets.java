package algo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class CompareTheTriplets {
    private CompareTheTriplets() {}

    static Collection<Integer> rotateLeft(final List<Integer> a, final List<Integer> b) {
        if (a == null || b == null || a.size() != b.size()) {
            return Collections.emptyList();
        }

        int aPoints = 0;
        int bPoints = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aPoints++;
            } else if (a.get(i) < b.get(i)) {
                bPoints++;
            }
        }
        return Arrays.asList(aPoints, bPoints);
    }
}
