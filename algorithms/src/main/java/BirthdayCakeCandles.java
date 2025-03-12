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
        for (int i : candles) {
            if (heights.containsKey(i)) {
                heights.put(i, heights.get(i) + 1);
            } else {
                heights.put(i, 1);
            }
        }
        return heights.values().stream().max(Integer::compare).get();
    }
}
