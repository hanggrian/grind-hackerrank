import org.junit.Test;

import static com.google.common.truth.Truth.assertWithMessage;

public class JavaStdinStdout2Test {
    @Test
    public void test() {
        String s =
            "42\n"
                + "3.1415\n"
                + "Welcome to HackerRank's Java tutorials!";
        assertWithMessage(s)
            .that(new JavaStdinStdout2(s).prints)
            .containsExactly(
                "String: Welcome to HackerRank's Java tutorials!",
                "Double: 3.1415",
                "Int: 42"
            );

        s =
            "100\n"
                + "42\n"
                + "42 is the answer to life, the universe, and everything!";
        assertWithMessage(s)
            .that(new JavaStdinStdout2(s).prints)
            .containsExactly(
                "String: 42 is the answer to life, the universe, and everything!",
                "Double: 42.0",
                "Int: 100"
            );
    }
}
