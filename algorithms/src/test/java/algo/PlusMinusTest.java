package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class PlusMinusTest {
    @Test
    public void edgeCases() {
        assertThat(PlusMinus.plusMinus(null))
            .isEmpty();
        assertThat(PlusMinus.plusMinus(Collections.emptyList()))
            .isEmpty();
    }

    @Test
    public void example() {
        assertIn(
            Arrays.asList(1, 1, 0, -1, -1),
            "0.400000",
            "0.400000",
            "0.200000"
        );
    }

    @Test
    public void testCase1() {
        assertIn(
            Arrays.asList(-4, 3, -9, 0, 4, 1),
            "0.500000",
            "0.333333",
            "0.166667"
        );
    }

    private static void assertIn(final List<Integer> arr, final String... results) {
        assertThat(PlusMinus.plusMinus(arr))
            .containsExactlyElementsIn(results)
            .inOrder();
    }
}
