package algo;

import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class AppleAndOrangeTest {
    @Test
    public void edgeCases() {
        assertThat(
            AppleAndOrange.countApplesAndOranges(
                0,
                0,
                0,
                0,
                null,
                Collections.emptyList()
            )
        ).isEmpty();
        assertThat(
            AppleAndOrange.countApplesAndOranges(
                -1,
                -1,
                -1,
                -1,
                Collections.singletonList(1),
                Collections.singletonList(2)
            )
        ).isEmpty();
    }

    @Test
    public void testCase0() {
        assertThat(
            AppleAndOrange.countApplesAndOranges(
                7,
                11,
                5,
                15,
                Arrays.asList(-2, 2, 1),
                Arrays.asList(5, -6)
            )
        ).containsExactly(1L, 1L)
            .inOrder();
    }
}
