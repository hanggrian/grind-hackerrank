package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class BreakingTheRecordsTest {
    @Test
    public void edgeCases() {
        assertThat(BreakingTheRecords.breakingRecords(null))
            .isEmpty();
        assertThat(BreakingTheRecords.breakingRecords(Collections.emptyList()))
            .isEmpty();
    }

    @Test
    public void example() {
        assertIn(Arrays.asList(12, 24, 10, 24), 1, 1);
    }

    @Test
    public void testCase0() {
        assertIn(Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1), 2, 4);
    }

    @Test
    public void testCase1() {
        assertIn(Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42), 4, 0);
    }

    private static void assertIn(final List<Integer> scores, final int... results) {
        assertThat(BreakingTheRecords.breakingRecords(scores))
            .containsExactlyElementsIn(Arrays.stream(results).boxed().collect(Collectors.toList()))
            .inOrder();
    }
}
