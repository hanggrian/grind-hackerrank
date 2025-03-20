package ds;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class TwoDArrayDsTest {
    @Test
    public void edgeCases() {
        assertThat(TwoDArrayDs.hourglassSum(null))
            .isEqualTo(0);
        assertThat(TwoDArrayDs.hourglassSum(Collections.emptyList()))
            .isEqualTo(0);
    }

    @Test
    public void testCase0() {
        assertIs(
            Arrays.asList(
                Arrays.asList(1, 1, 1, 0, 0, 0),
                Arrays.asList(0, 1, 0, 0, 0, 0),
                Arrays.asList(1, 1, 1, 0, 0, 0),
                Arrays.asList(0, 0, 2, 4, 4, 0),
                Arrays.asList(0, 0, 0, 2, 0, 0),
                Arrays.asList(0, 0, 1, 2, 4, 0)
            ),
            19
        );
    }

    @Test
    public void testCase1() {
        assertIs(
            Arrays.asList(
                Arrays.asList(1, 1, 1, 0, 0, 0),
                Arrays.asList(0, 1, 0, 0, 0, 0),
                Arrays.asList(1, 1, 1, 0, 0, 0),
                Arrays.asList(0, 9, 2, -4, -4, 0),
                Arrays.asList(0, 0, 0, -2, 0, 0),
                Arrays.asList(0, 0, -1, -2, -4, 0)
            ),
            13
        );
    }

    @Test
    public void testCase8() {
        assertIs(
            Arrays.asList(
                Arrays.asList(-9, -9, -9, 1, 1, 1),
                Arrays.asList(0, -9, 0, 4, 3, 2),
                Arrays.asList(-9, -9, -9, 1, 2, 3),
                Arrays.asList(0, 0, 8, 6, 6, 0),
                Arrays.asList(0, 0, 0, -2, 0, 0),
                Arrays.asList(0, 0, 1, 2, 4, 0)
            ),
            28
        );
    }

    private static void assertIs(final List<List<Integer>> arr, final int result) {
        assertThat(TwoDArrayDs.hourglassSum(arr))
            .isEqualTo(result);
    }
}
