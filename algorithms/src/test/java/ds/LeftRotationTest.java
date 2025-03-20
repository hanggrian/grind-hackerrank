package ds;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class LeftRotationTest {
    @Test
    public void edgeCases() {
        assertThat(LeftRotation.rotateLeft(0, null))
            .isEmpty();
        assertThat(LeftRotation.rotateLeft(1, Collections.emptyList()))
            .isEmpty();
    }

    @Test
    public void example() {
        assertIn(2, Arrays.asList(1, 2, 3, 4, 5), 3, 4, 5, 1, 2);
    }

    @Test
    public void testCase0() {
        assertIn(4, Arrays.asList(1, 2, 3, 4, 5), 5, 1, 2, 3, 4);
    }

    private static void assertIn(final int d, final List<Integer> arr, final int... results) {
        assertThat(LeftRotation.rotateLeft(d, arr))
            .containsExactlyElementsIn(Arrays.stream(results).boxed().collect(Collectors.toList()))
            .inOrder();
    }
}
