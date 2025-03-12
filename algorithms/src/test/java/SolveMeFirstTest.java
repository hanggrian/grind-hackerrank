import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class SolveMeFirstTest {
    @Test
    public void test() {
        assertThat(SolveMeFirst.solveMeFirst(7, 3))
            .isEqualTo(10);

        assertThat(SolveMeFirst.solveMeFirst(2, 3))
            .isEqualTo(5);
    }
}
