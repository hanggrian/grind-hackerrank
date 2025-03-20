package ds;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class DynamicArrayTest {
    @Test
    public void edgeCases() {
        assertThat(DynamicArray.dynamicArray(0, null))
            .isEmpty();
        assertThat(DynamicArray.dynamicArray(0, Collections.emptyList()))
            .isEmpty();
        assertThat(DynamicArray.dynamicArray(-1, Collections.singletonList(Arrays.asList(1, 2, 3))))
            .isEmpty();
    }

    @Test
    public void testCase10() {
        assertIn(
            2,
            Arrays.asList(
                Arrays.asList(1, 0, 5),
                Arrays.asList(1, 1, 7),
                Arrays.asList(1, 0, 3),
                Arrays.asList(2, 1, 0),
                Arrays.asList(2, 1, 1)
            ),
            7,
            3
        );
    }

    private static void assertIn(
        final int n,
        final List<List<Integer>> queries,
        final int... results
    ) {
        assertThat(DynamicArray.dynamicArray(n, queries))
            .containsExactlyElementsIn(Arrays.stream(results).boxed().collect(Collectors.toList()))
            .inOrder();
    }
}
