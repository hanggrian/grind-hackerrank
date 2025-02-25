import org.junit.Test;

import static com.google.common.truth.Truth.assertWithMessage;

public class JavaOutputFormattingTest {
    @Test
    public void test() {
        String s =
            "java 100\n"
                + "cpp 65\n"
                + "python 50";
        assertWithMessage(s)
            .that(new JavaOutputFormatting(s).prints)
            .containsExactly(
                "================================",
                "java           100",
                "cpp            065",
                "python         050",
                "================================"
            );

        s =
            "hello 0\n"
                + "hackerrank 65\n"
                + "java 10";
        assertWithMessage(s)
            .that(new JavaOutputFormatting(s).prints)
            .containsExactly(
                "================================",
                "hello          000",
                "hackerrank     065",
                "java           010",
                "================================"
            );
    }
}
