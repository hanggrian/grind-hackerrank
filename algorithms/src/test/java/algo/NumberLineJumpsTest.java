package algo;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class NumberLineJumpsTest {
    @Test
    public void edgeCases() {
        assertThat(
            NumberLineJumps.kangaroo(
                0,
                0,
                0,
                0
            )
        ).isFalse();
        assertThat(
            NumberLineJumps.kangaroo(
                -1,
                -1,
                -1,
                -1
            )
        ).isFalse();
    }

    @Test
    public void testCase0() {
        assertIs(0, 3, 4, 2, true);
    }

    @Test
    public void testCase1() {
        assertIs(0, 2, 5, 3, false);
    }

    private static void assertIs(
        final int x1,
        final int v1,
        final int x2,
        final int v2,
        final boolean result
    ) {
        assertThat(NumberLineJumps.kangaroo(x1, v1, x2, v2))
            .isEqualTo(result);
    }
}
