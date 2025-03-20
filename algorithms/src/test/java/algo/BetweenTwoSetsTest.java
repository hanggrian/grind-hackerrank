package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class BetweenTwoSetsTest {
    @Test
    public void edgeCases() {
        assertThat(BetweenTwoSets.getTotalX(null, null))
            .isEqualTo(0);
        assertThat(BetweenTwoSets.getTotalX(Collections.emptyList(), Collections.emptyList()))
            .isEqualTo(0);
    }

    @Test
    public void example() {
        assertIn(
            Arrays.asList(2, 6),
            Arrays.asList(24, 36),
            2
        );
    }

    @Test
    public void testCase0() {
        assertIn(
            Arrays.asList(2, 4),
            Arrays.asList(16, 32, 96),
            3
        );
    }

    @Test
    public void testCase8() {
        assertIn(
            Arrays.asList(3, 4),
            Arrays.asList(24, 48),
            2
        );
    }

    private static void assertIn(final List<Integer> a, final List<Integer> b, final int result) {
        assertThat(BetweenTwoSets.getTotalX(a, b))
            .isEqualTo(result);
    }
}
