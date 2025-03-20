package ds;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class ArraysDsTest {
    @Test
    public void edgeCases() {
        assertThat(ArraysDs.reverseArray(null))
            .isEmpty();
        assertThat(ArraysDs.reverseArray(Collections.emptyList()))
            .isEmpty();
    }

    @Test
    public void example() {
        assertIn(Arrays.asList(1, 2, 3), 3, 2, 1);
    }

    @Test
    public void testCase8() {
        assertIn(Arrays.asList(1, 4, 3, 2), 2, 3, 4, 1);
    }

    private static void assertIn(final List<Integer> a, final int... results) {
        assertThat(ArraysDs.reverseArray(a))
            .containsExactlyElementsIn(Arrays.stream(results).boxed().collect(Collectors.toList()))
            .inOrder();
    }
}
