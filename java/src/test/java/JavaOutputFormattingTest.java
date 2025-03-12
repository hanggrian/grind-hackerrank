import org.junit.Test;

import static com.google.common.truth.Truth.assertWithMessage;

public final class JavaOutputFormattingTest {
    @Test
    public void samples() {
        String s =
            "java 100\n"
                + "cpp 65\n"
                + "python 50";
        assertWithMessage(s)
            .that(new JavaOutputFormatting(s).getResult())
            .isEqualTo(
                "================================\n"
                    + "java           100\n"
                    + "cpp            065\n"
                    + "python         050\n"
                    + "================================\n"
            );

        s =
            "hello 0\n"
                + "hackerrank 65\n"
                + "java 10";
        assertWithMessage(s)
            .that(new JavaOutputFormatting(s).getResult())
            .isEqualTo(
                "================================\n"
                    + "hello          000\n"
                    + "hackerrank     065\n"
                    + "java           010\n"
                    + "================================\n"
            );
    }
}
