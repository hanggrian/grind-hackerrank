import org.junit.Test;

import static com.google.common.truth.Truth.assertWithMessage;

public final class JavaStdinStdout2Test {
    @Test
    public void samples() {
        String s =
            "42\n"
                + "3.1415\n"
                + "Welcome to HackerRank's Java tutorials!";
        assertWithMessage(s)
            .that(new JavaStdinStdout2(s).getResult())
            .isEqualTo(
                "String: Welcome to HackerRank's Java tutorials!\n"
                    + "Double: 3.1415\n"
                    + "Int: 42\n"
            );

        s =
            "100\n"
                + "42\n"
                + "42 is the answer to life, the universe, and everything!";
        assertWithMessage(s)
            .that(new JavaStdinStdout2(s).getResult())
            .isEqualTo(
                "String: 42 is the answer to life, the universe, and everything!\n"
                    + "Double: 42.0\n"
                    + "Int: 100\n"
            );
    }
}
