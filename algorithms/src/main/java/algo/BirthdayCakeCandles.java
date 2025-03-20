package algo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class BirthdayCakeCandles {
    private BirthdayCakeCandles() {}

    static int birthdayCakeCandles(final List<Integer> candles) {
        if (candles == null || candles.isEmpty()) {
            return 0;
        }

        final Map<Integer, Integer> heights = new HashMap<>();
        candles.forEach(i -> {
            heights.putIfAbsent(i, 0);
            heights.put(i, heights.get(i) + 1);
        });
        return heights.values().stream().max(Integer::compare).get();
    }
}
