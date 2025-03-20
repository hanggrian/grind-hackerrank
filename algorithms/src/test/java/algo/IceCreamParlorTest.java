package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class IceCreamParlorTest {
    @Test
    public void edgeCases() {
        assertThat(IceCreamParlor.icecreamParlor(0, null))
            .isEmpty();
        assertThat(IceCreamParlor.icecreamParlor(-1, Collections.singletonList(0)))
            .isEmpty();
    }

    @Test
    public void testCase0() {
        assertIn(4, Arrays.asList(1, 4, 5, 3, 2), 1, 4);
        assertIn(4, Arrays.asList(2, 2, 4, 3), 1, 2);
    }

    @Test
    public void testCase3() {
        assertIn(9, Arrays.asList(1, 3, 4, 6, 7, 9), 2, 4);
        assertIn(8, Arrays.asList(1, 3, 4, 4, 6, 8), 3, 4);
        assertIn(3, Arrays.asList(1, 2), 1, 2);
    }

    private static void assertIn(
        final int m,
        final List<Integer> arr,
        final int... results
    ) {
        assertThat(IceCreamParlor.icecreamParlor(m, arr))
            .containsExactlyElementsIn(Arrays.stream(results).boxed().collect(Collectors.toList()))
            .inOrder();
    }
}
