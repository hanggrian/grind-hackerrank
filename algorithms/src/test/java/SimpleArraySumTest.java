import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class SimpleArraySumTest {
    @Test
    public void edgeCases() {
        assertThat(SimpleArraySum.simpleArraySum(null))
            .isEqualTo(0);
        assertThat(SimpleArraySum.simpleArraySum(Collections.emptyList()))
            .isEqualTo(0);
    }

    @Test
    public void samples() {
        assertThat(SimpleArraySum.simpleArraySum(Arrays.asList(1, 2, 3)))
            .isEqualTo(6);

        assertThat(SimpleArraySum.simpleArraySum(Arrays.asList(1, 2, 3, 4, 10, 11)))
            .isEqualTo(31);
    }
}
