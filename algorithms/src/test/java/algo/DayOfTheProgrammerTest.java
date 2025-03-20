package algo;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class DayOfTheProgrammerTest {
    @Test
    public void edgeCases() {
        assertThat(DayOfTheProgrammer.dayOfProgrammer(-1))
            .isNull();
    }

    @Test
    public void testCase0() {
        assertIs(2017, "13.09.2017");
    }

    @Test
    public void testCase1() {
        assertIs(2016, "12.09.2016");
    }

    @Test
    public void testCase60() {
        assertIs(1800, "12.09.1800");
    }

    private static void assertIs(final int year, final String result) {
        assertThat(DayOfTheProgrammer.dayOfProgrammer(year))
            .isEqualTo(result);
    }
}
