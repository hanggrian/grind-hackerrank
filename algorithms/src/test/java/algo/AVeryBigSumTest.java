package algo;

import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class AVeryBigSumTest {
    @Test
    public void edgeCases() {
        assertThat(AVeryBigSum.aVeryBigSum(null))
            .isEqualTo(0);
        assertThat(AVeryBigSum.aVeryBigSum(Collections.emptyList()))
            .isEqualTo(0);
    }

    @Test
    public void testCase0() {
        assertThat(
            AVeryBigSum.aVeryBigSum(
                Arrays.asList(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L)
            )
        ).isEqualTo(5000000015L);
    }
}
