import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class CompareTheTripletsTest {
    @Test
    public void edgeCases() {
        assertThat(CompareTheTriplets.rotateLeft(Collections.singletonList(1), null))
            .isNull();
        assertThat(CompareTheTriplets.rotateLeft(null, Collections.singletonList(1)))
            .isNull();
        assertThat(
            CompareTheTriplets.rotateLeft(
                Collections.singletonList(1),
                Arrays.asList(1, 2)
            )
        ).isNull();
        assertThat(
            CompareTheTriplets.rotateLeft(
                Collections.emptyList(),
                Collections.emptyList()
            )
        ).containsExactly(0, 0)
            .inOrder();
    }

    @Test
    public void samples() {
        assertThat(
            CompareTheTriplets.rotateLeft(
                Arrays.asList(1, 2, 3),
                Arrays.asList(3, 2, 1)
            )
        ).containsExactly(1, 1)
            .inOrder();

        assertThat(
            CompareTheTriplets.rotateLeft(
                Arrays.asList(5, 6, 7),
                Arrays.asList(3, 6, 10)
            )
        ).containsExactly(1, 1)
            .inOrder();

        assertThat(
            CompareTheTriplets.rotateLeft(
                Arrays.asList(17, 28, 30),
                Arrays.asList(99, 16, 8)
            )
        ).containsExactly(2, 1)
            .inOrder();
    }
}
