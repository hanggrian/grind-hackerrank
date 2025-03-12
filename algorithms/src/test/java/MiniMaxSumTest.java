import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class MiniMaxSumTest {
    @Test
    public void edgeCases() {
        assertThat(MiniMaxSum.miniMaxSum(null))
            .isNull();
        assertThat(MiniMaxSum.miniMaxSum(Collections.emptyList()))
            .isNull();
    }

    @Test
    public void samples() {
        assertThat(MiniMaxSum.miniMaxSum(Arrays.asList(1, 3, 5, 7, 9)))
            .containsExactly(16, 24)
            .inOrder();

        assertThat(MiniMaxSum.miniMaxSum(Arrays.asList(1, 2, 3, 4, 5)))
            .containsExactly(10, 14)
            .inOrder();
    }
}
