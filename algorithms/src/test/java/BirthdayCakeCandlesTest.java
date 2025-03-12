import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class BirthdayCakeCandlesTest {
    @Test
    public void edgeCases() {
        assertThat(BirthdayCakeCandles.birthdayCakeCandles(null))
            .isEqualTo(0);
        assertThat(BirthdayCakeCandles.birthdayCakeCandles(Collections.emptyList()))
            .isEqualTo(0);
    }

    @Test
    public void samples() {
        assertThat(BirthdayCakeCandles.birthdayCakeCandles(Arrays.asList(4, 4, 1, 3)))
            .isEqualTo(2);

        assertThat(BirthdayCakeCandles.birthdayCakeCandles(Arrays.asList(3, 2, 1, 3)))
            .isEqualTo(2);
    }
}
