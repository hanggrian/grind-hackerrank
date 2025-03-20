package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class DiagonalDifferenceTest {
    @Test
    public void edgeCases() {
        assertThat(DiagonalDifference.diagonalDifference(null))
            .isEqualTo(0);
        assertThat(DiagonalDifference.diagonalDifference(Collections.emptyList()))
            .isEqualTo(0);
        assertThat(
            DiagonalDifference.diagonalDifference(
                Collections.singletonList(
                    Arrays.asList(1, 2)
                )
            )
        ).isEqualTo(0);
    }

    @Test
    public void example() {
        assertIs(
            Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(9, 8, 9)
            ),
            2
        );
    }

    @Test
    public void testCase0() {
        assertIs(
            Arrays.asList(
                Arrays.asList(11, 2, 4),
                Arrays.asList(4, 5, 6),
                Arrays.asList(10, 8, -12)
            ),
            15
        );
    }

    private static void assertIs(final List<List<Integer>> arr, final int result) {
        assertThat(DiagonalDifference.diagonalDifference(arr))
            .isEqualTo(result);
    }
}
