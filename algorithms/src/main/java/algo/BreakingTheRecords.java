package algo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class BreakingTheRecords {
    private BreakingTheRecords() {}

    static Collection<Integer> breakingRecords(final List<Integer> scores) {
        if (scores == null || scores.isEmpty()) {
            return Collections.emptyList();
        }

        int highestScore = scores.get(0);
        int lowestScore = highestScore;
        int minCount = 0;
        int maxCount = 0;
        for (int i = 1; i < scores.size(); i++) {
            final int currentScore = scores.get(i);
            if (currentScore < lowestScore) {
                minCount++;
                lowestScore = currentScore;
                continue;
            }
            if (currentScore <= highestScore) {
                continue;
            }
            maxCount++;
            highestScore = currentScore;
        }
        return Arrays.asList(maxCount, minCount);
    }
}
