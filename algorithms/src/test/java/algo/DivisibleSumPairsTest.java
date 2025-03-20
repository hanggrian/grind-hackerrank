package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class DivisibleSumPairsTest {
    @Test
    public void edgeCases() {
        assertThat(DivisibleSumPairs.divisibleSumPairs(1, 1, null))
            .isEqualTo(0);
        assertThat(DivisibleSumPairs.divisibleSumPairs(1, 1, Collections.emptyList()))
            .isEqualTo(0);
        assertThat(DivisibleSumPairs.divisibleSumPairs(0, 1, Collections.singletonList(1)))
            .isEqualTo(0);
        assertThat(DivisibleSumPairs.divisibleSumPairs(1, 0, Collections.singletonList(1)))
            .isEqualTo(0);
    }

    @Test
    public void example() {
        assertIs(6, 5, Arrays.asList(1, 2, 3, 4, 5, 6), 3);
    }

    @Test
    public void testCase0() {
        assertIs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2), 5);
    }

    private static void assertIs(
        final int n,
        final int k,
        final List<Integer> ar,
        final int result
    ) {
        assertThat(DivisibleSumPairs.divisibleSumPairs(n, k, ar))
            .isEqualTo(result);
    }
}
