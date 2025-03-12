import java.util.Arrays;
import java.util.List;

final class CompareTheTriplets {
    private CompareTheTriplets() {}

    static List<Integer> rotateLeft(final List<Integer> a, final List<Integer> b) {
        if (a == null || b == null || a.size() != b.size()) {
            return null;
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
