package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class SimpleArraySumTest {
    @Test
    public void edgeCases() {
        assertThat(SimpleArraySum.simpleArraySum(null))
            .isEqualTo(0);
        assertThat(SimpleArraySum.simpleArraySum(Collections.emptyList()))
            .isEqualTo(0);
    }

    @Test
    public void example() {
        assertIs(Arrays.asList(1, 2, 3), 6);
    }

    @Test
    public void testCase0() {
        assertIs(Arrays.asList(1, 2, 3, 4, 10, 11), 31);
    }

    private static void assertIs(final List<Integer> ar, final int result) {
        assertThat(SimpleArraySum.simpleArraySum(ar))
            .isEqualTo(result);
    }
}
