package algo;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class SolveMeFirstTest {
    @Test
    public void example() {
        assertIs(7, 3, 10);
    }

    @Test
    public void testCase0() {
        assertIs(2, 3, 5);
    }

    @Test
    public void testCase1() {
        assertIs(100, 1000, 1100);
    }

    private static void assertIs(final int a, final int b, final int result) {
        assertThat(SolveMeFirst.solveMeFirst(a, b))
            .isEqualTo(result);
    }
}
