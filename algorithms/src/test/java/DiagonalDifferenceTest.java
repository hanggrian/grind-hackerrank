import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class DiagonalDifferenceTest {
    @Test
    public void edgeCases() {
        assertThat(DiagonalDifference.diagonalDifference(null))
            .isEqualTo(0);
        assertThat(DiagonalDifference.diagonalDifference(Collections.emptyList()))
            .isEqualTo(0);
        assertThat(
            DiagonalDifference.diagonalDifference(
                Collections.singletonList(
                    Arrays.asList(1, 2)
                )
            )
        ).isEqualTo(0);
    }

    @Test
    public void samples() {
        assertThat(
            DiagonalDifference.diagonalDifference(
                Arrays.asList(
                    Arrays.asList(1, 2, 3),
                    Arrays.asList(4, 5, 6),
                    Arrays.asList(9, 8, 9)
                )
            )
        ).isEqualTo(2);
    }
}
