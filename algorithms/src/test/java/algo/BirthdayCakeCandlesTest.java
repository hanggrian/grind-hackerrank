package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class BirthdayCakeCandlesTest {
    @Test
    public void edgeCases() {
        assertThat(BirthdayCakeCandles.birthdayCakeCandles(null))
            .isEqualTo(0);
        assertThat(BirthdayCakeCandles.birthdayCakeCandles(Collections.emptyList()))
            .isEqualTo(0);
    }

    @Test
    public void example() {
        assertIs(Arrays.asList(4, 4, 1, 3), 2);
    }

    @Test
    public void testCase0() {
        assertIs(Arrays.asList(3, 2, 1, 3), 2);
    }

    private static void assertIs(final List<Integer> candles, final int result) {
        assertThat(BirthdayCakeCandles.birthdayCakeCandles(candles))
            .isEqualTo(result);
    }
}
