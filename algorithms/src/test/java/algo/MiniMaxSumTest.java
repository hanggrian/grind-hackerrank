package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class MiniMaxSumTest {
    @Test
    public void edgeCases() {
        assertThat(MiniMaxSum.miniMaxSum(null))
            .isEmpty();
        assertThat(MiniMaxSum.miniMaxSum(Collections.emptyList()))
            .isEmpty();
    }

    @Test
    public void example() {
        assertIn(Arrays.asList(1, 3, 5, 7, 9), 16, 24);
    }

    @Test
    public void testCase0() {
        assertIn(Arrays.asList(1, 2, 3, 4, 5), 10, 14);
    }

    @Test
    public void testCase14() {
        assertIn(Arrays.asList(7, 69, 2, 221, 8974), 299, 9271);
    }

    private static void assertIn(final List<Integer> arr, final long result1, final long result2) {
        assertThat(MiniMaxSum.miniMaxSum(arr))
            .containsExactly(result1, result2)
            .inOrder();
    }
}
