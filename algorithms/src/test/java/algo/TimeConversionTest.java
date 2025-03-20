package algo;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class TimeConversionTest {
    @Test
    public void edgeCases() {
        assertThat(TimeConversion.timeConversion(null))
            .isNull();
        assertThat(TimeConversion.timeConversion(""))
            .isNull();
        assertThat(TimeConversion.timeConversion("12:01:00"))
            .isNull();
    }

    @Test
    public void example() {
        assertIs("12:01:00PM", "12:01:00");
        assertIs("12:01:00AM", "00:01:00");
    }

    @Test
    public void testCase0() {
        assertIs("07:05:45PM", "19:05:45");
    }

    private static void assertIs(final String s, final String result) {
        assertThat(TimeConversion.timeConversion(s))
            .isEqualTo(result);
    }
}
