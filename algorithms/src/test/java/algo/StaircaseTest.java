package algo;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class StaircaseTest {
    @Test
    public void edgeCases() {
        assertThat(Staircase.staircase(-1))
            .isEmpty();
    }

    @Test
    public void example() {
        assertIn(
            4,
            "   #",
            "  ##",
            " ###",
            "####"
        );
    }

    @Test
    public void testCase1() {
        assertIn(
            6,
            "     #",
            "    ##",
            "   ###",
            "  ####",
            " #####",
            "######"
        );
    }

    private static void assertIn(final int n, final String... results) {
        assertThat(Staircase.staircase(n))
            .containsExactlyElementsIn(results)
            .inOrder();
    }
}
