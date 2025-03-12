import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class PlusMinusTest {
    @Test
    public void edgeCases() {
        assertThat(PlusMinus.plusMinus(null))
            .isNull();
        assertThat(PlusMinus.plusMinus(Collections.emptyList()))
            .isNull();
    }

    @Test
    public void samples() {
        assertThat(PlusMinus.plusMinus(Arrays.asList(1, 1, 0, -1, -1)))
            .containsExactly(
                "0.400000",
                "0.400000",
                "0.200000"
            ).inOrder();

        assertThat(PlusMinus.plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1)))
            .containsExactly(
                "0.500000",
                "0.333333",
                "0.166667"
            ).inOrder();
    }
}
