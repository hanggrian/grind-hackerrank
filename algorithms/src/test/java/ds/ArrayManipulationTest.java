package ds;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class ArrayManipulationTest {
    @Test
    public void edgeCases() {
        assertThat(ArrayManipulation.arrayManipulation(0, null))
            .isEqualTo(0);
        assertThat(ArrayManipulation.arrayManipulation(0, Collections.emptyList()))
            .isEqualTo(0);
    }

    @Test
    public void testCase0() {
        assertIs(
            5,
            Arrays.asList(
                Arrays.asList(1, 2, 100),
                Arrays.asList(2, 5, 100),
                Arrays.asList(3, 4, 100)
            ),
            200
        );
    }

    @Test
    public void testCase14() {
        assertIs(
            10,
            Arrays.asList(
                Arrays.asList(1, 5, 3),
                Arrays.asList(4, 8, 7),
                Arrays.asList(6, 9, 1)
            ),
            10
        );
    }

    @Test
    public void testCase15() {
        assertIs(
            10,
            Arrays.asList(
                Arrays.asList(2, 6, 8),
                Arrays.asList(3, 5, 7),
                Arrays.asList(1, 8, 1),
                Arrays.asList(5, 9, 15)
            ),
            31
        );
    }

    private static void assertIs(
        final int n,
        final List<List<Integer>> queries,
        final long result
    ) {
        assertThat(ArrayManipulation.arrayManipulation(n, queries))
            .isEqualTo(result);
    }
}
