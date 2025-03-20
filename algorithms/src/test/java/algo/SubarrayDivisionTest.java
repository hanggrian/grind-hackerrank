package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class SubarrayDivisionTest {
    @Test
    public void edgeCases() {
        assertThat(SubarrayDivision.birthday(null, 0, 1))
            .isEqualTo(0);
        assertThat(SubarrayDivision.birthday(Collections.emptyList(), 0, 1))
            .isEqualTo(0);
        assertThat(SubarrayDivision.birthday(Collections.singletonList(1), -1, 1))
            .isEqualTo(0);
        assertThat(SubarrayDivision.birthday(Collections.singletonList(1), 0, 0))
            .isEqualTo(0);
    }

    @Test
    public void example() {
        assertIn(Arrays.asList(2, 2, 1, 3, 2), 4, 2, 2);
    }

    @Test
    public void testCase0() {
        assertIn(Arrays.asList(1, 2, 1, 3, 2), 3, 2, 2);
    }

    @Test
    public void testCase1() {
        assertIn(Arrays.asList(1, 1, 1, 1, 1, 1), 3, 2, 0);
    }

    @Test
    public void testCase2() {
        assertIn(Collections.singletonList(4), 4, 1, 1);
    }

    private static void assertIn(
        final List<Integer> s,
        final int d,
        final int m,
        final int result
    ) {
        assertThat(SubarrayDivision.birthday(s, d, m))
            .isEqualTo(result);
    }
}
