package ds;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class BalancedBracketsTest {
    @Test
    public void edgeCases() {
        assertThat(BalancedBrackets.isBalanced(null))
            .isFalse();
    }

    @Test
    public void testCase18() {
        assertIs("{[()]}", true);
        assertIs("{[(])}", false);
        assertIs("{{[[(())]]}}", true);
    }

    @Test
    public void testCase19() {
        assertIs("{{([])}}", true);
        assertIs("{{)[](}}", false);
    }

    @Test
    public void testCase20() {
        assertIs("{(([])[])[]}", true);
        assertIs("{(([])[])[]]}", false);
        assertIs("{(([])[])[]}[]", true);
    }

    private static void assertIs(final String s, final boolean result) {
        assertThat(BalancedBrackets.isBalanced(s))
            .isEqualTo(result);
    }
}
