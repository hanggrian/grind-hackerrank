package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class MigratoryBirdsTest {
    @Test
    public void edgeCases() {
        assertThat(MigratoryBirds.migratoryBirds(null))
            .isEqualTo(0);
        assertThat(MigratoryBirds.migratoryBirds(Collections.emptyList()))
            .isEqualTo(0);
    }

    @Test
    public void example() {
        assertIs(Arrays.asList(1, 1, 2, 2, 3), 1);
    }

    @Test
    public void testCase0() {
        assertIs(Arrays.asList(1, 4, 4, 4, 5, 3), 4);
    }

    @Test
    public void testCase1() {
        assertIs(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4), 3);
    }

    private static void assertIs(final List<Integer> arr, final int result) {
        assertThat(MigratoryBirds.migratoryBirds(arr))
            .isEqualTo(result);
    }
}
