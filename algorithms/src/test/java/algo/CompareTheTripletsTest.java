package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class CompareTheTripletsTest {
    @Test
    public void edgeCases() {
        assertThat(CompareTheTriplets.rotateLeft(Collections.singletonList(1), null))
            .isEmpty();
        assertThat(CompareTheTriplets.rotateLeft(null, Collections.singletonList(1)))
            .isEmpty();
        assertThat(
            CompareTheTriplets.rotateLeft(
                Collections.singletonList(1),
                Arrays.asList(1, 2)
            )
        ).isEmpty();
        assertThat(
            CompareTheTriplets.rotateLeft(
                Collections.emptyList(),
                Collections.emptyList()
            )
        ).containsExactly(0, 0)
            .inOrder();
    }

    @Test
    public void example() {
        assertIn(Arrays.asList(1, 2, 3), Arrays.asList(3, 2, 1), 1, 1);
    }

    @Test
    public void testCase0() {
        assertIn(Arrays.asList(5, 6, 7), Arrays.asList(3, 6, 10), 1, 1);
    }

    @Test
    public void testCase7() {
        assertIn(Arrays.asList(17, 28, 30), Arrays.asList(99, 16, 8), 2, 1);
    }

    private static void assertIn(
        final List<Integer> a,
        final List<Integer> b,
        final int... results
    ) {
        assertThat(CompareTheTriplets.rotateLeft(a, b))
            .containsExactlyElementsIn(Arrays.stream(results).boxed().collect(Collectors.toList()))
            .inOrder();
    }
}
